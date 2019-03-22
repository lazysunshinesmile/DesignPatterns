import com.sunxiang.headfirst.example.allitems.Coffee;
import com.sunxiang.headfirst.example.allitems.MokaCoffee;
import com.sunxiang.headfirst.example.allseasonings.Coconut;
import com.sunxiang.headfirst.example.allseasonings.Milk;
import com.sunxiang.headfirst.example.allseasonings.Sugar;
import com.sunxiang.headfirst.example.baseclass.Drink;

public class MainTest {
    public static void main(String[] args) {

        //moka 20 + coconut 3 =23
        MokaCoffee mokaCoffee = new MokaCoffee();
        Drink drink = new Coconut(mokaCoffee);
        System.out.println(drink.describe());
        System.out.println("总共：" + drink.cost());

        //纯coffee 10 + milk 3 + sugar 1 = 13
        Coffee coffee = new Coffee();
        Drink drink1 = new Milk(coffee);
        drink1 = new Sugar(drink1);
        System.out.println(drink1.describe());

        System.out.println("总共：" + drink1.cost());

    }

}
