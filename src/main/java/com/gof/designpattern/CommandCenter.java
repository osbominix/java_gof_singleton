package com.gof.designpattern;

/**
 * Created by yl3 on 01.11.15.
 */
public class CommandCenter {
    public static void main(String[] args) {

        RobotSingleton robotSingleton1 = RobotSingleton.getInstance();
        robotSingleton1.produceSomething();

        RobotSingleton robotSingleton2 = RobotSingleton.getInstance();
        robotSingleton2.produceSomething();

        RobotNoneSingleton robotNoneSingleton1 = RobotNoneSingleton.getInstance();
        robotNoneSingleton1.produceSomething();

        RobotNoneSingleton robotNoneSingleton2 = RobotNoneSingleton.getInstance();
        robotNoneSingleton2.produceSomething();
    }
}
