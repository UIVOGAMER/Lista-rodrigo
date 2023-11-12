import java.util.Random;

import javax.swing.JOptionPane;

public class Questao4 {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        float soma = 0;
        int par = 0, impar = 0;

        Random aleatorio = new Random();

        String[] mensagem = new String[10];

        for (int i = 0; i < vetorA.length; i++) {

            vetorA[i] = aleatorio.nextInt(10);

            if (vetorA[i] % 2 == 0) {
                impar++;
            } else {
                par++;
            }
        }
  
        soma = impar * 10;

        mensagem[1] = "----------------------------------------------------------------------------------------------\n"
                + "A porcentagem dos numeros Ìmpares equivale a = " + (100 - soma) + "%\nE a porcetagem equivalenta aos nomeros pares equivale a = " + soma
                + "\n----------------------------------------------------------------------------------------------\n";

        JOptionPane.showConfirmDialog(null, mensagem, "Questão 4", JOptionPane.DEFAULT_OPTION);

    }
}
