package pl.imiajd.Barski_lab8;
import java.time.LocalDate;

public abstract class Instrument {
    public Instrument(String producent, LocalDate dataProdukcji){
        this.producent = producent;
        this.dataProdukcji = dataProdukcji;
    }
    public String getProducent(){
        return producent;
    }
    public LocalDate getDataProdukcji(){
        return dataProdukcji;
    }
    public abstract String dzwiek();

    @Override
    public boolean equals(Object object){
        return this.toString().equals(object.toString());
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "producent='" + producent + '\'' +
                ", dataProdukcji=" + dataProdukcji +
                '}';
    }

    private String producent;
    private LocalDate dataProdukcji;
}
