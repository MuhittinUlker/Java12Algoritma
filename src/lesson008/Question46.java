package lesson008;

public class Question46 {

	public static void main(String[] args) {
		
		// bir dizide ard arda gelen 2 indexin sayı değeri 2 ise true yoksa false yazdır.

		int[] sayilar = { 2,2,2, 120, 2, -85, -256, 2,2, 1258, 81, 14 ,2};

		boolean varMi = false;
		
		int sayac=0; 
		
		for (int i = 0; i < sayilar.length-1; i++) {
			if (sayilar[i]==2 && sayilar[i+1]==2) {
				varMi=true;
				sayac++;
			}
		}
		System.out.println(varMi+" = toplam "+sayac+" adet ard arda 2 var.");
	}

}
