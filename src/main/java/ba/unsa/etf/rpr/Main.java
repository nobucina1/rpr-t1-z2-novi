package main.java.ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Unesi n: ");
        int n = in.nextInt();
        for (int i=1; i<n; i++) {
            if (i % sumaCifara(i) == 0)
                System.out.println(i);
        }
    }
    public static int sumaCifara(int x) {
        int suma = 0;
        for (int i=x; i!=0; i/=10)
            suma += i%10;
        return suma;
    }
}