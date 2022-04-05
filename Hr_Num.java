package com.company;

import java.util.Scanner;



public class Hr_Num {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();

        for(int i=0;i<x;i++)
        {

            try
            {
                long y=sc.nextLong();

                System.out.println(y+" can be fitted in:");

                if(y>=-128 && y<=127)System.out.println("* byte");

                if(y>=-32768 && y<=32767)System.out.println("* short");

                double int_cutoff = Math.pow(2,31);

                if(y>=-Math.pow(2,31) && y<=Math.pow(2,31)-1)System.out.println("* int");

                double long_cutoff = Math.pow(2,63);

                if(y>=-Math.pow(2,63) && y<=Math.pow(2,63)-1)System.out.println("* long");
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}









