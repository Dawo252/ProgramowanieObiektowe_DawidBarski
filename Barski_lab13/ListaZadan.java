/*package pl.dawidjd.Barski_lab13;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ListaZadan {
    public ListaZadan(){
        this.list = new PriorityQueue<>();
        this.pisz();
    }


    private PriorityQueue<Task> list;

    class Task implements Comparable<Task>{
        public Task(int priority, String opis){
            this.opis=opis;
            this.priority=priority;
        }

        int priority;
        String opis;

        @Override
        public int compareTo(Task o) {
            return Integer.compare(this.priority, o.priority);
        }
    }
}*/
