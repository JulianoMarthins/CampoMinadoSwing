package org.JulianoMarthins.visao;

import javax.swing.JFrame;

import org.JulianoMarthins.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class Main extends JFrame {
    public Main() {


        Tabuleiro tabuleiro = new Tabuleiro(16, 30, 50);

        add(new PainelTabuleiro(tabuleiro));


        setTitle("Campo Minado");
        setSize(690, 438);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {

        new Main();
    }
}


