package lesson007;

public class Question40 {

	public static void main(String[] args) {
		
		//int[] sayilar = { 0, 120, -5, -85, -256, 16, 1258, 81, 14 };
		// dizideki en büyük ikinci sayıyı bulalım
		
		int[] sayilar = { 0, 120, -5, -85, -256, 16, 1258, 81, 14 };

		int max=sayilar[0];
		int max2=sayilar[1];
		
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i]>max)
			{
				max2=max;
				max=sayilar[i];
			}else if(sayilar[i]>max2 && sayilar[i]!=max) {
				max2=sayilar[i];
			}
		}
		System.out.println("En büyük ikinci sayı: "+max2);
	}
}
