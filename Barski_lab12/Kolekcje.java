package pl.dawidjd.Barski_lab12;

import java.util.*;

public class Kolekcje {
    public static void redukuj(LinkedList<String> pracownicy, int n) {
        for (int i = 0; i < pracownicy.size(); i++) {
            if (i % n == 0) {
                pracownicy.remove(i);
            }
        }
    }

    public static <T> void redukuj_zmodyfikowane(LinkedList<T> pracownicy, int n) {
        for (int i = 0; i < pracownicy.size(); i++) {
            if (i % n == 0) {
                pracownicy.remove(i);
            }
        }
    }

    public static void odwroc(LinkedList<String> lista) {
        LinkedList<String> temp = new LinkedList<>(lista);
        int j = 0;
        for (int i = lista.size() - 1; i >= 0; i--) {
            lista.set(j, temp.get(i));
            j++;
        }
    }

    public static <T> void odwroc_zmodyfikowane(LinkedList<T> lista) {
        LinkedList<T> temp = new LinkedList<>(lista);
        int j = 0;
        for (int i = lista.size() - 1; i >= 0; i--) {
            lista.set(j, temp.get(i));
            j++;
        }
    }

    public static String zdania(String zdanie) {
        String[] slowa = zdanie.split(" ");
        Stack<String> slowo_stack = new Stack<>();
        StringBuilder odwrocone = new StringBuilder();
        for (String slowo : slowa) {
            slowo_stack.push(slowo);
            if (slowo.endsWith(".")) {
                while (!slowo_stack.empty()) {
                    StringBuilder slowo_odwrocone = new StringBuilder();
                    slowo_odwrocone.append(slowo_stack.pop());
                    if (slowo_stack.empty()) {
                        slowo_odwrocone.setCharAt(0, Character.toLowerCase(slowo_odwrocone.charAt(0)));
                        odwrocone.append(slowo_odwrocone);
                        odwrocone.append(". ");
                    } else if (slowo_odwrocone.toString().equals(slowo)) {
                        slowo_odwrocone.setCharAt(0, Character.toUpperCase(slowo_odwrocone.charAt(0)));
                        odwrocone.append(slowo_odwrocone, 0, slowo_odwrocone.length() - 1);
                        odwrocone.append(" ");
                    } else {
                        odwrocone.append(slowo_odwrocone);
                        odwrocone.append(" ");
                    }
                }
            }
        }
        return odwrocone.toString();
    }

    public static void sito(int n) {
        BitSet pierwsze = new BitSet(n);
        for (int i = 2; i <= n; i++) {
            pierwsze.set(2, n);
        }
        for (int j = 3; j <= pierwsze.size(); j++) {
            for (int x = 2; x <= Math.sqrt(n); x++)
                if (j % x == 0) {
                    pierwsze.clear(j);
                }
        }
        System.out.println(pierwsze);
    }

    public static <T extends Iterable<?>> void print(T arguments){
        Iterator<?> iterator = arguments.iterator();
        iterator.forEachRemaining((argument) -> System.out.println(argument));
    }

}



