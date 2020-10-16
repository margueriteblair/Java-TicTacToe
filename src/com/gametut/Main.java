package com.gametut;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}}; //three rows

        for (char [] row : gameBoard ) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}


