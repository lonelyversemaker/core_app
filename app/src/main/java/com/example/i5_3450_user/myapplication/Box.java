package com.example.i5_3450_user.myapplication;

import 	android.util.Log;

/**
 * Created by I5-3450-user on 29.06.2017.
 */

public class Box implements testInterface{
    int width;
    int height;
    int depth;
    static int count;
    int inter;

    int getValue() {
        return width * height * depth;
    }

    static int Increment() {
        return count++;
    }

    void setValue(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    @Override
    public String getClassName() {
        return "Коробка";
    }

}

class HeavyBox extends Box {
    int weight;

    HeavyBox(int w, int h, int d, int m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }

    @Override
    public String getClassName() {
        return "Тяжелая коробка";
    }
}


class ColorBox extends HeavyBox {
    int color;

    ColorBox(int w, int h, int d, int m, int c) {
        super(w,h,d,m);
        color = c;
    }
}


