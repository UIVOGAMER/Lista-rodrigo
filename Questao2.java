import java.util.Random;

import javax.swing.JOptionPane;

public class Questao2 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        Random aleatorio = new Random();

        String[] mensagem = new String[10];

        vetorA[0] = 34;
        vetorA[1] = 56;
        vetorA[2] = 4;
        vetorA[3] = 7;
        vetorA[4] = 8;
        vetorA[5] = 90;
        vetorA[6] = 47;
        vetorA[7] = 78;
        vetorA[8] = 32;
        vetorA[9] = 89;

        for (int i = 0; i < vetorB.length; i++) {

            int[] vetorC = new int[10];

            vetorB[i] = aleatorio.nextInt(10);
            vetorC[i] = vetorA[i] * vetorB[i];

            mensagem[i] = "Valor de A[" + i + "] = " + vetorA[i] + "\nValor de B[" + i + "] = " + vetorB[i] + " X " + i
                    + " = " + (vetorB[i]) + "\nValor de C[" + i + "] = " + vetorC[i]
                    + "\n-------------------------------------\n";

        }

        JOptionPane.showConfirmDialog(null, mensagem, "Questão 2", JOptionPane.DEFAULT_OPTION);

    }
}
