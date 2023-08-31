package extraPractice.morePractice;

import java.util.ArrayList;

public class ArrayListClass {

    private int value;
    public ArrayList<String> stringArrayList;

    public ArrayListClass(int value) {
        this.value = value;
    }

    public ArrayListClass(ArrayList<String> stringArrayList) {
        this.stringArrayList = stringArrayList;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ArrayList<String> getStringArrayList() {
        return stringArrayList;
    }

    public void setStringArrayList(ArrayList<String> stringArrayList) {
        this.stringArrayList = stringArrayList;
    }
}