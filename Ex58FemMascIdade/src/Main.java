import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		float idade = 0, media = 0;
		int sexo, masc = 0, fem = 0, fem3045 = 0, pessoas = 0;
		do {
			idade = Float.valueOf(JOptionPane.showInputDialog("Insira sua idade:\n"
					+ "(Digitar 0 ou negativo encerra o programa)"));
			if(idade > 0) {	
				sexo = Integer.valueOf(JOptionPane.showInputDialog("Insira seu sexo:\n[0]Masculino\n[1]Feminino"));
				while(sexo != 0 && sexo != 1) {
					sexo = Integer.valueOf(JOptionPane.showInputDialog("Insira seu sexo:\n[0]Masculino\n[1]Feminino"));
				}
				switch(sexo) {
				case 0: masc++;
				break;
				case 1: fem++;
				break;
				};
			//Idade Media
				media = media + idade;
				pessoas++;
			//Feminino entre 30 e 45
				if(idade > 30 && idade < 45) {
					fem3045++;
				};
			}
		}while(idade > 0);
		media = media / pessoas;
		JOptionPane.showMessageDialog(null, 
		"RESULTADO\n"
		+"A média de idade é "+media
		+"\nA quantidade de pessoas do sexo feminino\n"
		+"com idade entre 30 e 45 anos é de "+fem3045
		+"\nO total de pessoas do sexo masculino é "+masc);
	}

}
