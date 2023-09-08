package lesson014;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String name;
	private String surname;
	private String email;
	private Account account;
	private int krediPuanı;
	public static final int KREDI_PUANI_ARTIS_MIKTARI = 10;
	private List<Mail> gelenKutusu;
	public User() {

	}

	public User(String name, String surname) {
		this.name = name;
		this.surname = surname;
		this.email = UserManager.generateEmail(name, surname);
		this.gelenKutusu=new ArrayList<Mail>();
	}

	public List<Mail> getGelenKutusu() {
		return gelenKutusu;
	}

	public void setGelenKutusu(List<Mail> gelenKutusu) {
		this.gelenKutusu = gelenKutusu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getKrediPuanı() {
		return krediPuanı;
	}

	public void setKrediPuanı(int krediPuanı) {
		this.krediPuanı = krediPuanı;
	}


}
