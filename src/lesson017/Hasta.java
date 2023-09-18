package lesson017;

public class Hasta implements Comparable<Hasta>{

	private static int num;
	private String name;
	private EIllness illnes;
	private int sira;
	
	public Hasta(String name, EIllness illnes) {
		super();
		this.name = name;
		this.illnes = illnes;
		this.sira = num;
		num++;
	}
	
	public static int getNum() {
		return num;
	}

	public int getSira() {
		return sira;
	}

	public void setSira(int sira) {
		this.sira = sira;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public EIllness getIllnes() {
		return illnes;
	}
	
	public void setIllnes(EIllness illnes) {
		this.illnes = illnes;
	}

	@Override
	public String toString() {
		return "Hasta: Adı=" + name + ", Şikayeti=" + illnes+ ", Sıra: "+(sira+1);
	}

	@Override
	public int compareTo(Hasta o) {
		if (this.getIllnes().ordinal()-o.getIllnes().ordinal()==0
				|| (o.getIllnes().ordinal()>=3 &&this.getIllnes().ordinal()>=3)) {
			return this.sira-o.getSira();
		}
		return this.getIllnes().ordinal()-o.getIllnes().ordinal();
	}

	
	
}
