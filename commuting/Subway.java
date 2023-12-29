package dev.syntax.oop.step03practice.commuting;

public class Subway extends PublicTransport {

	String line;

	public Subway(String line, int price) {
		super(price);
		this.line = line;
	}

	@Override
	public String toString() {
		return "지하철 " + line + "호선에 탑승중인 승색 수는 " + numberOfPassengers + "명이고, 매출액은 " + sales + "원입니다.";
	}

}
