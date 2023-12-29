package dev.syntax.oop.step03practice.commuting;

public class Subway extends PublicTransport {

	private String line;

	public Subway(String line, String typeOfTransport, int price) {
		super(typeOfTransport, price);
		this.line = line;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	@Override
	public String toString() {
		return "지하철 " + getLine() + "호선에 탑승중인 승색 수는 " + getNumberOfPassengers() + "명이고, 매출액은 " + getSales() + "원입니다.";
	}

	@Override
	public void eachActionTake(Student student) {
//		개별로 작동될 부분
		System.out.println(student.getName() + "님이 " + getTypeOfTransport() + "에 탑승하셨습니다.");

		student.setIsOnBoarding(true);
		student.setMoney(student.getMoney() - getPrice());
		setSales(getSales() + getPrice());
		setNumberOfPassengers(getNumberOfPassengers() + 1);
//		개별로 작동될 부분
	}

	@Override
	public void eachActionGetOff(Student student) {
//		개별로 작동될 부분
		student.setIsOnBoarding(false);
		setNumberOfPassengers(getNumberOfPassengers() - 1);

		System.out.println(student.getName() + "님이 " + getTypeOfTransport() + "에서 하차하셨습니다.");
//		개별로 작동될 부분
	}

}
