package pl.edu.student.dawidBa.lab3;

public class Zad2f {

    public static void signum(int[] tab){
        for(int i : tab) {
            if (i > 0) {
                i = 1;
            } else if (i < 0) {
                i = -1;
            }
            System.out.println(i);
        }
    }
}
