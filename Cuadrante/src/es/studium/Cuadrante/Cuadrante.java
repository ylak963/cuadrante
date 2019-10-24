package es.studium.Cuadrante;

import java.util.Scanner;

public class Cuadrante {
	public static void main(String[] args) {

		double x, y;
		int cuadrante;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Indique el valor de la coordenada x:");
		x = teclado.nextDouble();
		System.out.println("Indique el valor de la coordenada y:");
		y = teclado.nextDouble();

		cuadrante = FuncionCuadrante(x, y);
		System.out.println("El punto dado pertenece al cuadrante nº:" + cuadrante);
		teclado.close();

	}

	private static int FuncionCuadrante(double x, double y) {
		int c = 0;
		if (x >= 0 && y >= 0) {
			c = 1;
		}
		if (x < 0 && y >= 0) {
			c = 2;
		}
		if (x < 0 && y < 0) {
			c = 3;
		}
		if (x >= 0 && y < 0) {
			c = 4;
		}

		return c;
	}

}
