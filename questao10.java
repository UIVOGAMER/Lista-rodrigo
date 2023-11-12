import javax.swing.JOptionPane;

public class questao10{

	public static void main(String[] args) {

		final int tamanho = 3;
		int[][] val = new int[3][tamanho];//(val)= valor
		StringBuilder mensagem = new StringBuilder();
		int par = 0, impar = 0;
		
	
		for (int i = 0; i < val.length; i++) {
			for (int j = 0; j < tamanho; j++) {

				val[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite aqui o valor para cada posição: [" + i + "][" + j + "]","Questão 8", JOptionPane.DEFAULT_OPTION));
                mensagem.append("Aqui esta a matriz com todos os valores de [" + i + "][" + j + "] =  " + val[i][j] + "\n" + "-----------------------------------------------------------------------------------------------\n");
				
                if(val[i][j]%2==0) {
					impar++;
				} else {
					par++;
				}
			}
		}

		mensagem.append("\nAqui esta a quantidade de numeros pares = " + par + "\nAqui esta a quantia equivalenta aos numeros ímpares = " + impar);
		JOptionPane.showConfirmDialog(null,mensagem, "Numero 10", JOptionPane.DEFAULT_OPTION);
	
	}
}