package pl.imiajd.Barski_lab8;

import java.time.LocalDate;

public class Fortepian extends Instrument {
    public Fortepian(String producent, LocalDate dataProdukcji){
        super(producent, dataProdukcji);
    }
    public String dzwiek(){
        return "brzdąk, brzdąk";
    }
}
