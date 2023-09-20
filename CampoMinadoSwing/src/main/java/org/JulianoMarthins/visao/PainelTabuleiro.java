package org.JulianoMarthins.visao;

import org.JulianoMarthins.modelo.Tabuleiro;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class PainelTabuleiro extends JPanel {

    public PainelTabuleiro(Tabuleiro tabuleiro) {

        setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));

        tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
        tabuleiro.adicionarObservador(e -> {

            SwingUtilities.invokeLater(() -> {
                if (e.isGanhou())
                    JOptionPane.showMessageDialog(this, "Parabéns!\n\n Você ganhou!");
                else
                    JOptionPane.showMessageDialog(this, "Você perdeu!");

                tabuleiro.reiniciar();
            });
        });
    }
    }

