package com.bridgelabz.SnakeAndLadder;
public class SnakeAndLadder {
    static final int START_POSITION = 0;
    static final int NO_PLAY = 0;
    static final int IF_LADDER = 1;
    static final int IF_SNAKE =2;
    static final int MAX_POSITION = 100;
    static int currentPosition=0;
    static int die =0;
    static int player=1;

    static void switchPlayer(){
        if (player==1){
            player=2;
        }
        else{
            player=1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and ladder game");
        while(currentPosition<100){
            switchPlayer();

        int dieNum = (int)(Math.random()*10)%6+1;
        int option = (int)(Math.random()*10)%3;
            if (option == IF_LADDER){
                currentPosition+=dieNum;
                switchPlayer();
               }
            else if (option==IF_SNAKE) {
                currentPosition-=dieNum;
            }
            else if(option == NO_PLAY){
                System.out.println("No Play");
            }
            if( currentPosition<START_POSITION){
                currentPosition=0;
            }
            if(currentPosition>MAX_POSITION){
                currentPosition-=dieNum;
            }
            System.out.println("Current position is: "+currentPosition);
            die++;
        }
        System.out.println("Total number of times Die rolled are: "+die);
        System.out.println("Player "+ player + " wins the game");
    }
}
