package lesson003;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// telefona ve maile kod gelecek (tanımlayacağız)
		// kodları kullanıcıdan isteyeceğiz
		// kodlar uyuşuyorsa sisteme kayıt olundu
		// hatalıyı söyleyecek
		
		int telefonKod=123;
		int mailKod=456;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Telefonunuza gelen kodu giriniz:");
		int telefonKod1 = scanner.nextInt();

		System.out.println("MAilinize gelen kodu sayıyı giriniz:");
		int mailKod1 = scanner.nextInt();

		if(telefonKod==telefonKod1 && mailKod==mailKod1) {
			
			System.out.println("Sisteme kayıt olundu");
		}
			else if(mailKod==mailKod1 && telefonKod!=telefonKod1) {
				System.err.println("Telefon Kodu Hatalı");
			}
			else if(mailKod!=mailKod1 && telefonKod==telefonKod1) {
				System.err.println("Mail Kodu Hatalı");
			}
			else if(mailKod!=mailKod1 && telefonKod!=telefonKod1) {
				System.err.println("Telefon ve Mail Kodu Hatalı");
			}
	}

}
