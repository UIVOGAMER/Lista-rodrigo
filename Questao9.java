import java.util.Random;

import javax.swing.JOptionPane;


public class Questao9 {

	public static void main(String[] args) {
        
		final int tamanho = 4;
		int[][] M = new int[4][tamanho];

		Random aleatorio = new Random();
		int maior = 0;
		int[] posi = new int[2];
		StringBuilder mensagem = new StringBuilder();
		
		
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {

				M[i][j] = aleatorio.nextInt(10);
				
                if(M[i][j]>maior) {
					maior=M[i][j];
					posi[0] = i;
					posi[1] = j;
				}
                
				mensagem.append(M[i][j]).append(j == (tamanho-1) ? "\n" : " ");
			}
		}
		mensagem.append("\nAqui esta o maior numero da matriz = " + maior + ". \nOnde ele se encontra situado na posicao[" + ( 1 + posi[0] ) + "][" + ( 1 + posi[1] ) + "]");
		JOptionPane.showConfirmDialog(null,mensagem, "Questao 9", JOptionPane.DEFAULT_OPTION);
	}
	
}
