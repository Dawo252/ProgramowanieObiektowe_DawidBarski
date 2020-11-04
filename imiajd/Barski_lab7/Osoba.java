package pl.imiajd.Barski_lab7;

public class Osoba {
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String nazwisko, int rokUrodzenia){
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getNazwwisko(){
        return nazwisko;
    }
    public int getRokUrodzenia(){
        return rokUrodzenia;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                '}';
    }
}
