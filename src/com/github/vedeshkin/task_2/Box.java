package com.github.vedeshkin.task_2;

import java.util.ArrayList;

/**
 * Created by Vedeshkin on 9/24/2018.
 * All right reserved.
 */
public class Box <T extends Fruit> {

    private ArrayList<T> fruits = new ArrayList<>();
    public void put (T value){
        this.fruits.add(value);
    }
    public float getWeight()
    {
        float result = 0.0f;
        for(T elem : fruits)
        {
            result +=elem.getWeight();
        }
        return result;
    }
    private ArrayList<T> getFruits(){
        return fruits;
    }
    public boolean Compare(Box<T> box){

        return this.getWeight() == box.getWeight();
    }

    public void transferFrom(Box<T> box){
        fruits.addAll(box.getFruits());
    }

}
