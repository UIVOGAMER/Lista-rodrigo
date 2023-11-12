import javax.swing.JOptionPane;

public class Questao1 {

    public static void main(String[] args) {
        
       int[] vetorA = new int[10];
       int[] vetorB = new int[10];

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
        
          vetorB[i] = vetorA[i] * i;

          mensagem[i] = "Valor de A["+ i +"] = " + vetorA[i] + "\nValor de B["+ i +"] = " + vetorA[i] + " X " + i + " = " + (vetorB[i]) + "\n-------------------------------------";

       }
       
          JOptionPane.showConfirmDialog(null, mensagem, "Questão 1", JOptionPane.DEFAULT_OPTION);

    }
}