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

}
