package pl.edu.student.dawidBa.lab4;

public class Zad1 {

    public static int countChar(String str, char c){
        int ilosc = 0;
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) == c){
                ilosc ++;
            }
        }
        return ilosc;
    }
    public static int countSubStr(String str, String subStr) {
        int liczba = 0;
        for (int i = 0; i < str.length() - subStr.length() + 1; i++) {
            if (str.startsWith(subStr, i)) {
                liczba++;
            }
        }
        return liczba;
    }
    public static String middle(String str){
        String slowo = String.valueOf(str.charAt(str.length()/2-1));
        if(str.length()%2==0){
            return slowo.concat(String.valueOf(str.charAt(str.length()/2)));
        }
        else{
            return String.valueOf(str.charAt(str.length()/2));
        }
    }
    public static String repeat(String str, int n){
        String str1 = str;
        for(int i = 1; i<n; i++){
            str = str.concat(str1);
        }
        return str;
    }
    public static int[] where(String str, String subStr){
        int[] tablica = new int[str.length()];
        int j = -1;
        for (int i = 0; i < str.length() - subStr.length() + 1; i++) {
            j++;
            if (str.startsWith(subStr, i)) {
                tablica[j] = i;
            }
        }
        return tablica;
    }
    public static String change(String str){
        StringBuffer zmieniany = new StringBuffer(str);
        for(int i = 0; i<str.length(); i++){
            int litera = str.charAt(i);
            if(litera >40 && litera <91) {
                zmieniany.delete(i,i+1);
                zmieniany.insert(i,(char) (litera+32));
            }
            else if(litera >90 && litera <123){
                zmieniany.delete(i,i+1);
                zmieniany.insert(i,(char) (litera-32));
            }
        }
        return zmieniany.toString();
    }
    public static String nice(String str){
        StringBuffer zapostrofem = new StringBuffer();
        for(int i = 0; i<str.length(); i++){
            char cyfra = str.charAt(i);
            int dlugosc = str.length();
            if((dlugosc-i) % 3 == 0) {
                zapostrofem.append("'");
                zapostrofem.append(cyfra);
            }
            else{
                zapostrofem.append(cyfra);
            }
        }
        return zapostrofem.toString();
    }
    public static String nice(String str, int liczba, String znak){
        StringBuffer zapostrofem = new StringBuffer();
        for(int i = 0; i<str.length(); i++){
            char cyfra = str.charAt(i);
            int dlugosc = str.length();
            if((dlugosc-i) % liczba == 0) {
                zapostrofem.append(znak);
                zapostrofem.append(cyfra);
            }
            else{
                zapostrofem.append(cyfra);
            }
        }
        return zapostrofem.toString();
    }
}