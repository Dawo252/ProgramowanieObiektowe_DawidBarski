package pl.dawidjd.Barski_lab13;

public class Student implements Comparable<Student> {
    public Student(String nazwisko, String imie, int id){
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.id = id;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student student) {
        if(this.nazwisko.compareTo(student.getNazwisko())<=0){
            if(this.imie.compareTo(student.getImie())<=0){
                if(this.id<student.getId()){
                    return -1;
                }
                else if(this.id==student.getId()){
                    return 0;
                }
                return 1;
            }
            return this.imie.compareTo(student.getImie());
        }
        return this.nazwisko.compareTo(student.getNazwisko());
    }

    private String imie;
    private String nazwisko;
    private int id;

}
