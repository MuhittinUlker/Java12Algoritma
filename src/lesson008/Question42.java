package lesson008;

public class Question42 {

	public static void main(String[] args) {
		
		// 3*3 boş matris oluşturun
		// 1 1 1
		// 2 2 2
		// 3 3 3 çıktısı verecek

		int[][]dizi=new int[3][3];
		
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				dizi[i][j]=i+1;
				System.out.print(dizi[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
