public class Main {

    public static void main(String[] args) {
        int numero = 12321; // Cambia este número por el que quieras verificar

        if (esPalindromo(numero)) {
            System.out.println(numero + " es un número palíndromo.");
        } else {
            System.out.println(numero + " no es un número palíndromo.");
        }
    }

    public static boolean esPalindromo(int numero) {
        int numeroOriginal = numero;
        int numeroReverso = 0;

        while (numero > 0) {
            int digito = numero % 10;
            numeroReverso = numeroReverso * 10 + digito;
            numero /= 10;
        }

        return numeroReverso == numeroOriginal;
    }
}
