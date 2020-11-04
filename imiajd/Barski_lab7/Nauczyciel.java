package pl.imiajd.Barski_lab7;

public class Nauczyciel extends Osoba {
    private int pensja;

    public Nauczyciel(String nazwisko, int rokUrodzenia, int pensja) {
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }
    public int getPensja(){
        return pensja;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "pensja=" + pensja +
                '}';
    }
}
