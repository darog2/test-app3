package com.dungeon.weapons;

import java.util.Random;

public class Range {
    private static final Random random = new Random();

    private int min;
    private int max;


    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }
    public int randomValue(){
       return random.nextInt(max - min + 1) + min;
    }

}
