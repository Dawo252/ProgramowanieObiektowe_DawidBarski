package pl.imiajd.Barski_lab7;

public class Adres {
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;
    public Adres (String ulica, int numer_domu, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = 0;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }
    public Adres (String ulica, int numer_domu, int numer_mieszkania, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz(){
        System.out.println(this.kod_pocztowy + " " + this.miasto);
        if(numer_mieszkania != 0) {
            System.out.println(this.ulica + " " +this.numer_mieszkania +" / " + this.numer_domu);
        }
        else{
            System.out.println(this.ulica + " " + this.numer_domu);
        }
    }
    public boolean przed(String kod_pocz){
        StringBuffer kod_do_porownania = new StringBuffer();
        StringBuffer kod_porownywany = new StringBuffer();
        for(int i = 0; i<5; i++){
            if(i == 2){
                i++;
            }
            kod_do_porownania.append(this.kod_pocztowy.charAt(i));
            kod_porownywany.append(kod_pocz.charAt(i));
        }
        int adres = Integer.parseInt(String.valueOf(kod_do_porownania));
        int adres2 = Integer.parseInt(String.valueOf(kod_porownywany));
        return adres > adres2;
    }


}
