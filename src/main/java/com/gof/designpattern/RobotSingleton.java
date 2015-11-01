package com.gof.designpattern;

/**
 * Created by yl3 on 01.11.15.
 */
public class RobotSingleton {

    private static RobotSingleton instance;

    private RobotSingleton() {}

    public static synchronized RobotSingleton getInstance () {
        if (RobotSingleton.instance == null) {
            RobotSingleton.instance = new RobotSingleton();
        }
        return RobotSingleton.instance;
    }

    public void produceSomething() {
        System.out.println("Robot try to produce something");
    }
}