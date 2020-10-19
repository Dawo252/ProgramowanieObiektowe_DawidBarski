package pl.edu.student.dawidBa.lab3;

public class Zad2a {

    //public Zad2a(int[] tab){
     //   System.out.println(ileNieparzystych(tab));
    //}


    public static int ileNieparzystych(int tab[]){
        int nieparzyste = 0;
        for (int i : tab) {
            if (i % 2 == 1) {
                nieparzyste += 1;
            }
        }
        return nieparzyste;
    }
    public static int ileParzystych(int tab[]){
        int parzyste = 0;
        for (int i : tab) {
            if (i % 2 == 0) {
                parzyste += 1;
            }
        }
        return parzyste;
    }
}
