package com.github.vedeshkin;
import java.util.ArrayList;

public class Main {

    static class DummyData {
        private String value;

        DummyData(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DummyData dummyData = (DummyData) o;

            return value.equals(dummyData.value);
        }

        @Override
        public int hashCode() {
            return value.hashCode();
        }

        @Override
        public String toString() {
            return getValue();
        }
    }
    public static void main(String[] args) {
        DummyData[]  data  = new DummyData[]{new DummyData("one"),new DummyData("two"),new DummyData("three")};
        System.out.println("Initial Array:");
        Utils.printArray(data);
        System.out.println("Performing swap of elements:");
        Utils.swapElements(data,new DummyData("two"),new DummyData("It works!"));
        Utils.printArray(data);
        System.out.println("Transforming an array object to ArrayList");
        ArrayList<DummyData> arrayList = Utils.toArrayList(data);
        System.out.println(arrayList.toString());


    }


}
