package dev.syntax.oop.step03practice.commuting;

public class PublicTransport {

	int sales;
	int numberOfPassengers = 0;
	int price;

	public PublicTransport(int price) {
		this.price = price;
	}

	void takePassenger(Student student) {

		if (student.money < price) {
			System.out.println(student.name + "님의 잔액이 부족합니다.");

			return;
		}

		if (student.isOnBoarding) {
			System.out.println(student.name + "님은 이미 대중교통에 탑승중입니다.");

			return;
		}

		System.out.println(student.name + "님이 탑승하셨습니다.");

		student.isOnBoarding = true;
		student.money -= price;
		sales += price;
		numberOfPassengers++;

	}

	void getOffPassenger(Student student) {

		if (student.isOnBoarding) {
			student.isOnBoarding = false;
			numberOfPassengers--;

			System.out.println(student.name + "님이 하차하셨습니다.");
		} else {
			System.out.println(student.name + "님은 대중교통에 탑승중이지 않습니다.");
		}

	}

}
