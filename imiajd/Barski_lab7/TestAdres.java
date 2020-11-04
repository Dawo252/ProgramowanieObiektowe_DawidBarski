package pl.imiajd.Barski_lab7;

public class TestAdres {
    public static void main(String[] args) {

        Adres adres = new Adres("Orlowicza", 42, "Olsztyn", "10684");
        if(adres.przed("15420"))
        {
            System.out.println("jest przed");
        }
        else
        {
            System.out.println("jest za");
        }

    }
}