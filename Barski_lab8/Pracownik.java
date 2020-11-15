package pl.imiajd.Barski_lab8;

import java.time.LocalDate;

class Pracownik extends Osoba
{
    public Pracownik(String nazwisko, double pobory, LocalDate dataZatrudnienia, String[] imiona, LocalDate dataUrodzenia, boolean plec)
    {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.pobory = pobory;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public double getPobory()
    {
        return pobory;
    }

    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }
    public LocalDate getDataZatrudnienia(){
        return dataZatrudnienia;
    }

    private double pobory;
    private LocalDate dataZatrudnienia;
}
