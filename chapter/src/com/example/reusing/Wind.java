package com.example.reusing;

public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind x = new Wind();
        Instrument.tune(x);
        Instrument xx = new Wind(); // Wind 对象是一种类型的 Instrument
    }
}

class Instrument {
    public void play() {}
    static void tune(Instrument i) {
        i.play();
    }
}