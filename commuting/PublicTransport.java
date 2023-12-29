package dev.syntax.oop.step03practice.commuting;

public class PublicTransport {

	private int sales;
	private int numberOfPassengers = 0;
	private int price;

	public PublicTransport(int price) {
		this.price = price;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void takePassenger(Student student) {

		if (student.getMoney() < getPrice()) {
			System.out.println(student.getName() + "님의 잔액이 부족합니다.");

			return;
		} else if (student.getIsOnBoarding()) {
			System.out.println(student.getName() + "님은 이미 대중교통에 탑승중입니다.");

			return;
		} else {
			System.out.println(student.getName() + "님이 탑승하셨습니다.");

			student.setIsOnBoarding(true);
			student.setMoney(student.getMoney() - getPrice());
			setSales(getSales() + getPrice());
			setNumberOfPassengers(getNumberOfPassengers() + 1);
		}

	}

	public void getOffPassenger(Student student) {

		if (student.getIsOnBoarding()) {
			student.setIsOnBoarding(false);
			setNumberOfPassengers(getNumberOfPassengers() - 1);

			System.out.println(student.getName() + "님이 하차하셨습니다.");
		} else {
			System.out.println(student.getName() + "님은 대중교통에 탑승중이지 않습니다.");
		}

	}

}
