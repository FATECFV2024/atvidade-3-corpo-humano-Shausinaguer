package main.java;

public class CorpoHumano {
    // Metodo_acesso - tipagem - nome
    private double massa;
    private double altura;

    // Construtor do Corpo Humano
    public CorpoHumano(double massa, double altura){
        this.massa = massa;
        this.altura = altura;
    }

    // Setter da massa
    public void setmassa (double massa){
        this.massa = massa;
    }

    public void setaltura (double altura){
        this.altura = altura;
    }
    
    // Getter da massa
    public double getmassa(){
        return massa;
    }

    // Getter da altura
    public double getaltura(){
        return altura;
    }
}
