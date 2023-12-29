package dev.syntax.oop.step03practice.commuting;

public class Student {
	String name;
	int money;
	boolean isOnBoarding;

	public Student(String name, int money) {
		this.name = name;
		this.money = money;
		isOnBoarding = false;
	}

	@Override
	public String toString() {
		return "이름 : " + name + " / 잔액 : " + money + " / 탑승 여부 : " + isOnBoarding;
	}

}
