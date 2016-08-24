package com.jacksonmix.android.aca.marsrobot;

/**
 * Created by mixja on 8/24/16.
 */
public class MarsRobot {
    String status;
    int speed;
    float temperature;
    int tirePressure;
    int armExtensionLength;


    void checkTemperature () {
        if (temperature < -80) {
            status = "returning home";
            speed = 5;
        }
    }

    void checkTirePressure () {
        if (tirePressure < 20) {
            status = "parked";
            armExtensionLength = 0;
        }

    }

    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);

    }
}
