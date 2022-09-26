package guiatps.dyc.random;

import java.util.ArrayList;
import java.util.List;

public class OcurrenciasDuplicadas {
    //Given a sorted integer array containing duplicates,
    //count occurrences of a given number. If the element is not found in the array, report that as well.

    //para que sea mas rapido se podria implementar una busqueda binaria

    public static int findDuplicates(List<Integer> lista, int start, int end, int target, int count) {
        if (start == end && lista.get(start) == target) {
            return count+1;
        }
       else if (start >= end) {
           return count;
       }
       else {
           if (lista.get(start) == target) {
               return findDuplicates(lista, start+1, end, target, count+1);
           }
           else {
               return findDuplicates(lista, start+1, end, target, count);
           }
       }
    }


    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(5);
        lista.add(5);
        lista.add(5);
        lista.add(6);
        lista.add(6);
        lista.add(8);
        lista.add(9);
        lista.add(5);
        lista.add(5);

        System.out.println(findDuplicates(lista, 0, lista.size()-1, 5, 0));
    }
}
