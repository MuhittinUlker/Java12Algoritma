package lesson012;

public class Main {

	public static void main(String[] args) {

		Student ogr1 = new Student();
		ogr1.ogrName = "Mustafa";
		ogr1.numaraVer();

		Student ogr2 = new Student();
		ogr2.ogrName = "Serkan";
		ogr2.numaraVer();

		Student ogr3 = new Student();
		ogr3.ogrName = "Hilal";
		ogr3.numaraVer();

		System.out.println(ogr1.ogrNo);
		System.out.println(ogr2.ogrNo);
		System.out.println(ogr3.ogrNo);

		Student student1 = Student.ogrKayit2("Mehmet");
		Student student2 = Student.ogrKayit2("Ali");
		Student student3 = Student.ogrKayit2("Zeynep");

		System.out.println(student1.ogrName+"="+student1.ogrNo);
		System.out.println(student2.ogrName+"="+student2.ogrNo);
		System.out.println(student3.ogrName+"="+student3.ogrNo);

	}

}
