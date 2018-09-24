package com.github.vedeshkin.task_2;


/**
 * Created by Vedeshkin on 9/24/2018.
 * All right reserved.
 */
public class Main {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Orange>  additionalBox =  new Box<>();
        appleBox.put(new Apple());
        appleBox.put(new Apple());
        orangeBox.put(new Orange());
        additionalBox.put(new Orange());
        orangeBox.transferFrom(additionalBox);


    }

}
