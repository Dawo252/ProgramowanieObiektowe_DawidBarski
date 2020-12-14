package pl.dawidjd.Barski_lab13;

import java.util.SortedMap;
import java.util.TreeMap;

public class Studenciaki {
    public Studenciaki(){
        this.studenci = new TreeMap<>();
    }
    public void dodaj(String nazwisko, String ocena){
        this.studenci.put(nazwisko, ocena);
    }
    public void usun(String nazwisko){
        this.studenci.remove(nazwisko);
    }
    public void zmienOcene(String nazwisko, String ocena){
        this.studenci.replace(nazwisko, ocena);
    }
    public void wypisz(){
        for(String osoba : this.studenci.keySet()){
            System.out.println(osoba + ": " + this.studenci.get(osoba));
        }
    }





    private SortedMap<String, String> studenci;
}
