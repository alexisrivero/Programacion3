package simulacro;

import java.util.ArrayList;
import java.util.List;

public class ej2 {

    public static List<Integer> eje2(List<Integer> lista, int n, List<Integer> aux) {
        if (n==-1) {
            return aux;
        } else{
            aux.add((int) Math.pow(lista.get(n), 2));
        }
        return eje2(lista, n-1, aux);
    }

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        List<Integer> aux2 = new ArrayList<>();
        lista.add(4);
        lista.add(3);
        lista.add(2);
        lista.add(1);

        System.out.println(eje2(lista, lista.size()-1, aux2));
    }
}

