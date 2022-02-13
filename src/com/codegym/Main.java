package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code
        Fan fan1=new Fan(3,true,10,"red");
        System.out.println( fan1.toString());
        Fan fan2=new Fan(2,false,5,"blue");
        System.out.println(fan2.toString());
    }
}
