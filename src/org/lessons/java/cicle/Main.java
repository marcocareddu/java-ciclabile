package org.lessons.java.cicle;

public class Main {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		Cicler cycler = new Cicler(numbers);

		for(int i = 0; i < numbers.length; i++) {
			System.out.println(cycler.getNextElement());
			System.out.println(cycler.hasMoreElements());
		}
	}
}
