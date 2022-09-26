package guiatps.dyc;

public class Ej1 {
    //Determinar si una secuencia de n caracteres está ordenada alfabéticamente.
    public static boolean ej1(char[] lista, int inicio, int fin) {
        if (inicio == fin) {
            return true;
        } else{
            int mid = (inicio + fin) /2;
            if (mid+1 <lista.length && lista[mid] > lista[mid+1]) {
                return false;
            }
            else {
                boolean izq = ej1(lista, inicio, mid);
                boolean der = ej1(lista, mid+1, fin);
                return izq && der;
            }
        }
    }

    public static void main(String[] args) {
        char[] lista;
        char[] lista2;
        lista = new char[4];
        lista2 = new char[4];

        lista[0] = 'A';
        lista[1] = 'B';
        lista[2] = 'C';
        lista[3] = 'D';

        lista2[0] = 'D';
        lista2[1] = 'A';
        lista2[2] = 'C';
        lista2[3] = 'B';

        System.out.println(ej1(lista, 0, lista.length));
        System.out.println(ej1(lista2, 0, lista2.length));
    }
}
