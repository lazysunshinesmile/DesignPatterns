# DesignPatterns
## 策略模式

### 策略模式原理

#### **分别封装行为接口实现算法族，超类里面放行为接口对象，在子类里具体设定行为对象。原则就是：分离变化部分，封装接口，基于接口编程各种功能。此模式让行为算法的变化独立于算法的使用者** 

### 个人讲解：
多种类型的鸭子，不同种类的鸭子行为方式不同，比如A类鸭子呱呱叫，B类鸭子喵喵叫。为了方便扩展，将鸭子叫抽象为一个接口，具体怎么叫，由下面的实现类去实现。在鸭子的超类里面，增加一个属性就是叫的方式，具体对象在鸭子的子类里面去实现。
这就相当于各种叫法是鸭子的策略，是原理当中提到的算法，具体采用哪种算法（鸭子的叫法）是由鸭子具体子类说了算的。

## 观察者模式

使用Java内置的观察者。

**在通知观察者之前需要调用setChanged()，否则没有通知观察者**

## 装饰者模式

**动态的将新功能附加到对象上，在对象功能扩展方面，他比继承有弹性。在某些时候如果使用继承的话，会导致类爆炸。类似于n种A物品与m种B物品组合形成m\*n种类，这也就导致了类爆炸，而装饰者模式能够很好的解决这个问题**


[代码参考]([参考](https://github.com/lazysunshinesmile/DesignPatterns/tree/master/DecoratorMode)
)

### 易错点提及
- 被装饰者（咖啡）初始化函数是正常的，装饰者（配料）的初始化函数需要传入装饰者与被装饰者的共同父类（Drink）。
- 由于上一点，导致了被装饰者的方法不需要递归调用，也就意味着他们是递归调用的尽头。
```java
public class Coffee extends Drink {

    public Coffee() {
        setDescribtion("pure coffee 10");
        setPrice(10f);
    }

    @Override
    public String describe() {
        return getmDescribtion();
    }

    @Override
    public float cost() {
        return getPrice();
    }
}

```
- 装饰者由于需要递归调用，那么在初始化函数当中就要传入同类的对象。在一些方法中递归调用。如下面的describe和cost方法。
```java
public class Seasoning extends Drink {
    protected Drink mDrink;

    public Seasoning(Drink drink) {
        this.mDrink = drink;
    }


    @Override
    public String describe() {
    //本身的描述 + "&&" + 递归调用描述 
        return super.getmDescribtion() + " && " + mDrink.describe();
    }

    @Override
    public float cost() {
      //本身的价格 + "&&" + 递归调用价格
        return super.getPrice() + mDrink.cost();
    }
}

```



## 命令模式

### 命令模式类图
![命令模式类图](https://github.com/lazysunshinesmile/DesignPatterns/blob/master/CommandModel/src/image/FireShot%20Pro%20Screen%20Capture%20%23002%20-%20'Image_webp%20(531%C3%97382)'%20-%20file.png)

### 原理
将请求、命令、动作等封装成对象，这样可以让项目使用这些对象来参数化其他对象。使得命令的请求者和执行者解耦。

### 作用
命令模式的作用是把发射命令的对象和接收命令的对象分隔开来。
