package pl.edu.student.dawidBa.lab4;

import java.math.BigInteger;

public class Zad4 {
    public static BigInteger Szachownica(int n){
        BigInteger wynik = new BigInteger("1");
        BigInteger suma = new BigInteger("0");
        for(int i = 0; i<n ; i++){
            suma = suma.add(wynik);
            wynik = wynik.multiply(new BigInteger("2"));
        }
        return suma;
    }
}
