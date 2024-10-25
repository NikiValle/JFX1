package com.example.jfx1;

public class Giocatore{
    private String nome;
    private boolean capitano;
    private int gol;
    public Giocatore(String Nome, boolean Capitano, int Gol){
        nome=Nome;
        capitano=Capitano;
        gol=Gol;
    }
    public Giocatore(String Nome, int Gol){
        nome=Nome;
        gol=Gol;
    }
    public Giocatore(String Nome, boolean Capitano){
        nome=Nome;
        capitano=Capitano;
    }
    public Giocatore(boolean Capitano, int Gol){
        capitano=Capitano;
        gol=Gol;
    }
    public Giocatore(String Nome){
        setNome(Nome);
    }
    public Giocatore(boolean Capitano){
        setCapitano(Capitano);
    }
    public Giocatore( int Gol){
        setGol(Gol);
    }
    public void setNome(String Nome){
        nome=Nome;
    }
    public void setCapitano(boolean Capitano){
        capitano=Capitano;
    }
    public void setGol(int Gol){
        gol=Gol;
    }
    public String getNome(){
        return nome;
    }
    public boolean getCapitano(){
        return capitano;
    }
    public int getGol(){
        return gol;
    }
}
