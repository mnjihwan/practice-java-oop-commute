package dev.syntax.oop.step03practice.commuting;

public class Student {

	private String name;
	private int money;
	private boolean isOnBoarding;

	public Student(String name, int money) {
		this.name = name;
		this.money = money;
		isOnBoarding = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public boolean getIsOnBoarding() {
		return isOnBoarding;
	}

	public void setIsOnBoarding(boolean isOnBoarding) {
		this.isOnBoarding = isOnBoarding;
	}

	@Override
	public String toString() {
		return "이름 : " + getName() + " / 잔액 : " + getMoney() + " / 탑승 여부 : " + getIsOnBoarding();
	}

}
