package pl.imiajd.Barski_lab8;

import java.time.LocalDate;

class Student extends Osoba
{
    public Student(String nazwisko, String kierunek, double średniaOcen, String[] imiona, LocalDate dataUrodzenia, boolean plec)
    {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.kierunek = kierunek;
        this.średniaOcen = średniaOcen;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }

    public double getŚredniaOcen(){
        return średniaOcen;
    }

    public void setŚredniaOcen(double średniaOcen) {
        this.średniaOcen = średniaOcen;
    }

    private String kierunek;
    private double średniaOcen;
}