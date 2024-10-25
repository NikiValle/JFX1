package com.example.jfx1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;
import java.util.Scanner;

public class HelloController {
    Scanner in = new Scanner(System.in);
    int sceltaNumerica;
    String scelta;
    boolean active=true;
    int giocatoreInModifica;
    int nGiocatori =0;
    String modGiocatore;
    String nome;
    String capitano;
    boolean presenzaCapitano = false;
    boolean isCapitano =false;
    boolean error;
    int gol;
    int num;
    Random r= new Random(32198);
    Giocatore[] g = new Giocatore[1000];

    @FXML
    private Label welcomeText;

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private Button b4;

    @FXML
    private Button b5;

    @FXML
    private Button b6;

    @FXML
    private Button b7;

    @FXML
    private TextField output;

    @FXML
    private TextField gInput;

    @FXML
    private TextField nInput;

    @FXML
    private CheckBox cCheck;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void b1ButtonClick(){
        output.setText("Inserisci i dati del nuovo giocatore in quest'ordine: Nome,  numero di gol, capitano(si/no)");
        nome=nInput.getText();
        gol= Integer.parseInt(gInput.getText());
        do {
            error=false;
            if (cCheck.isSelected()&&presenzaCapitano) {
                output.setText("É già presente un capitano, scrivi no");
                isCapitano = false;
                error=true;
            }
            else if(cCheck.isSelected()) {
                isCapitano = true;
                presenzaCapitano=true;
            }
        }while(error);
        TestGiocatore.CreaGiocatore(nome, isCapitano, gol, g, nGiocatori);
        nGiocatori++;
    }

}