import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		float x, y = 0, count = 0, media;
		String finish = "S";
		
		do {
			x = 0;
			while(x >= 0)  {
				x = Integer.valueOf(JOptionPane.showInputDialog("Insira um n�mero positivo para a m�dia: \n"
						+ "(-1 para finalizar)"));
				if(x>=0) {
					y = y + x;
					count++;			
				}			
				
			}
			media = y / count;
			JOptionPane.showMessageDialog(null, "A m�dia � "+media);
			finish = JOptionPane.showInputDialog("Deseja inserir outro conjunto?\n[S/N]");
			finish = finish.toUpperCase();
		}while(finish.equals("S"));

	}

}
