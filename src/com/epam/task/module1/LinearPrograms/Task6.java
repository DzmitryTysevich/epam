package com.epam.task.module1.LinearPrograms;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(calculateArea(2,1));
    }
    public static boolean calculateArea(int x, int y){
       return (y<=4 && y>=0 && x<=2 && x>=-2)||(y>=-3 && y<=0 && x<=4 && x>=-4);
    }
}