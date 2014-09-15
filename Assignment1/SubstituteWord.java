import java.util.Scanner;

public class SubstituteWord {
	
	public static void main(String[] args) {
		//1. Prompt the user to input a sentence.
		System.out.println("Enter a line of text that contains the word ‘hate’, then hit enter");
		//2. Create a new scanner, to scan for user input.
		Scanner scan = new Scanner(System.in);
		//3. Read the sentence.
		String text = scan.nextLine();
		//4. If the word "hate" occurs, substitute it with the word "love".
		if(text.contains("hate"))
		{
			//5. Output the corrected sentence.
			System.out.println("I have rephrased that line to read:");
			System.out.println(text.replaceFirst("hate", "love"));
		}
		else
		{
			//6. Prompt the user that it was not a valid input, if it did not contain the word "hate"
			System.out.println("Please try again with a valid input.");
		}
	}
}