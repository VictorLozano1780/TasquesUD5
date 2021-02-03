import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD5_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double IVA = 0.21;
		String num = JOptionPane.showInputDialog("Que precio tiene el producto?");
		
		double numDouble = Double.parseDouble(num);
		
		JOptionPane.showMessageDialog(null, "El precio final es " + numDouble + (numDouble * IVA));
	}

}
