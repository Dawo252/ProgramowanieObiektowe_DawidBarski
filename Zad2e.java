package pl.edu.student.dawidBa.lab3;

public class Zad2e {

    public static int dlugoscMaksymalnegoCiaguDodatnich(int[] tab){
        int dlugosc = 0;
        int dlugosc2 = 0;
        for (int j : tab) {
            if (j > 0) {
                dlugosc += 1;
            } else if (j < 0) {
                if (dlugosc >= dlugosc2) {
                    dlugosc2 = dlugosc;
                }
                dlugosc = 0;
            }
        }
        return dlugosc2;
    }
}
