package dev.syntax.oop.step03practice.commuting;

public class Bus extends PublicTransport {

	private String busNumber;

	public Bus(String busNumber, String typeOfTransport, int price) {
		super(typeOfTransport, price);
		this.busNumber = busNumber;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	@Override
	public String toString() {
		return getBusNumber() + "번 버스에 탑승중인 승색 수는 " + getNumberOfPassengers() + "명이고, 매출액은 " + getSales() + "원입니다.";
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
