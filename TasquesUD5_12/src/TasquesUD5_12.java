import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author V�ctor Lozano
 *
 */
public class TasquesUD5_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String passwd = "hola";
		
		for (int i = 1; i <= 3; i++) {
			String correcto = JOptionPane.showInputDialog("Pon la contrase�a");
			
			if (passwd.equals(correcto)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				i = 4;
			} else {
				JOptionPane.showMessageDialog(null, "Incorrecto");
			}
		}
	}

}
