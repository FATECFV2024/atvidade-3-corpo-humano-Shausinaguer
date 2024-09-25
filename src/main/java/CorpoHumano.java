package main.java;

public class CorpoHumano {
    // metodo_acesso - tipagem - nome
    private double massa;
    private double altura;

    public CorpoHumano(double massa, double altura){
        this.massa = massa;
        this.altura = altura;
    }

    //Setter do corpo humano
    public void setCorpo (double ent_massa, double ent_altura){
        massa = ent_massa;
        altura = ent_altura;
    }

    //Getter do corpo humano
    public double getCorpo(){
        return massa;
    }
}
