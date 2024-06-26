import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C;
		double areaQuadrado, areaTriangulo, areaTrapezio;

		System.out.print("Digite a medida A: ");
		A = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		B = sc.nextDouble();
		System.out.print("Digite a medida C: ");
		C = sc.nextDouble();

		areaQuadrado = (A * A);
		areaTriangulo = (A * B) / 2;
		areaTrapezio = ((A + B) * C) / 2;

		System.out.printf("A área do quadrado é de %.4f%n", areaQuadrado);
		System.out.printf("A área do triângulo é de %.4f%n", areaTriangulo);
		System.out.printf("A área do trapézio é de %.4f", areaTrapezio);

		sc.close();

	}

}
