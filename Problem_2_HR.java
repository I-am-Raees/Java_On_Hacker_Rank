package com.company;

import java.util.Scanner;

public class Problem_2_HR {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int N=in.nextInt();

        for (int i=1;i<=10;i++){
            System.out.format("%d x %d = %d",N,i,N*i);
            System.out.println();
        }
    }
}
