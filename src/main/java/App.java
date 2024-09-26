package main.java;
import java.util.Scanner;

public class App {
        //Comentário

    public static void main(String[] args) throws Exception{
        try (//Biblioteca para entrada de dados
        Scanner ler = new Scanner(System.in)) {
            //variável local a
            double app_massa;
            double app_altura;

            System.out.println("Comando de Saida de Dados");
            
            System.out.printf("Informe seu peso: ");
            app_massa = ler.nextDouble();

            System.out.printf("Informe sua altura: ");
            app_altura = ler.nextDouble();

            CorpoHumano imc = new CorpoHumano(app_massa, app_altura);

            System.out.println(imc.getmassa() / imc.getaltura() );
        }
    }
}
