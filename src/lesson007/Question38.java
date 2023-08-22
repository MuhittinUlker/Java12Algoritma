package lesson007;

public class Question38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 4, 4, 2, 4, 4, 2, 2, 9, 8 };

		int dortler = 0;
		int ikiler = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 2) {
				ikiler++;
			}
			if (array[i] == 4) {
				dortler++;
			}
		}
		if (ikiler < dortler) {
			System.out.println("Dizide 4ler daha fazla, " + ikiler + " adet 2, " + dortler + " adet 4 var.");
			System.out.println();
		} else if (ikiler>dortler){
			System.out.println("Dizide 2ler daha fazla " + ikiler + " adet 2, " + dortler + " adet 4 var.");
		}else {
			System.out.println("Eşit sayıda var "+ ikiler + " adet 2, " + dortler + " adet 4 var.");
		}

	}

}
