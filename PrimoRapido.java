import java.io.IOException;
import java.util.Scanner; 
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner sc = new Scanner(System.in);
        
        int numberOfTests = sc.nextInt();
        String output = "";
        while(numberOfTests > 0){
            int number = sc.nextInt();
            output += isPrime(number) + "\n";
            
            numberOfTests--;
        }
        
        System.out.print(output);
    }
    public static String isPrime(int value){
        String prime = "Prime";
        if(value <= 1)
            return "Not Prime";
        for(int i = 2; i < Math.sqrt(value); i++){
            if(value % i == 0){
                prime = "Not Prime";
                break;
            }
        }
        return prime;
    }

}
