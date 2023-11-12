import javax.swing.JOptionPane;

public class Questao7 {

	public static void main(String[] args) {
	
		int[] Valores = new int[10];
		StringBuilder mensagem = new StringBuilder();

		mensagem.append("Aqui estão eles desordenador: ");
		
		for (int i = 0; i < Valores.length; i++) {

			Valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui o " + i + " valor: "));		
			mensagem.append(Valores[i] + " ,");

		}
		
		mensagem.append("\n\nAqui podemos ver eles ja ordenador: ");

		for (int i = 0; i < Valores.length; i++) {
			
			mensagem.append(Valores[i] + " ,");

		}
		
		JOptionPane.showMessageDialog(null, mensagem, "Questão 7", JOptionPane.INFORMATION_MESSAGE, null);
	}	
}
