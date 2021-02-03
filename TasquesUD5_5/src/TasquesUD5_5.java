import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD5_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = JOptionPane.showInputDialog("Pon un numero");
		
		double numDouble = Double.parseDouble(num);
		if (numDouble%2 == 0) {
			JOptionPane.showInternalMessageDialog(null, "Es divisible por 0");
		} else {
			JOptionPane.showInternalMessageDialog(null, "No es divisible por 0");
		}
	}

}
