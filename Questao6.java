import javax.swing.JOptionPane;

public class Questao6 {

	public static void main(String[] args) {
		
		int[] A = new int[6];
		int[] B = new int[6];
		
		StringBuilder mensagem = new StringBuilder();
		
		for (int i = 0; i < A.length; i++) {

			A[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite qui alguns valores inteiros: "));
			
            if(A[i]%2==0) { 

				B[i] = 1;

			} else {

				B[i] = 0;

			}

			mensagem.append("Valor do vetor A [" + i + "] equivale a =" + A[i] + "\nE o valor que equivale ao vetor B [" + i + "] equivale a = " + B[i] + "\n" + "------------------------------------------------------------------------------------\n");
		
        }

		mensagem.append("\n 1 equivale a impar / 0 equivale a par .");
		JOptionPane.showConfirmDialog(null,mensagem, "Questao 6", JOptionPane.DEFAULT_OPTION);
	
    }
}

