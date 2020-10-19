package pl.edu.student.dawidBa.lab3;

public class Zad2b {

    public static int ileDodatnich(int[] tab) {
        int dodatnie = 0;
        for (int i : tab) {
            if (i > 0) {
                dodatnie += 1;
            }
        }
        return dodatnie;
    }
    public static int ileUjemnych(int[] tab) {
        int ujemne = 0;
        for (int i : tab) {
            if (i < 0) {
                ujemne += 1;
            }
        }
        return ujemne;
    }
    public static int ileZerowych(int[] tab){
        int zerowe = 0;
        for (int i : tab) {
            if (i == 0) {
                zerowe += 1;
            }
        }
        return zerowe;
    }
}
