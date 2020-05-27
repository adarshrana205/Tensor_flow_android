package com.example.tensorflow.models;

public abstract class Classifier {
    public abstract String name();
    public abstract Classification recognize(final float[] pixels);
}
