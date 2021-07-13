import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		float x = 0f, tempo = 0f;
		String finish = "S";
		
		do {
			x = Float.valueOf(JOptionPane.showInputDialog("Insira a massa do material: "));
			while(x >= 0.10){
					x = x * 0.75f;
					tempo = tempo + 30;
			};
			JOptionPane.showMessageDialog(null, "O tempo para a massa do material ser menor que 0,10 é de "+tempo+
					"s ou "+tempo/60+"m");
			finish = JOptionPane.showInputDialog("Deseja calcular outro valor?\n[S/N]").toUpperCase();
		}while(finish.equals("S"));
		

	}

}
