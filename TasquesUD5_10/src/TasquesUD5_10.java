import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author V�ctor Lozano
 *
 */
public class TasquesUD5_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = JOptionPane.showInputDialog("N�mero de ventas");
		double numVentas = Double.parseDouble(num);
		double aux = 0;
		double precioFinal = 0;
		
		for (int i = 1; i <= numVentas; i++) {
			String precio = JOptionPane.showInputDialog("Que precio tiene la venta n�mero " + i);
			precioFinal = Double.parseDouble(precio);
			precioFinal = precioFinal + aux;
			aux = precioFinal;
		}
		JOptionPane.showMessageDialog(null, "El precio final es de " + precioFinal);
		
	}

}
