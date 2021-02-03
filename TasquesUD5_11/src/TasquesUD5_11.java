import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD5_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String diaSemana = JOptionPane.showInputDialog("Que dia de la semana quieres?");
		
		switch (diaSemana.toLowerCase()) {
		case "lunes":
			JOptionPane.showMessageDialog(null, "Es laborable");
			break;
		case "martes":
			JOptionPane.showMessageDialog(null, "Es laborable");
			break;
		case "miercoles":
			JOptionPane.showMessageDialog(null, "Es laborable");
			break;
		case "jueves":
			JOptionPane.showMessageDialog(null, "Es laborable");
			break;
		case "viernes":
			JOptionPane.showMessageDialog(null, "Es laborable");
			break;
		case "sabado":
			JOptionPane.showMessageDialog(null, "No es laborable");
			break;
		case "domingo":
			JOptionPane.showMessageDialog(null, "No es laborable");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Este dia no existe");
			
		}
	}

}
