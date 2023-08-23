package lesson008;

public class Question44 {

	public static void main(String[] args) {
		
		// toplayıp sonuçları yeni matrise yazdıralım
		
		int[][] matris1 = {{5,6,2}, {9,1,6}};
        int[][] matris2 = {{3,4,1}, {1,3,6}};
        int[][] matris3 = new int[2][3];
        
		for (int i = 0; i < matris1.length; i++) {
			for (int j = 0; j < matris2[0].length; j++) {
				matris3[i][j]=matris1[i][j]+matris2[i][j];
				System.out.print(matris3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
