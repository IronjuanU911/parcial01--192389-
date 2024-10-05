/*
Contar Dígitos en un Número
Escribe una función que reciba un número entero y cuente cuántos dígitos tiene.
*/
import java.util.Scanner; //Importamos la libreria scanner

public class ContarDigitos {
    public static void main (String[] args) {
        //Inicio algoritmo
        Scanner sc = new Scanner(System.in); //Creamos el objeto llamado sc, el cual utilizaremos para escanear los siguientes datos.
        final int divisor_base = 10;

        System.out.println("Inserte el numero a contar");
        
        final int numero_base = sc.nextInt();
        double numero_residual = (float)(numero_base);
        int contador_digitos = 1;

        if (numero_residual < 0){// Volvemos el numero positivo si es que el usuario lo entrega negativo
            numero_residual = numero_residual*(-1);
        }

        for (int i = 1; numero_residual >= 9.0f; i++){
            numero_residual = (double) (numero_base)/(Math.pow(divisor_base,i));
            contador_digitos++;
        }

        System.out.println("El numero tiene " + contador_digitos + " digitos");

        //Fin algoritmo
    }
}