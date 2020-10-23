import java.util.Scanner;


public class TempoJogo{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
        
        int tempoInicial = sc.nextInt();
        int tempoFinal = sc.nextInt();
        int duracao = 0;
        
        if(tempoInicial < tempoFinal){
            duracao = tempoFinal - tempoInicial;
        }
        else {
            duracao = 24 - tempoInicial + tempoFinal;
        }
        
        System.out.println("O JOGO DUROU "+ duracao + " HORA(S)");
}
}
