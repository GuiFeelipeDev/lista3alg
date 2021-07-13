import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		int N = Integer.valueOf(JOptionPane.showInputDialog("Insira o termo N: "));
		float y = N;
		float soma = 0f;
		for(float x = 1; x <= N; x++) {
			
			System.out.print(x+"/"+y);
			if(y > 1) {
				System.out.print(" + ");
			}
			soma = soma + (x / y);
			y--;
		}
		System.out.println(" = "+soma);
	}

}
