package com.test.sealed;

public sealed class Shape permits Circle, Rectangle {
    public double calculateArea() {
        return 0;
    }
}