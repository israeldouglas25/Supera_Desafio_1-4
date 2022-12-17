package numero.notas.moedas;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumeroNotasMoedas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("DIGITE O VALOR: ");
		double valor = sc.nextDouble();

		List<Integer> notas = Arrays.asList(100, 50, 20, 10, 5, 2);
		List<Double> moedas = Arrays.asList(1.0, 0.50, 0.25, 0.10, 0.05, 0.01);

		int qtdNotas;

		System.out.println("NOTAS:");
		for (Integer nota : notas) {
			qtdNotas = (int) (valor / nota);
			System.out.println(qtdNotas + " nota(s) de R$ " + nota.doubleValue());
			valor -= qtdNotas * nota;
		}

		System.out.println("MOEDAS:");
		for (Double moeda : moedas) {
			qtdNotas = (int) (valor / moeda);
			System.out.println(qtdNotas + " nota(s) de R$ " + moeda);
			valor -= qtdNotas * moeda;
		}

		sc.close();

	}

}
