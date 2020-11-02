package pl.edu.student.dawidBa.lab6;

public class RachunekBankowy {
    static double rocznaStopaProcentowa;
    private double saldo;

    public double obliczMiesieczneOdsetki() {
        return saldo + (saldo * rocznaStopaProcentowa) / 12;
    }

    public static void setRocznaStopaProcentowa(double nowaStopa) {
        rocznaStopaProcentowa = nowaStopa;
    }

}
