package com.company;

import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class HR_Series {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int Queries=sc.nextInt();
        if (Queries>=1 && Queries<=500) {
            for (int j = 0; j < Queries; j++) {
                int a = sc.nextInt();
                if (a >= 0 && a <= 50) {
                    a = a;
                }

                int b = sc.nextInt();
                if (b >= 0 && b <= 50) {
                    b = b;
                }

                int n = sc.nextInt();
                if (n >= 0 && n <= 15) {
                    n = n;
                }

                for (int k=0;k<=n-1;k++){



                    double Formula= a + (Math.pow(2, k) * b);

                     if (k>=1){
                         Formula=Formula+(Math.pow(2, k) * b);
                    }


                    System.out.print(Formula+" ");
                }

            }
        }









    }
}
