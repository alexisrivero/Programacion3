package guiatps.dyc;

import java.util.ArrayList;
import java.util.List;

public class Ej2 {
    //Dado un vector de n números naturales ordenados crecientemente
    //determinar si un número x dado pertenece al vector
    public static boolean binarySearch(List<Integer> list, int start, int end, int x) {
        if (start > end){
            return false;
        } else{
            int mid = (start+end) / 2;
            if (list.get(mid) == x) {
                return true;
            }
            else if(list.get(mid) > x) {
                return binarySearch(list,start, mid-1, x);
            }
            else {
                return binarySearch(list, mid+1, end, x);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(binarySearch(list, 0, list.size()-1, 5));
    }


}
