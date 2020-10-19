package pl.edu.student.dawidBa.lab3;

public class Zad2g {

    public static void odwrocFragment(int[] tab, int lewy, int prawy){
        int liczba2=0;
        for (int i = lewy; i <= prawy; i++) {
            liczba2 = tab[i];
            tab[i] = tab[prawy];
            tab[prawy] = liczba2;
            prawy--;
        }
        for(int x = 0; x<tab.length; x++){
            System.out.println(tab[x]);
        }
    }
}
