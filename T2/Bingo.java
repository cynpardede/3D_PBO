/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2.Hal10;

/**
 *
 * @author CINDY
 */
class Bingo {
     public Bingo() {
        printSong();
    }

    public void printSong() {
        String[] bingo = {"B", "I", "N", "G", "O"};
        int clapCount = 0;

        for (int i = 0; i <= bingo.length; i++) {
                     System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");

        for (int j = 0; j < bingo.length; j++) {
            if (j < clapCount) {
                System.out.print("(clap)");
                } else {
                    System.out.print(bingo[j]);
                }
                if (j != bingo.length - 1) {
                    System.out.print("-");
                }
            }

            System.out.println();

        for (int j = 0; j < bingo.length; j++) {
            if (j < clapCount) {
                System.out.print("(clap)");
                } else {
                System.out.print(bingo[j]);
                }
                if (j != bingo.length - 1) {
                System.out.print("-");
                }
            }
            
            System.out.println();

            for (int j = 0; j < bingo.length; j++) {
                if (j < clapCount) {
                    System.out.print("(clap)");
                } else {
                    System.out.print(bingo[j]);
                }
                if (j != bingo.length - 1) {
                    System.out.print("-");
                }
            }

            
            System.out.println(); 

            System.out.println("And Bingo was his name-o.\n");

            clapCount++;
        }
    }
}