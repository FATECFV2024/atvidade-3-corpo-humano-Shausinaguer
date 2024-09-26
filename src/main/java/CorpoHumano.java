package main.java;

public class CorpoHumano {

    // Metodo_acesso - tipagem - nome
    // variaveis
    public float massa;
    private double altura;
    private double volume;
    private double densidade;

    // Construtor do Corpo Humano (massa, altura, volume, densidade)
    public CorpoHumano(float massa, double altura, double volume, double densidade){
        this.massa = massa;
        this.altura = altura;
        this.volume = volume;
        this.densidade = densidade;
    }

    // Construtor com 3 parametros (massa, altura, volume)
    public CorpoHumano(double altura, float massa, double volume){
        this.massa = massa;
        this.altura = altura;
        this.volume = volume;
    }

    // Construtor com 3 parametros (massa, altura, densidade)
    public CorpoHumano(float massa, double altura, double densidade){
        this.massa = massa;
        this.altura = altura;
        this.densidade = densidade;
    }

    // Construtor com 2 parametros (massa, altura)
    public CorpoHumano(float massa, double altura){
        this.massa = massa;
        this.altura = altura;
    }

    // Setter da massa
    public void setmassa (float massa){
        this.massa = massa;
    }
    // Setter da altura
    public void setaltura (double altura){
        this.altura = altura;
    }
    // Setter do volume
    public void setvolume (double volume){
        this.volume = volume;
    }
    // Setter da altura
    public void setdensidade (double densidade){
        this.densidade = densidade;
    }
    

    // Getter da massa
    public float getmassa(){
        return massa;
    }
    // Getter da altura
    public double getaltura(){
        return altura;
    }
    // Getter da volume
    public double getvolume(){
        return volume;
    }
    // Getter da altura
    public double getdensidade(){
        return densidade;
    }
}
