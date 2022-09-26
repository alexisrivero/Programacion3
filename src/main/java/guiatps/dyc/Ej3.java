package guiatps.dyc;

public class Ej3 {
    // Calcular a**n cuando n es una potencia de 2

    public static int ej3(int a, int n) {
        if(n == 2) {
            return (int) Math.pow(a,n);
        }
        else{
            int resultado = ej3(a,n/2);
            return resultado * resultado;
        }
    }

    public static void main(String[] args) {
        System.out.println(ej3(2,8));
    }
}
