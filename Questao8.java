import javax.swing.JOptionPane;

public class Questao8 {

	public static void main(String[] args) {

		final int tamanho = 5;

		double[][] val = new double[2][tamanho];
		StringBuilder mensagem = new StringBuilder();

		for (int i = 0; i < val.length; i++) {
			for (int j = 0; j < tamanho; j++) {

				val[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite aqui o valor para cada posição: [" + i + "][" + j + "]","Questão 8", JOptionPane.DEFAULT_OPTION));
				mensagem.append("Aqui esta a matriz com todos os valores de [" + i + "][" + j + "] =  " + val[i][j] + "\n" + "-----------------------------------------------------------------------------------------------\n");
			}
		}

		JOptionPane.showConfirmDialog(null, mensagem, "Questão 8", JOptionPane.DEFAULT_OPTION);

	}
}
