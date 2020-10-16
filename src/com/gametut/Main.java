package com.gametut;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static void main(String[] args) {
	// write your code here
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}}; //three rows

        //this just prints out the game board
        printGameBoard(gameBoard);


        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your placement: 1-9");
            int position = scan.nextInt();
            System.out.println(position);

            placePiece(gameBoard, position, "player");

            Random random = new Random();
            int cpuPos = random.nextInt(9) + 1;
            placePiece(gameBoard, cpuPos, "comp");
            printGameBoard(gameBoard);
        }
    }

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[][] gameBoard, int position, String user) {
        char symbol = 'X';
        if (user.equals("player")) {
            symbol = 'X';
        } else if (user.equals("comp")) {
            symbol = '0';
        }


        switch(position) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
        }

    }

    public static String checkWinner() {
        List topRow = Arrays.asList(1, 2, 3);
        List middleRow = Arrays.asList(4, 5, 6);
        List bottomRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List middleCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(7, 5, 3);

        List<List> winningConditions = new ArrayList<List>();

        winningConditions.add(topRow);
        winningConditions.add(middleRow);
        winningConditions.add(bottomRow);
        winningConditions.add(leftCol);
        winningConditions.add(middleCol);
        winningConditions.add(rightCol);
        winningConditions.add(cross1);
        winningConditions.add(cross2);


        return "";
    }


}


