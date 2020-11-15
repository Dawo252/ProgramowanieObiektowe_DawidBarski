package pl.imiajd.Barski_lab8;

import java.time.LocalDate;

public class Flet extends Instrument {
    public Flet(String producent, LocalDate dataProdukcji){
        super(producent, dataProdukcji);
    }
    public String dzwiek(){
            return "fiuuu, fiuuu";
    }
}
