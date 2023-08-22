package lesson007;

public class Question37 {

	public static void main(String[] args) {
		
		// dizideki sayıların toplamı ve çift tek olanları söyleyen
		
		int[] sayilar = {2,4,10,5,66,55,33,12,43};
		int toplam=0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam+=sayilar[i];
			if(sayilar[i]%2==0)
			{
				System.out.println(sayilar[i]+" çifttir");
			}else {
				System.out.println(sayilar[i]+" tektir");
			}
		}
		System.out.println("Toplam: "+toplam);
	}
}
