package pl.edu.student.dawidBa.lab3;

public class Zad2c {

    public static int ileMaksymalnych(int[] tab){
        int najwieksza = tab[0];
        int ilosc = 0;
        for (int j : tab) {
            if (j > najwieksza) {
                najwieksza = j;
            }
        }
        for (int j : tab) {
            if (j == najwieksza)
                ilosc += 1;
        }
        return ilosc;
    }
}
