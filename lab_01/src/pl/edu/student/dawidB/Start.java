package pl.edu.student.dawidB;

public class Start {
    public static void metoda(){
        System.out.println("StartApp uruchomione");
    }
    public static int dodawanie(){
        return 1+2+3+4+5+6+7+8+9+10;
    }
    public static int mnozenie(){
        return 1*2*3*4*5*6*7*8*9*10;
    }
    public static void stanKonta(){
        double stanKon = 1000;
        System.out.println("stan po roku " + stanKon + stanKon * 0.06);
        stanKon = stanKon + stanKon * 0.06;
        System.out.println("stan po 2 latach " + stanKon + stanKon * 0.06);
        stanKon = stanKon + stanKon * 0.06;
        System.out.println("stan po 3 latach " + stanKon + stanKon * 0.06);
    }
    public static void NapiswRamce(){
        for(int wysokosc = 0; wysokosc < 3; wysokosc++){
            System.out.print("\n");
            for(int dlugosc = 0; dlugosc< 6; dlugosc++){
                if(wysokosc == 1 && dlugosc == 1){
                    System.out.print("Java");
                }
                else if(wysokosc == 1 && dlugosc > 1 && dlugosc <5){
                    System.out.print("");
                }
                else{
                    System.out.print("+");
                }
                }
            }
        }

    public static void domek(){
        System.out.print("\n");
        System.out.print( "   +   " +"\n"+
                          "  + +  " +"\n"+
                          " +   + " +"\n"+
                          "+-----+" +"\n"+
                          "| .-. |" +"\n"+
                          "| | | |" +"\n"+
                          "+-+-+-+");
    }

    public static void main(String[] args){
        metoda();
        System.out.println(dodawanie());
        System.out.println(mnozenie());
        stanKonta();
        NapiswRamce();
        domek();

    }
}