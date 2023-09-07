package lesson014;

public class UserManager {

	public static String generateEmail(String name, String surname) {
		return name + "." + surname + "@xbanka.com";	 
	}
	
	public void krediBasvurusu(Account account, Double miktar) {
		
		account.setKrediBasvurusu(true);
		account.setIstenenKrediMiktari(miktar);
		
		System.out.println(miktar+" TL değerinde başvurunuz alındı.\nLütfen onay bekleyin...");
		
	}
}
