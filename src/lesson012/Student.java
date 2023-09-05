package lesson012;

/*
 * öğrencilerimizin bir numarası ve bir ismi olsun
 * daha sonra kayıt metodu yazalım
 * Mustafa adlı öğrenci başarı ile kayıt edildi öğrenci numarası 1
 * Serkan adlı öğrenci başarı ile kayıt edildi öğrenci numarası 2
 */
public class Student {

	String ogrName;
	int ogrNo;
	static int index;

	public void numaraVer() {
		index++;
		ogrNo = index;
		System.out.println(ogrName + " adlı öğrenci başarı ile kayıt edildi öğrenci numarası " + ogrNo);
	}

	public static Student ogrKayit2(String name) {
		Student student = new Student();
		student.ogrName = name;
		student.numaraVer();
		return student;
	}
}
