import javax.swing.JOptionPane;

public class AreasAPP {

	public static void main(String[] args) {
		// Declaramos esta variable para reutilizarla
		String texto = ""; // Variable que cambiara segun el caso en el que estemos
		// Declaramos esta variable para el resultado final
		double resultado = 0; // Variable que cambiara segun el caso en el que estemos
		String eleccion = JOptionPane.showInputDialog("Introduce una figura: circulo, triangulo o cuadrado");
		// Entramos en los casos y pedimos el resultado donde nos vamos al metodo que
		// toca
		switch (eleccion) {
		case "circulo":
			texto = JOptionPane.showInputDialog("Introduce el radio del circulo");
			int radio = Integer.parseInt(texto);
			resultado = areaCirculo(radio);
			break;
		case "triangulo":
			texto = JOptionPane.showInputDialog("Introduce la base del triangulo");
			int base = Integer.parseInt(texto);
			texto = JOptionPane.showInputDialog("Introduce la altura del triangulo");
			int altura = Integer.parseInt(texto);
			resultado = areaTriangulo(base, altura);
			break;
		case "cuadrado":
			texto = JOptionPane.showInputDialog("Introduce el lado del cuadrado");
			int lado = Integer.parseInt(texto);
			resultado = areaCuadrado(lado);
			break;
		default:
			System.out.println("No has introducido la figura correcta");
		}
		System.out.println("El area del " + eleccion + " es " + resultado);
	}

	public static double areaCirculo(int radio) {
		return Math.pow(radio, 2) * Math.PI;
	}

	public static double areaTriangulo(int base, int altura) {
		return base * altura / 2;
	}

	public static double areaCuadrado(int lado) {
		return lado * lado;
	}
}
