import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		int num = Integer.valueOf(JOptionPane.showInputDialog
				("Insira a quantidade de termos que deseja comparar: "));
		int x, y = 0, count = 0;
		
		
		for (int c = 1; c <= num; c++) {
			x = Integer.valueOf(JOptionPane.showInputDialog("Insira o "+c+"º número: "));
			if(count < 1) {
				y = x;
				count++;
			}
			
			if(x < y) {
				y = x;
			}
		}
		JOptionPane.showMessageDialog(null, "O menor número é o: "+y);
	}

}
