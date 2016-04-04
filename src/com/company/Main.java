package com.company;
//0, 0 = 1; 0+1 = 1; 1+1=2; 1+2=3; 2+3=5; 5+3=8; 8+5=13; ...
//0,1,1,2,3,5,8,13,21,34,55,89,144...

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter one number: ");

        int n = scan.nextInt();
        int k; //remembering first the number before
        k = 1;
        int i;
        int l; //remembering second numbers before
        l = 0;
        int m = 0;

       if (n==0) {
           m = 0;

       }
        else if (n==1) {
           m = 1;
       }
        else {

           for (i = 2; i <= n; i++) { //i nam je broj fibonaccijevog
               m = l + k;
               l = k;
               k = m;

           }
       }
            System.out.println(m);

        }



    }

