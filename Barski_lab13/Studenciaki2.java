package pl.dawidjd.Barski_lab13;

import java.util.TreeMap;

public class Studenciaki2 {
    public Studenciaki2(){
        this.studenci = new TreeMap<>();
        this.ids = new TreeMap<>();
    }
    public void dodaj(Student stud, String ocena){
        this.studenci.put(stud, ocena);
        this.ids.put(stud.getId(), stud);
    }
    public void usun(int id){
        this.studenci.remove(this.ids.get(id));
        this.ids.remove(id);
    }
    public void zmienOcene1(int id, String ocena){
        this.studenci.replace(this.ids.get(id), ocena);
    }
    public void wypisz(){
        for(Student osoba : this.studenci.keySet()){
            System.out.println(osoba.getNazwisko() + " "+ osoba.getImie() + " "+ osoba.getId() + ": " + this.studenci.get(osoba));
        }
    }



    private TreeMap<Student, String> studenci;
    private TreeMap<Integer, Student> ids;
}
