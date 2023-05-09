package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Pizza[] piz=new Pizza[5];

        piz[0]=new Pizza(5,3,4);
        piz[1]=new Pizza(7,5,6);
        piz[2]=new Pizza(10,8,10);
        piz[3]=new Pizza(15,12,15);
        piz[4]=new Pizza(24,18,24);

        System.out.println("WELCOME to DEVTON pizza :)");
        System.out.println("How many people in your group?");
        int people= scan.nextInt();
        System.out.println("How many pieces wil one person eat?");
        int pieces= scan.nextInt();

        calCostForEachPizzaType(people,pieces,piz);
    }

    private static void calCostForEachPizzaType(int people, int pieces, Pizza[] piz) {
        int totalNoOfPieces=people*pieces;
        double[] costForEachPizzaType= new double[5];
        double minCost=0.0;

        for (int i=0;i<piz.length;i++){
            costForEachPizzaType[i]=(Math.ceil((double) totalNoOfPieces/(double) piz[i].getNoOfPie()))*piz[i].getPrice();
            System.out.println("Cost For Your Pizza Size: "+piz[i].getSize()+" Inches Is: "+costForEachPizzaType[i]+"$");


                 if (i==0){
                minCost=costForEachPizzaType[i];
                 }

            if (minCost>costForEachPizzaType[i]){
                minCost=costForEachPizzaType[i];
          }
        }
        System.out.println("You can eat your group pizza with this minimum cost:"+minCost+"$");
        System.out.println("~ENJOY AND HAVE A GOOOOD DAY/NIGHT~");
    }
}