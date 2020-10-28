package pl.edu.student.dawidBa.lab4;

import java.math.BigDecimal;

public class Zad5 {
    public static BigDecimal lokata(double k, double p, int n){
        BigDecimal suma = new BigDecimal(k);
        BigDecimal procent = new BigDecimal(p);
        for(int i = 0; i<n; i++){
            suma = suma.add(suma.multiply(procent.divide(new BigDecimal("100"))));
        }
        return suma.setScale(2);
    }
}
