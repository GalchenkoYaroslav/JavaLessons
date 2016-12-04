package com.java.lessons;

import com.java.lessons.polimorphism.Car;
import com.java.lessons.polimorphism.HeavyCar;
import com.java.lessons.polimorphism.Mashine;
import com.java.lessons.polimorphism.Moto;

/**
 * Created by Yaroslav on 04.12.2016.
 */
public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(100);
        Moto moto = new Moto();
        moto.setSpeed(70);
        HeavyCar heavyCar = new HeavyCar();
        heavyCar.setSpeed(30);
        double result = calculateRealSpead(heavyCar);
        System.out.println("Average speed is  " + result);
    }


       static double calculateRealSpead(Mashine mashine){
        return mashine.getSpeed() + 1000;
    }
    

//       static double calculateRealSpead(Car mashine){
//        return mashine.getSpeed() + 1000;
//    }
//
//    static double calculateRealSpead(Moto mashine){
//        return mashine.getSpeed() + 1000;
//    }
//    static double calculateRealSpead(HeavyCar mashine){
//        return mashine.getSpeed() + 1000;
//    }
//

}
