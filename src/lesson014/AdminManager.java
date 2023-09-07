package lesson014;

public class AdminManager {

	public void basvuruOnayla(Account account) {
		if (account.isKrediBasvurusu()) {
			System.out.println("Kredi başvurunuz onaylanmıştır.");
			account.setMoney(account.getMoney() + account.getIstenenKrediMiktari());
			account.setIstenenKrediMiktari(0);
			account.setKrediBasvurusu(false);
		} else {
			System.out.println(account.getAccountNo() + " nolu hesap için kredi başvurusu bulunmamaktadır.");
		}
	}

	public void basvuruReddet(Account account) {
		if (account.isKrediBasvurusu()) {
			System.out.println("Kredi başvurunuz reddedilmiştir.");
			account.setIstenenKrediMiktari(0);
			account.setKrediBasvurusu(false);
		}
	}
}
