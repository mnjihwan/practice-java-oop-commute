package dev.syntax.oop.step03practice.commuting;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("김경은", 10000);
		Student student2 = new Student("이진천", 100000);
		Student student3 = new Student("김남혁", 1_000_000_000);
		Student student4 = new Student("문지환", 1000);

		Bus bus = new Bus("271", 1200);
		Subway subway = new Subway("2", 1500);

		bus.takePassenger(student1);
		bus.takePassenger(student2);
		subway.takePassenger(student3);

		System.out.println("===============================================");

		bus.takePassenger(student3);
		subway.takePassenger(student4);

		System.out.println("===============================================");

		System.out.println(bus);
		System.out.println(subway);

		System.out.println("===============================================");

		System.out.println(student3);
		System.out.println(student4);

		System.out.println("===============================================");

		bus.getOffPassenger(student3);
		subway.getOffPassenger(student4);

		System.out.println("===============================================");

		System.out.println(bus);
		System.out.println(subway);

		System.out.println("===============================================");

		System.out.println(student3);
		System.out.println(student4);

	}

}
