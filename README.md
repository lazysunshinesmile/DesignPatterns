# DesignPatterns
- 策略模式

## 策略模式原理

#### **分别封装行为接口实现算法族，超类里面放行为接口对象，在子类里具体设定行为对象。原则就是：分离变化部分，封装接口，基于接口编程各种功能。此模式让行为算法的变化独立于算法的使用者** 

## 个人讲解：
多种类型的鸭子，不同种类的鸭子行为方式不同，比如A类鸭子呱呱叫，B类鸭子喵喵叫。为了方便扩展，将鸭子叫抽象为一个接口，具体怎么叫，由下面的实现类去实现。在鸭子的超类里面，增加一个属性就是叫的方式，具体对象在鸭子的子类里面去实现。
这就相当于各种叫法是鸭子的策略，是原理当中提到的算法，具体采用哪种算法（鸭子的叫法）是由鸭子具体子类说了算的。
