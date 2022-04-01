package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Hacker_Rank {

    private static String prepareLine(String patternToDraw,int nb){
        String sb = "";
        for(int i=0;i<nb;i++){
            sb+=patternToDraw;
        }
        return sb;
    }

    public static void main(String[] args) {

        String Line="================================";


        Scanner Sc_1= new Scanner(System.in);


        String a=Sc_1.nextLine();
        String[] A = a.split(" ");
        String A_1 = A[1];
        String spaceA = prepareLine(" ", 15-A[0].length());
        for(int i=0; i<3-A[1].length(); i++){
            A_1 = "0"+A_1;
        }


        String b=Sc_1.nextLine();
        String[] B = b.split(" ");
        String B_1=B[1];
        String spaceB = prepareLine(" ", 15-B[0].length());
        for(int i=0; i<3-B[1].length(); i++){
            B_1 = "0"+B_1;
        }



        String c=Sc_1.nextLine();
        String[] C = c.split(" ");
        String C_1=C[1];
        String spaceC = prepareLine(" ", 15-C[0].length());
        for(int i=0; i<3-C[1].length(); i++){
            C_1 = "0"+C_1;}

        System.out.print(Line);
        System.out.println();

        System.out.format("%s%s%s%n", A[0], spaceA, A_1);


        System.out.format("%s%s%s%n", B[0], spaceB, B_1);


        System.out.format("%s%s%s%n", C[0], spaceC, C_1);

        System.out.print(Line);

    }

    }


