package pl.dawidjd.Barski_lab13;

public class Tester {
    public static void main(String[] args){
        Studenciaki studenciii = new Studenciaki();
        studenciii.dodaj("Dawid2", "dop");
        studenciii.dodaj("Dawid1", "db");
        studenciii.dodaj("Dawid3", "db+");
        studenciii.dodaj("Dawid4", "bdb");
        studenciii.dodaj("Dawid5", "db-");
        studenciii.dodaj("Dawid6", "db");
        studenciii.wypisz();
        studenciii.usun("Dawid3");
        System.out.println("\n");
        studenciii.wypisz();
        studenciii.zmienOcene("Dawid5", "cel");
        System.out.println("\n");
        studenciii.wypisz();

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        Studenciaki2 studenciii2 = new Studenciaki2();
        studenciii2.dodaj(new Student("Dawid1", "Barski2", 2), "dop");
        studenciii2.dodaj(new Student("Dawid6", "Barski6", 6), "db+");
        studenciii2.dodaj(new Student("Dawid2", "Barski5", 7), "ndst");
        studenciii2.dodaj(new Student("Dawid3", "Barski4", 9), "dop");
        studenciii2.dodaj(new Student("Dawid4", "Barski3", 3), "bdb");
        studenciii2.dodaj(new Student("Dawid5", "Barski3", 5), "cel");
        studenciii2.wypisz();
        System.out.println("\n");
        studenciii2.usun(3);
        studenciii2.wypisz();
        System.out.println("\n");
        studenciii2.zmienOcene1(6, "cel");
        studenciii2.wypisz();



    }
}
