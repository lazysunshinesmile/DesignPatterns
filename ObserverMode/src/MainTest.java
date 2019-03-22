import com.sunxiang.headfirst.example.NoticeBoardA;
import com.sunxiang.headfirst.example.NoticeBoardB;
import com.sunxiang.headfirst.example.WeatherStation;

public class MainTest {

    public static void main(String[] args) {
        WeatherStation  weatherStation = new WeatherStation();
        NoticeBoardA noticeBoardA = new NoticeBoardA();
        NoticeBoardB noticeBoardB = new NoticeBoardB();

        weatherStation.addObserver(noticeBoardA);
        weatherStation.addObserver(noticeBoardB);

        weatherStation.setData(12,234,56);
        weatherStation.deleteObserver(noticeBoardA);
        weatherStation.setData(18,200,12);

    }


}
