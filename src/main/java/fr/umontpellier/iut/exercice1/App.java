package fr.umontpellier.iut.exercice1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre :");
        int str = sc.nextInt();

        FizzBuzz fizzbuzz=new FizzBuzz();
        fizzbuzz.getValue(str);
        fizzbuzz.computeList(str);
    }

}


