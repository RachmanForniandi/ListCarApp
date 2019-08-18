package id.co.listcarapp.specialClass;

import android.app.Application;

import java.util.ArrayList;

import id.co.listcarapp.models.Car;

public class CarDataProvider extends Application {

    public static ArrayList<Car>cars;

    @Override
    public void onCreate() {
        super.onCreate();
        cars = new ArrayList<>();

        cars.add(new Car("HONDA","BR-V","Joko Santoso","085653743346"));
        cars.add(new Car("PEUGEOT","CR-Z","Michael S","085732834286"));
        cars.add(new Car("TOYOTA","New Avanza","Rochman","08118439845"));
        cars.add(new Car("NISSAN","Neo X-Trail","Jaka Rusdiantoro","082245795497"));
        cars.add(new Car("BMW","i8 E-Drive","Hotman Paris","0815493573977"));
        cars.add(new Car("TOYOTA","Sienta","Firdausa","0811839474977"));
        cars.add(new Car("NISSAN","Terra","Tono Cahyadi","0857437384738"));
        cars.add(new Car("HONDA","Civic","Robbie Suhandy","0899343475787"));
    }
}
