package pl.imiajd.Barski_lab7;

public class TestStudent {
    public static void main(String[] args) {
        Student Dawid = new Student("Barski", 2000, "ISI");
        Nauczyciel Pawel = new Nauczyciel("Jastrzabek", 2225, 16384);

        System.out.println(Dawid.toString());
        System.out.println(Dawid.getKierunek());
        System.out.println(Dawid.getRokUrodzenia());
        System.out.println(Pawel.toString());
        System.out.println(Pawel.getNazwwisko());
        System.out.println(Pawel.getPensja());
    }
}
