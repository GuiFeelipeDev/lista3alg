import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		int x = 0;
		float soma = 0, count = 0, media;
		while(x >= 0){
			x = Integer.valueOf(JOptionPane.showInputDialog("Insira um número positivo:\n"
					+ "(Inserir um número negativo encerrara o programa)"));
			if(x >= 0) {
			soma = soma + x;
			count++;
			}
		};
		media = soma / count;
		JOptionPane.showMessageDialog(null, "A média dos números inseridos é: "+media);
		

	}

}
