package com.gof.designpattern;

/**
 * Created by yl3 on 01.11.15.
 */
public class RobotNoneSingleton {
    public void produceSomething() {
        System.out.println("Robot try to produce something");
    }

    public static synchronized RobotNoneSingleton getInstance () {
        return new RobotNoneSingleton();
    }
}
