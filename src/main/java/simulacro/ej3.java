package simulacro;

import java.util.ArrayList;
import java.util.List;

public class ej3 {
    public static int binarySearch(List<Integer> array, int start, int end, int x){
        if (start > end) {
            return -1;
        } else{
            int mid = (start+end) / 2;
            if(array.get(mid) == x) {
                return mid;
            }
            else if(array.get(mid) > x) {
                return binarySearch(array, start, mid-1, x);
            }
            else {
                return binarySearch(array, mid+1, end, x);
            }
        }
    }

    public static int ejercicio3(List<Integer> array, int xindex, int indicey, int contador) {
        if (array.get(xindex) == array.get(indicey)) {
            return contador +1;
        } else{
            return ejercicio3(array, xindex+1, indicey, contador+1);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

       int indicex = binarySearch(list, 0, list.size()-1, 1);
       int indicey = binarySearch(list, 0, list.size()-1, 6);
       System.out.println(ejercicio3(list, indicex, indicey, 0));
    }
}
