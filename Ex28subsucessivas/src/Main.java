import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		
		int A = Integer.valueOf(JOptionPane.showInputDialog("Insira o valor de A: "));
		int B = Integer.valueOf(JOptionPane.showInputDialog("Insira o valor de B: "));
		int sub = A;
		do{
			sub = sub - B;
		}while(B <= sub);
		JOptionPane.showMessageDialog(null, "O resto da divis�o de "+A+" por "+B+" � igual a "+sub);;
		
	}

}
