import java.util.Random;

import javax.swing.JOptionPane;

public class Questao3 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        Random aleatorio = new Random();
        int soma = 0;

        String[] mensagem = new String[10];

        for (int i = 0; i < vetorA.length; i++) {

            vetorA[i] = aleatorio.nextInt(10);
            soma = soma + vetorA[i];
     
        }

        mensagem[1] = "--------------------------------------------------------------------\n" + "A soma de todos os elmentos do Vetor A e = " + soma
                + "\n--------------------------------------------------------------------\n";
        JOptionPane.showConfirmDialog(null, mensagem, "Questão 3", JOptionPane.DEFAULT_OPTION);

    }
}
