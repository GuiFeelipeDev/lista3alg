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
			
			idade = random.nextInt(19)+12; //Gera uma aleat�ria idade de 12 a 30 anos
			nota = random.nextInt(5);//Gera a nota de 0 a 4 -> A a E
			
			//Contabiliza��o de respostas
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
			//Diferen�a percentual de bom e regular
			difper = bom - regular;//como � por 100 a diferen�a � a mesma que a diferen�a da porcentagem
			if(difper < 0) {
				difper = difper * (-1);//mantendo a diferen�a sempre positiva
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
			//A porcentagem � o propio n�mero
			if(nota == 4) {
				if(idade > maiorIdadePes) {
					maiorIdadePes = idade;
				}
			}
			//---------------------------------------------
			//Maior idade que respondeu �timo e a maior que respondeu Ruim
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
		//Calculo diferen�a de idade otimo e ruim
		difOtRu = maiorIdadeOt - maiorIdadeRu;
		if(difOtRu < 0) {
			difOtRu = difOtRu * (-1);//mantendo a diferen�a sempre positiva
		}
		if(maiorIdadeOt > maiorIdadeRu) {
			maiorOtRu = "�timo";
		}else if (maiorIdadeRu > maiorIdadeOt) {
			maiorOtRu = "ruim";
		}else {
			maiorOtRu = "empate";
		}
		//-----------------------------------------
		//RESULTADOS FINAIS
		JOptionPane.showMessageDialog(null,                    
				  "====RESULTADOS==========================================\n"
				+ otimo+" responderam '�timo'.\n"
				+ "________________________________________________________________\n"
				+ "A diferen�a de respostas 'Bom' e 'Regular' � de "+difper
				+ "% a mais para o "+maisVotado+".\n"
				+ "________________________________________________________________\n"
				+ "A media de idade das pessoas que responderam 'Ruim' � de "+df.format(mediaIdade)+" anos.\n"
				+ "________________________________________________________________\n"
				+ pessimo+"% das pessoas responderam 'P�ssimo', e a maior idade que votou\nnessa op��o "
				+ "foi "+maiorIdadePes+" anos.\n"
				+ "________________________________________________________________\n"
				+ "A diferen�a entre a maior idade dos que responderam '�timo' e dos\n"
				+ "que responderam 'Ruim' � de "+difOtRu+" para o "+maiorOtRu+".\n"
				+ "________________________________________________________________\n");
		
	}
}
