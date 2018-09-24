package com.github.vedeshkin;

import java.util.ArrayList;

/**
 * Created by Vedeshkin on 9/24/2018.
 * All right reserved.
 */
public class Utils {
    public static <T> void swapElements(T[] data, T changeFrom, T changeTo) {
        boolean isFound = false;
        for (int i = 0; i <= data.length; i++) {
            if (data[i].equals(changeFrom)) {
                data[i] = changeTo;
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.printf("Element %s not found in array the given array \n", changeFrom.toString());
        }
    }

    public static <T> ArrayList toArrayList(T[] array) {
        ArrayList<T> data = new ArrayList<>();
        for (T value : array) {
            if (value != null) {
                data.add(value);
            }
        }
        return data;
    }

    public static <T> void printArray(T[] data) {
        for (T value : data) {
            System.out.println(value.toString());

        }
    }


}
