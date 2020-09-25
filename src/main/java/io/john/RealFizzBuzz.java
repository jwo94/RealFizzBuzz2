package io.john;

public class RealFizzBuzz {

	public static void computeFizzBuzz(int max) {

		for (int num = 1; num <= max; num++) {
			
			// Place a space between numbers
			if (num != 1) {
				System.out.print(" ");
			}

			// convert number to string to check if it contains '3'
			boolean contains3 = (String.valueOf(num).indexOf('3') > -1);
			
			boolean divisibleBy3 = (num % 3 == 0);
			boolean divisibleBy5 = (num % 5 == 0);

			if (contains3) {
				System.out.print("lucky");
			} else if (divisibleBy3 && divisibleBy5) {
				System.out.print("fizzbuzz");
			} else if (divisibleBy3) {
				System.out.print("fizz");
			} else if (divisibleBy5) {
				System.out.print("buzz");
			} else {
				System.out.print(num);
			}
		}
	}
}