package primerparcial;

import java.util.ArrayList;
import java.util.List;


public class Ej3 {

    public static boolean existeElemento(List<Integer> list,int start,int end){
        if(list.get(start) == start){
            return true;
        }
        if (start > end) {
            return false;
        }
        else{
            int mid = (start+end) /2;
            if (list.get(mid) == mid) {
                return true;
            }
            else if (list.get(mid) > mid){
                return existeElemento(list, start+1, mid);
            }
            else if (list.get(mid) < mid){
                return existeElemento(list, mid+1, end);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        l1.add(-1);
        l1.add(0);
        l1.add(2);
        l1.add(5);
        l1.add(6);

        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);

        System.out.println(existeElemento(l1, 0, l1.size()-1));
        System.out.println(existeElemento(l2, 0, l2.size()-1));
    }

}
