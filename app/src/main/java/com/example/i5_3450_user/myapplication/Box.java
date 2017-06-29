package com.example.i5_3450_user.myapplication;

/**
 * Created by I5-3450-user on 29.06.2017.
 */

public class Box {
    int weight;
    int height;
    int depth;

    int getValue() {
        return weight * height * depth;
    }

    void setValue(int w, int h, int d) {
        weight = w;
        height = h;
        depth = d;
    }

}


