import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int voto = 0, candidato1 = 0, candidato2 = 0, candidato3 = 0, nulo = 0, branco = 0, vencedor, qntvotos,
				eleitores = 0;
		do {
			voto = Integer.valueOf(JOptionPane.showInputDialog(
					 "===URNA ELETRÕNICA=================\n"
					+"[1]Candidato 1\n"
					+"[2]Canditado 2\n"
					+"[3]Canditado 3\n"
					+"[0]Nulo\n"
					+"[4]Branco\n"
					+"('-1' para finalizar)"));
			if(voto != 0) {
				switch(voto) {
				case 1: candidato1++;
				break;
				case 2: candidato2++;
				break;
				case 3: candidato3++;
				break;
				case 0: branco++;
				break;
				}
				if(voto != 1 && voto != 2 && voto != 3 && voto != 0) {
					nulo++;
				}
				eleitores++;
				
			}
		}while(voto != -1);
		if(candidato1 > candidato2 && candidato1 > candidato3) {
			vencedor = 1;
			qntvotos = candidato1;
		}else if(candidato2 > candidato1 && candidato2 > candidato3) {
			vencedor = 2;
			qntvotos = candidato2;
		}else {
			vencedor = 3;
			qntvotos = candidato3;
		}
		
		JOptionPane.showMessageDialog(null, 
				  "===RESULTADO================\n"
				+ "O vencedor foi o candidato "+vencedor+" com "+qntvotos+" votos!\n\n"
				+ "Houveram "+branco+" votos em branco!\n\n"
				+ "Houveram "+nulo+" votos nulos!\n\n"
				+ eleitores+" eleitores compareceram as urnas!");
	}

}
