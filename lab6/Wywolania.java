package pl.edu.student.dawidBa.lab6;

import java.lang.reflect.Field;

public class Wywolania {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        RachunekBankowy saver1 = new RachunekBankowy();
        RachunekBankowy saver2 = new RachunekBankowy();
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        Field saldo = RachunekBankowy.class.getDeclaredField("saldo");
        saldo.setAccessible(true);
        saldo.set(saver1, 2000);
        saldo.set(saver2, 3000);
        System.out.println(saver1.obliczMiesieczneOdsetki());
        System.out.println(saver2.obliczMiesieczneOdsetki());
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        System.out.println("Po zmianie na 5%");
        System.out.println(saver1.obliczMiesieczneOdsetki());
        System.out.println(saver2.obliczMiesieczneOdsetki());

        IntegerSet zbior = new IntegerSet();
        IntegerSet zbior2 = new IntegerSet();
        zbior.insertElement(15);
        zbior2.insertElement(15);
        zbior2.insertElement(12);
        zbior2.insertElement(17);
        zbior2.deleteElement(12);
        int[] tablicaspr = IntegerSet.union(zbior.tablica, zbior2.tablica);
        for (int i = 0; i < tablicaspr.length; i++) {
            System.out.println(tablicaspr[i]);
        }
        int[] tablicaspr2 = IntegerSet.intersection(zbior.tablica, zbior2.tablica);
        for (int i = 0; i < tablicaspr2.length; i++) {
            System.out.println(tablicaspr2[i]);
        }
        System.out.println(zbior2.toString());
        System.out.println(zbior.tablica.equals(zbior.tablica));
    }
}
