package lesson014;

import java.util.Random;
import java.util.Scanner;

public class Account {

	static Scanner scanner = new Scanner(System.in);
	static Random rnd = new Random();

	private String accountNo;
	private double money;
	private boolean krediBasvurusu;
	private double istenenKrediMiktari;
	private boolean krediBorcuVarMi;
	private double krediBorcu;
	
	public static final int KREDI_PUANI_ARTIS_MIKTARI = 10;

	public double getKrediBorcu() {
		return krediBorcu;
	}

	public void setKrediBorcu(double krediBorcu) {
		this.krediBorcu = krediBorcu;
	}

	public boolean isKrediBorcuVarMi() {
		return krediBorcuVarMi;
	}

	public void setKrediBorcuVarMi(boolean krediBorcuVarMi) {
		this.krediBorcuVarMi = krediBorcuVarMi;
	}

	public Account(double money) {
		this.accountNo = randomGenerateAccountNo();
		this.money = money;
	}

	public double getIstenenKrediMiktari() {
		return istenenKrediMiktari;
	}

	public void setIstenenKrediMiktari(double istenenKrediMiktari) {
		this.istenenKrediMiktari = istenenKrediMiktari;
	}

	public boolean isKrediBasvurusu() {
		return krediBasvurusu;
	}

	public void setKrediBasvurusu(boolean krediBasvurusu) {
		this.krediBasvurusu = krediBasvurusu;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	private String randomGenerateAccountNo() {
		int number = rnd.nextInt(1000, 10000);
		String accNo = Integer.toString(number);
		return accNo;
	}

	
}
