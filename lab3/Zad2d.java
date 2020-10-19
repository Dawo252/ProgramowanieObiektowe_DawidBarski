package pl.edu.student.dawidBa.lab3;

public class Zad2d {

    public static int sumaDodatnich(int[] tab){
        int suma_d = 0;
        for(int i : tab){
            if(i > 0){
                suma_d += i;
            }
        }
        return suma_d;
    }
    public static int sumaUjemnych(int[] tab){
        int suma_u = 0;
        for(int i : tab){
            if(i < 0){
                suma_u += i;
            }
        }
        return suma_u;
    }
}
