import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Maior {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         Scanner sc = new Scanner(System.in);
         int[] numeros = new int[3];
         for(int i =0; i < 3; i++){
             numeros[i] = sc.nextInt();
         }
         int maior = maior(numeros);
         System.out.println(maior + " eh o maior");
         sc.close();
    }
    
    public static int maior(int[] valores){
        int maior = valores[0];
        for(int i = 1; i < valores.length; i++){
            if(valores[i]> maior)
                maior = valores[i];
        }
        return maior;
    }
 
}
