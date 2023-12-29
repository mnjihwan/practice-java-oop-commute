package dev.syntax.oop.step03practice.commuting;

public abstract class PublicTransport {

	private String typeOfTransport;
	private int sales;
	private int numberOfPassengers;
	private int price;

	public PublicTransport(String typeOfTransport, int price) {
		this.typeOfTransport = typeOfTransport;
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

	public String getTypeOfTransport() {
		return typeOfTransport;
	}

	public void setTypeOfTransport(String typeOfTransport) {
		this.typeOfTransport = typeOfTransport;
	}

	public void takePassenger(Student student) {

		if (student.getMoney() < getPrice()) {
			System.out.println(student.getName() + "님의 잔액이 부족합니다.");

			return;
		} else if (student.getIsOnBoarding()) {
			System.out.println(student.getName() + "님은 이미 " + getTypeOfTransport() + "에 탑승중입니다.");

			return;
		} else {
			eachActionTake(student);
		}

	}

	public void getOffPassenger(Student student) {

		if (student.getIsOnBoarding()) {
			eachActionGetOff(student);
		} else {
			System.out.println(student.getName() + "님은 대중교통에 탑승중이지 않습니다.");
		}

	}

	public abstract void eachActionTake(Student studnet);
	
	public abstract void eachActionGetOff(Student studnet);

}
