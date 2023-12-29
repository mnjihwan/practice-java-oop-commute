package dev.syntax.oop.step03practice.commuting;

public class Bus extends PublicTransport {

	String busNumber;

	public Bus(String busNumber, int price) {
		super(price);
		this.busNumber = busNumber;
	}

	@Override
	public String toString() {
		return busNumber + "번 버스에 탑승중인 승색 수는 " + numberOfPassengers + "명이고, 매출액은 " + sales + "원입니다.";
	}

}
