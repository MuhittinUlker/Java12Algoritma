package lesson007;

import java.util.Arrays;

public class Question39 {

	public static void main(String[] args) {
		
		// int[] sayilar = { 0, 120, -5, -85, -256, 16, 1258, 81, 14 };
		// negatif sayıları yeni arraye at
		
		int[] sayilar = { 0, 120, -5, -85, -256, 16, 1258, 81, 14 };
		int eksiler=0,index=0;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i]<0) {
				eksiler++;
			}
		}
		int[] negatifSayilar = new int[eksiler];
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i]<0) {
			negatifSayilar[index]=sayilar[i];
			index++;
			}
			
		}
		System.out.println(Arrays.toString(negatifSayilar));
	}

}
