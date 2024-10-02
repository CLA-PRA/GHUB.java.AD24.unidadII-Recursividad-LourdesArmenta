package miPrincipal;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Proporciona un número"); // 4 -> 4*3*2*1=24
        int n=entrada.nextInt();
        long f  = factorial_iterativo(n);
        System.out.println("Factorial de "+n+"!= "+f);
        f = factorial_recursivo(n);
        System.out.println("Factorial de "+n+"!= "+f);
        
    }

    
}
