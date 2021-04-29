package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String myWords;
        final int NUM=25;

        String word;
        word = "school";
        myWords=NUM+" "+word;

         if (NUM>0) {
            System.out.println("вы сохранили положительное число");
        }
        else if (NUM<0){
            System.out.println("вы сохранили отрицательное число");
        }
        else if (NUM==0){
            System.out.println("вы сохранили ноль");
        }
        System.out.println("введите ваше имя");
        Scanner scanner = new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("salam alleykum, "+name);




        System.out.println(myWords);
        int geecktech=45;
        geecktech=55;
        int number=15;

        int kopilka= geecktech+number;



        System.out.println(kopilka);







    }

}
