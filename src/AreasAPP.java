import javax.swing.JOptionPane;

public class AreasAPP {

	public static void main(String[] args) {

		// VARIABLES
		String texto = ""; // TEXTO QUE CAMBIARA SEGUN LA ELECCION
		double resultado = 0; // RESULTADO FINAL QUE CAMBIARA SEGUN EL CASO EN EL QUE ESTEMOS

		// PEDIMOS FIGURA POR PANTALLA
		String eleccion = JOptionPane.showInputDialog("Introduce una figura: circulo, triangulo o cuadrado");

		// SWITCH PARA LOS CASOS
		switch (eleccion) {
		case "circulo":
			// PEDIMOS EL RADIO, LO PASAMOS A INT Y EL RESULTADO ES EL MÉTODO PARA EL CÁLCULO
			texto = JOptionPane.showInputDialog("Introduce el radio del circulo");
			int radio = Integer.parseInt(texto);
			resultado = areaCirculo(radio);
			break;
		case "triangulo":
			// PEDIMOS BASE, ALTURA, LAS PASAMOS A INT Y EL RESULTADO ES EL MÉTODO PARA EL CÁLCULO
			texto = JOptionPane.showInputDialog("Introduce la base del triangulo");
			int base = Integer.parseInt(texto);
			texto = JOptionPane.showInputDialog("Introduce la altura del triangulo");
			int altura = Integer.parseInt(texto);
			resultado = areaTriangulo(base, altura);
			break;
		case "cuadrado":
			// PEDIMOS EL LADO, LO PASAMOS A INT Y EL RESULTADO ES EL MÉTODO PARA EL CÁLCULO
			texto = JOptionPane.showInputDialog("Introduce el lado del cuadrado");
			int lado = Integer.parseInt(texto);
			resultado = areaCuadrado(lado);
			break;
		// SI NO HAY NINGUNA OPCION, SYSO
		default:
			System.out.println("No has introducido la figura correcta");
		}
		// UNA VEZ HA SALIDO DEL MÉTODO, SYSO CON EL RESULTADO FINAL
		System.out.println("El area del " + eleccion + " es " + resultado);
	}

	// MÉTODO DEL CALCULO DEL ÁREA DEL CÍRCULO
	public static double areaCirculo(int radio) {
		return Math.pow(radio, 2) * Math.PI;
	}

	// MÉTODO DEL CÁLCULO DEL ÁREA DEL TRIÁNGULO
	public static double areaTriangulo(int base, int altura) {
		return base * altura / 2;
	}

	// MÉTODO DEL CÁLCULO DEL ÁREA DEL CUADRADO
	public static double areaCuadrado(int lado) {
		return lado * lado;
	}
}
