import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GettyScanner {

	public static void main(String[] args) throws FileNotFoundException {
		
		int totalWords = 0;
		int avgLengthTracker = 0;
		String word;
		
		Scanner f = new Scanner(new File("GettysburgAddress.txt"));
		ArrayList<String> words = new ArrayList<String>();
		
		while (f.hasNext()) {
			word = f.next();
			word = word.replace(".", "");
			word = word.replace(",", "");
			if(word.contains("-")) {
				String tempWord = "";
				for (int i = 0; i<word.length(); i++) {
					if (word.charAt(i)!='-') {
						tempWord += word.charAt(i);
					}
					else {
						System.out.println(tempWord);
						tempWord = "";
						//add to array
					}
				}
				if(tempWord.length()>0)System.out.println(tempWord);
			}
			else {
				System.out.println(word);
			}
					
		}
		
	}

}
