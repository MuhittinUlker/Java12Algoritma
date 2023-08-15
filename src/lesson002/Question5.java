package lesson002;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		// Girilen TL değerini USD çeviren program

		Scanner scanner = new Scanner(System.in);

		double tlDegeri, usdDegeri, cevrim;

		System.out.println("TL miktarını giriniz:");
		tlDegeri = scanner.nextDouble();

		System.out.println("USD kurunu giriniz:");
		usdDegeri = scanner.nextDouble();

		cevrim = tlDegeri / usdDegeri;

		System.out.println(tlDegeri + "TL'niz " + cevrim + " USD");

	}

}
