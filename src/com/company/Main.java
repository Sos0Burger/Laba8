package com.company;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ввод данных
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x");
        double x = in.nextInt();
        System.out.println("Enter y");
        double y = in.nextInt();

        try{
            double z = function(x,y);
            System.out.println(z);
        }
        catch (divideByZero ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber() + " is unacceptable");
        }
    }
    //вычисление функции
    public static double function(double x, double y) throws divideByZero {
        if (y == -1) throw new divideByZero("Divide by zero exception",y);

        double z = (x+y)/(y+1);
        return z;
    }
}

class divideByZero extends Exception{

    private double number;
    public double getNumber() {
        return number;
    }
    public divideByZero(String message, double number){
        super(message);
        this.number = number;
    }
}
