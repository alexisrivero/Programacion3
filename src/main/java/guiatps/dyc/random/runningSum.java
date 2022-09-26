package guiatps.dyc.random;

import java.util.ArrayList;
import java.util.List;

public class runningSum {

    public static int sumarElementos(ArrayList<Integer> lista, int suma, int contador) {
        if (contador == lista.size()) {
            return suma;
        }
        return sumarElementos(lista, suma+lista.get(contador), contador+1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add((1));
        lista.add((2));
        lista.add((3));
        lista.add((4));
        lista.add((5));

        System.out.println(sumarElementos(lista, 0, 0));

    }
}
/*
    def runningSum(self, nums: List[int], suma, contador) -> List[int]:
        if contador == len(lista):
        return suma
        else:
        runningSum(self, nums, suma+lista[contador], contador+1)

 */