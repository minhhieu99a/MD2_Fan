package com.codegym;

public class Fan {
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, boolean on, int radius, String color) {
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public int setSpeed(int speed) {
        return this.speed = speed;
    }

    public boolean setOn(boolean on) {
        return this.on = on;
    }

    public double getRadius(double radius) {
        return this.radius = radius;
    }

    public String getColor(String color) {
        return this.color = color;
    }
    public String toString(){
        if (this.on){
            return "Fan "+this.color + " with radius " + this.radius + " is on and speed is "+ this.speed;
        }else {
           return  "Fan "+this.color + " with radius " + this.radius + " is off ";
        }
    }
}
