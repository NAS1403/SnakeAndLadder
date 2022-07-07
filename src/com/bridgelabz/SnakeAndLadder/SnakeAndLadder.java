package com.bridgelabz.SnakeAndLadder;

public class SnakeAndLadder {

    static final int START_POSITION = 0;
    static final int NO_PLAY = 0;
    static final int IF_LADDER = 1;
    static final int IF_SNAKE =2;
    static int currentPosition = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and ladder game");
        int dieNum = (int)(Math.random()*10)%6+1;
        int option = (int)(Math.random()*10)%3;
        if (option == IF_LADDER){
            currentPosition+=dieNum;
        }
        else if (option==IF_SNAKE) {
            currentPosition-=dieNum;
        } else if (option==NO_PLAY) {
            System.out.println("No Play");
        }

        System.out.println(currentPosition);

    }
}
