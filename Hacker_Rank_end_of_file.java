package com.company;

import java.util.Scanner;

public class Hacker_Rank_end_of_file {
    public static void main(String[] args) {

        int a=1;
        try (Scanner sc=new Scanner(System.in)){

            while (sc.hasNext()){
                System.out.println(a + " " +sc.nextLine());
                a++;
            }

        }

    }
}
