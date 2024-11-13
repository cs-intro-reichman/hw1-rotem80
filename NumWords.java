// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
		int numOnes = number % 10;
		number = number / 10;
		int numTens = number % 10;
		number = number / 10;
		int numHandreds = number;
		System.out.println(numHandreds + " handreds, " + numTens + " tens, " + numOnes + " ones");

	}
}
