package lesson008;

public class Question49 {

	public static void main(String[] args) {

		// dizide var ise hem 13ü hemde bir sonraki değeri dahil etmeden toplayalım

		int sayilar[] = { 1, 13, 13, 13, 2, 5, 13, 1 };

		int toplam = 0;

		/*
		 * for (int i = 0; i < sayilar.length ; i++) { if (sayilar[i]==13) { continue;
		 * }else if (i<sayilar.length-1 && sayilar[i+1]==13) { continue; }else {
		 * toplam+=sayilar[i]; } } System.out.println("Toplam: "+toplam);
		 */

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == 13 || (i > 0 && sayilar[i - 1] == 13)) {
				continue;
			} else {
				toplam += sayilar[i];
			}

		}
		System.out.println("Toplam: " + toplam);
	}

}
