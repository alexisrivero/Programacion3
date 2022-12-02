package primerparcial;

public class Ej1 {

    public static int calcularPotencia(int n, int p, int multiplicador){
        //resultado = n x n a la p cantidad  de veces
        if (p == 1) {
            return n;
        } else{
            return calcularPotencia(n * multiplicador, p-1, multiplicador);


        }
    }

    public static void main(String[] args) {
        System.out.println(calcularPotencia(2, 5, 2));
    }

}
