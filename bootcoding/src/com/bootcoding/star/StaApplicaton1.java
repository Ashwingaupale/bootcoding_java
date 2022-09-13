package com.bootcoding.star;

public class StaApplicaton1 {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=4;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------");

       for(int i=0;i<4;i++){
           for(int j=4;j>i;j--){
               System.out.print("*");
           }

           for(int l=0;l<i*2;l++){
               System.out.print(" ");
           }
           for (int k=4;k>i;k--){
               System.out.print("*");
           }
           System.out.println();
       }

        int n=4;
        for(int i=0;i<n;i++) {
            for(int j=0;j<i+1;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("-------------------------------------------------------");

        for(int i=0;i<n;i++) {
            for(int k=i;k<n-1;k++) {
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("-------------------------------------------------------");

        for(int i=0;i<6;i++) {

            for(int j=6;j>i;j--) {
                System.out.print(" ");

            }
            for(int k=0;k<i+1;k++) {
                System.out.print("* ");
            }



            System.out.println();

        }

        System.out.println("-------------------------------------------------------");

        for(int i=0;i<5;i++) {

            for(int m=5;m>i;m--) {
                System.out.print(" ");
            }

            for(int j=0;j<(i*2)+1;j++) {
                System.out.print("*");
            }





            System.out.println();
        }

        System.out.println("-------------------------------------------------------");


        for(int i=0;i<5;i++) {

            for(int j=5;j>i;j--) {
                System.out.print(" ");
            }
            for(int k=0;k<(i*2)+1;k++) {
                System.out.print("*");
            }
            System.out.println();


        }

        for(int d=0;d<10;d++) {

            for(int g=0;g<d+1;g++) {
                System.out.print(" ");
            }

            for(int s=9;s>d*2;s--) {
                System.out.print("*");
            }

            System.out.println();

        }

        System.out.println("-------------------------------------------------------");



        for(int i=0;i<5;i++) {

            for(int m=5;m>i;m--) {
                System.out.print(" ");
            }

            for(int j=0;j<(i*2)+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<5;i++) {
            System.out.println(" *       *");
        }
        System.out.println(" *********");

        System.out.println("-------------------------------------------------------");

        for(int i=0;i<5;i++) {

            for(int k=0;k<i+1;k++) {
                System.out.print(" ");
            }
            for(int j=0;j<5-i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------");

        for(int i=0;i<5;i++) {
            for(int j=0;j<i+1;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=0;i<4;i++) {
            for(int j=0;j<4-i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------");
        int f=0;
        for(int i=0;i<6;i++) {
            for(int j=0;j<12-(i*2);j++) {
                System.out.print(" ");
            }
            for(int k=0;k<1;k++) {
                System.out.print("*");
            }
            for(int x=0;x<i*2+i*2;x++) {
                System.out.print(" ");
            }
            if(i==f) {
                for(int a=0;a<i+1;a++) {
                    System.out.print("");
                }
            }
            else {
                for(int a=0;a<1;a++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        System.out.println("  **********************");











    }

}
