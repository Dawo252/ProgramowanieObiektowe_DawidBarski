package pl.dawidjd.Barski_lab11;

public class PairUtil<T> {
    public static <T> Pair<T> swap(Pair<T> para){
        Pair para1 = new Pair(para.getFirst(), para.getSecond());
        para1.swap();
        return para1;
    }
}
