package pl.edu.student.dawidBa.lab3;

import java.util.Random;

public class Zad2_wywolania {

    public static void main(String[] args) {
        Random generator = new Random();

        int[] tab = new int[41];
        Generuj.generuj(tab, -20, 40);
        //a
        System.out.println(Zad2a.ileParzystych(tab));
        System.out.println(Zad2a.ileNieparzystych(tab));
        //b
        System.out.println(Zad2b.ileDodatnich(tab));
        System.out.println(Zad2b.ileUjemnych(tab));
        System.out.println(Zad2b.ileZerowych(tab));
        //c
        System.out.println(Zad2c.ileMaksymalnych(tab));
        //d
        System.out.println(Zad2d.sumaDodatnich(tab));
        System.out.println(Zad2d.sumaUjemnych(tab));
        //e
        System.out.println(Zad2e.dlugoscMaksymalnegoCiaguDodatnich(tab));
        //f
        Zad2f.signum(tab);
        //g
        Zad2g.odwrocFragment(tab, 2, 5);
    }
}
