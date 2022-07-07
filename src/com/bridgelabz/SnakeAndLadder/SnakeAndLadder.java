package com.bridgelabz.SnakeAndLadder;
public class SnakeAndLadder {

    static int START_POSITION = 0;
    static final int NO_PLAY = 0;
    static final int IF_LADDER = 1;
    static final int IF_SNAKE =2;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and ladder game");
        while(START_POSITION<100){
        int dieNum = (int)(Math.random()*10)%6+1;
        int option = (int)(Math.random()*10)%3;
            if (option == IF_LADDER){
                START_POSITION+=dieNum;
            }
            else if (option==IF_SNAKE) {
                START_POSITION-=dieNum;
            }
            if( START_POSITION<0){
                START_POSITION=0;
            }
            if(START_POSITION>100){
                START_POSITION-=dieNum;
            }
        }
        System.out.println(START_POSITION);
    }
}
