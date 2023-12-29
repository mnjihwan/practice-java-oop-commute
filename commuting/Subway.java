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

}
