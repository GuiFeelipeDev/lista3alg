import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		for(int c = 0; c < 10; c++) {
			int num = Integer.valueOf(JOptionPane.showInputDialog("Insira um número que deseja ver o cubo: "));
			
			System.out.println(Math.pow(num, 3));
		}
	}

}
