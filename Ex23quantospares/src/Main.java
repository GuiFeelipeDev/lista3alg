import java.util.Random;
import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int x, counter = 0, counterimp = 0;
		for(int c = 0; c < 200; c++) {
			x = random.nextInt(100001);
			if(x % 2 == 0) {
				counter++;
			}else {
				counterimp++;
			}
		}
		JOptionPane.showMessageDialog(null, "Foram inseridos "+counter+" números pares e "
				+ ""+counterimp+" números ímpares.");

	}

}
