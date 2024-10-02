package main.java;
import java.util.Scanner;

public class App {
        //1. Ocorreu um erro ao inserir 'c1.massa = "2"' ja que o "2" é uma
        // string e o tipo da variavel massa float

        //2. O código permitiu atribui um valor a c1.massa

        //3. causou um erro ao tentar atribuir um valor ao c1.massa

    public static void main(String[] args) throws Exception{
        try (//Biblioteca para entrada de dados
        Scanner ler = new Scanner(System.in)) {
            //variável local a
            float app_massa;
            double app_altura;
            double app_volume;
            double app_densidade;

            System.out.println("Comando de Saida de Dados");
            
            System.out.printf("Informe seu peso: ");
            app_massa = ler.nextFloat();

            System.out.printf("Informe sua altura: ");
            app_altura = ler.nextDouble();

            System.out.printf("Informe seu volume: ");
            app_volume = ler.nextDouble();

            System.out.printf("Informe sua densidade: ");
            app_densidade = ler.nextDouble();

            CorpoHumano imc = new CorpoHumano(app_massa, app_altura);

            CorpoHumano corpo = new CorpoHumano(app_massa, app_altura, app_volume, app_densidade);

            corpo.massa = 2;
            calcularIMC(imc.getMassa(),imc.getAltura());
        }
    }
    public static double calcularIMC(float app_massa, double app_altura){
        System.out.println(app_massa / app_altura);
        return (app_massa / app_altura);
    }
}
