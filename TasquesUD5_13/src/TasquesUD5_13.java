import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD5_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = JOptionPane.showInputDialog("Inserta el 1r numero");
		String num2 = JOptionPane.showInputDialog("Inserta el 2do numero");
		String simbolo = JOptionPane.showInputDialog("Inserta un simbolo");
		
		int ope1 = Integer.parseInt(num1);
		int ope2 = Integer.parseInt(num2);
		
		if(simbolo.equals("+")) {
			JOptionPane.showMessageDialog(null, ope1 + ope2);
		} else if(simbolo.equals("-")) {
			JOptionPane.showMessageDialog(null, ope1 - ope2);
		} else if(simbolo.equals("*")) {
			JOptionPane.showMessageDialog(null, ope1 * ope2);
		} else if(simbolo.equals("/")) {
			double ope1Divi = Double.parseDouble(num1);
			double ope2Divi = Double.parseDouble(num2);
			JOptionPane.showMessageDialog(null, ope1Divi / ope2Divi);
		} else if(simbolo.equals("^")) {
			JOptionPane.showMessageDialog(null, ope1 ^ ope2);
		} else if(simbolo.equals("%")) {
			JOptionPane.showMessageDialog(null, ope1 % ope2);
		} else {
			JOptionPane.showMessageDialog(null, "Este simbolo no esta disponible");
		}
	}

}
