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
	
	public void krediOde(User user,double miktar,boolean isCash) {
		if (user.getAccount().isKrediBorcuVarMi()&& user.getAccount().getKrediBorcu()>miktar) {
			if (isCash) {
				if (miktar>user.getAccount().getMoney()) {
					System.out.println("Hesap bakiyeniz yetersiz..");
					return;
				}
				user.getAccount().setMoney(user.getAccount().getMoney()-miktar);	
			}
			user.getAccount().setKrediBorcu(user.getAccount().getKrediBorcu()-miktar);
			user.setKrediPuanı(user.getKrediPuanı()+User.KREDI_PUANI_ARTIS_MIKTARI);;
			System.out.println("Kredi borcunuzun "+miktar+" TL kadarı ödenmiştir."
					+ "\nGüncel borcunuz: "+user.getAccount().getKrediBorcu());
		}else {
			System.out.println("Kredi borcunuz yoktur.");
		}
	}
}
