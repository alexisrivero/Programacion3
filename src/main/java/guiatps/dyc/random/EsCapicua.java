package guiatps.dyc.random;

public class EsCapicua {

    public static boolean esCapicua(String s, int inicio, int fin) {
        if(inicio >= fin) {
            return true;
        } else{
            if (s.charAt(inicio) != s.charAt(fin)) {
                return false;
            }else{
                return esCapicua(s, inicio+1, fin-1);
            }
        }
    }

    public static void main(String[] args) {
        String s = "abcba";
        String s2 = "diego";
        System.out.println(esCapicua(s, 0, s.length()-1));
        System.out.println(esCapicua(s2, 0, s2.length()-1));
    }
}
