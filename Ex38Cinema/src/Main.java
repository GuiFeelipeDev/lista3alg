import javax.swing.JOptionPane;
import java.util.Random;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.00");
		Random random = new Random();//Usei o random pra inserir os valores
		int difper = 0, nota, otimo = 0, bom = 0, 
				regular = 0, ruim = 0, pessimo = 0;
		//usei a nota como int, sendo 0 = A e 4 = E
		String maisVotado = null, maiorOtRu = null;
		float idade, mediaIdade, somaIdades = 0, maiorIdadePes = 0, 
				maiorIdadeOt = 0, maiorIdadeRu = 0, difOtRu;
		for(int c = 0; c < 100; c++) {
			
			idade = random.nextInt(19)+12; //Gera uma aleatória idade de 12 a 30 anos
			nota = random.nextInt(5);//Gera a nota de 0 a 4 -> A a E
			
			//Contabilização de respostas
			switch(nota){
			case 0: otimo++;
			break;
			case 1: bom++;
			break;
			case 2: regular++;
			break;
			case 3: ruim++;
			break;
			case 4: pessimo++;
			break;
			}
			//--------------------------
			//Diferença percentual de bom e regular
			difper = bom - regular;//como é por 100 a diferença é a mesma que a diferença da porcentagem
			if(difper < 0) {
				difper = difper * (-1);//mantendo a diferença sempre positiva
			}
			if(bom > regular) {
				maisVotado = "bom";
			}else if(regular > bom) {
				maisVotado = "regular";
			}else {
				maisVotado = "empate";
			}
			//--------------------------------------
			//Soma das idades de quem respondeu ruim
			if(nota == 3) {
				somaIdades = somaIdades + idade;
			}
			//---------------------------------------
			//Porcentagem de pessimos e maior idade que votou
			//A porcentagem é o propio número
			if(nota == 4) {
				if(idade > maiorIdadePes) {
					maiorIdadePes = idade;
				}
			}
			//---------------------------------------------
			//Maior idade que respondeu Ótimo e a maior que respondeu Ruim
			if(nota == 0) {//Maior idade OTIMO
				if(idade > maiorIdadeOt) {
					maiorIdadeOt = idade;
				}
			}
			if(nota == 3) {//Maior idade RUIM
				if(idade > maiorIdadeRu) {
					maiorIdadeRu = idade;
				}
			}			
			//--------------------------------------------
		}
		//Calculo da media de quem respondeu ruim
		mediaIdade = somaIdades/ruim;
		//-------------------------------------
		//Calculo diferença de idade otimo e ruim
		difOtRu = maiorIdadeOt - maiorIdadeRu;
		if(difOtRu < 0) {
			difOtRu = difOtRu * (-1);//mantendo a diferença sempre positiva
		}
		if(maiorIdadeOt > maiorIdadeRu) {
			maiorOtRu = "ótimo";
		}else if (maiorIdadeRu > maiorIdadeOt) {
			maiorOtRu = "ruim";
		}else {
			maiorOtRu = "empate";
		}
		//-----------------------------------------
		//RESULTADOS FINAIS
		JOptionPane.showMessageDialog(null,                    
				  "====RESULTADOS==========================================\n"
				+ otimo+" responderam 'Ótimo'.\n"
				+ "________________________________________________________________\n"
				+ "A diferença de respostas 'Bom' e 'Regular' é de "+difper
				+ "% a mais para o "+maisVotado+".\n"
				+ "________________________________________________________________\n"
				+ "A media de idade das pessoas que responderam 'Ruim' é de "+df.format(mediaIdade)+" anos.\n"
				+ "________________________________________________________________\n"
				+ pessimo+"% das pessoas responderam 'Péssimo', e a maior idade que votou\nnessa opção "
				+ "foi "+maiorIdadePes+" anos.\n"
				+ "________________________________________________________________\n"
				+ "A diferença entre a maior idade dos que responderam 'Ótimo' e dos\n"
				+ "que responderam 'Ruim' é de "+difOtRu+" para o "+maiorOtRu+".\n"
				+ "________________________________________________________________\n");
		
	}
}
