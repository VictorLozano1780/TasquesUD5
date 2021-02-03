import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD5_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String radio = JOptionPane.showInputDialog("Introduce el radio");
		double radioDouble = Double.parseDouble(radio);
		
		double resultado = Math.PI * Math.pow(radioDouble, 2);
		JOptionPane.showMessageDialog(null, resultado);
	}

}
