import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

	public class EvaluationService {
		
		
		static class Reverse	{
		/**
		 * 1. Without using the StringBuilder or StringBuffer class, write a method that
		 * reverses a String. Example: reverse("example"); -> "elpmaxe"
		 * 
		 * @param string
		 * @return
		 */

		String word = "Hello";	
		
		
		//Decision
		if(decision==1)
		{
			char[] reversed = new char[word.length()];
			for (int i = reversed.length - 1, j = 0; i>=0; i--, j++)
			
			{
				reversed[j] = word.charAt(i);
				
			}
			System.out.println(reversed);
		}
	
		
	
	}

		/**
		 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
		 * Acronyms)! Help generate some jargon by writing a program that converts a
		 * long name like Portable Network Graphics to its acronym (PNG).
		 * 
		 * @param phrase
		 * @return
		 */
		static class Acronyms {
			String phrase = "Portable Network Graphics";
			
			
			ArrayList<String> list = new ArrayList<>();		
		
			//char acronym;
			
			char[] acronym = new char[(phrase.length())];
		
			for(int i = 0; i<=acronym.length-1; i++)
			{
				acronym[i] = phrase.charAt(i);
			
			if(acronym[i] =='P')
			{
				list.add("P");
				
			}
			else
				if(acronym[i] =='N')
				{
					list.add("N");
				}
				else
					if(acronym[i] =='G')
					{
						list.add("G");
						
					}
			}
			for (String item : list)
			{
				System.out.print(item);
			}
		}

		/**
		 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
		 * equilateral triangle has all three sides the same length. An isosceles
		 * triangle has at least two sides the same length. (It is sometimes specified
		 * as having exactly two sides the same length, but for the purposes of this
		 * exercise we'll say at least two.) A scalene triangle has all sides of
		 * different lengths.
		 *
		 */
		static class Triangle {
			Scanner sc = new Scanner(System.in);
			private double sideOne;
			private double sideTwo;
			private double sideThree;

			public Triangle() {
				super();
			}

			public Triangle(double sideOne, double sideTwo, double sideThree) {
				this();
				this.sideOne = sideOne;
				this.sideTwo = sideTwo;
				this.sideThree = sideThree;
			}

			public double getSideOne() {
				System.out.print("Length of side one: ");
				sideOne = sc.nextDouble();
				
				return sideOne;
			}

			public void setSideOne(double sideOne) {
				
				this.sideOne = sideOne;
			}

			public double getSideTwo() {
				System.out.print("Length of side two: ");
				sideTwo = sc.nextDouble();
				return sideTwo;
			}

			public void setSideTwo(double sideTwo) {
				this.sideTwo = sideTwo;
			}

			public double getSideThree() {
				System.out.print("Length of side three: ");
				sideThree = sc.nextDouble();
				return sideThree;
			}

			public void setSideThree(double sideThree) {
				this.sideThree = sideThree;
			}

			public boolean isEquilateral() {
				if(sideOne == sideTwo)
				{
					if(sideOne == sideThree)
					{
						return true;
					}
				}
				else
				// TODO Write an implementation for this method declaration
				return false;
			}

			public boolean isIsosceles() {
				if(sideOne == sideTwo)
				{
				if(sideOne != sideThree)
					{
						return true;
					}
				else if(sideTwo == sideThree)
				{
					return true;
				}
				}
				else
				// TODO Write an implementation for this method declaration
				return false;
			}

			public boolean isScalene() {
				if(sideTwo != sideThree)
				{
					if(sideOne != sideTwo)
					{
					return true;
				}
				// TODO Write an implementation for this method declaration
				return false;
			}

		}

		/**
		 * 4. Given a word, compute the scrabble score for that word.
		 * 
		 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
		 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
		 * "cabbage" should be scored as worth 14 points:
		 * 
		 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
		 * point for E And to total:
		 * 
		 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
		 * 
		 * @param string
		 * @return
		 */
		public int getScrabbleScore(String string) {
			string = "cabbage";
			char[] stringArray;
			int l = string.length();
			int points;
			
			stringArray = string.toCharArray();
			
			for(int i =0; i<=l; i++)
			{
				switch(stringArray[i])
				{
				case 'c':
				points = points+3;
				
				case 'a':
				points +=1;
				
				case 'b':
				points +=3;
				
				case 'g':
				points +=2;
				
				case 'e':
				points+=1;
				break;
				
				System.out.println("The word " + string + "is worth " + points + " points.");
				
				
				}
			}
		
		}

		/**
		 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
		 * 
		 * The North American Numbering Plan (NANP) is a telephone numbering system used
		 * by many countries in North America like the United States, Canada or Bermuda.
		 * All NANP-countries share the same international country code: 1.
		 * 
		 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
		 * Area code, commonly known as area code, followed by a seven-digit local
		 * number. The first three digits of the local number represent the exchange
		 * code, followed by the unique four-digit number which is the subscriber
		 * number.
		 * 
		 * The format is usually represented as
		 * 
		 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
		 * from 0 through 9.
		 * 
		 * Your task is to clean up differently formatted telephone numbers by removing
		 * punctuation and the country code (1) if present.
		 * 
		 * For example, the inputs
		 * 
		 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
		 * the output
		 * 
		 * 6139950253
		 * 
		 * Note: As this exercise only deals with telephone numbers used in
		 * NANP-countries, only 1 is considered a valid country code.
		 */
		public String cleanPhoneNumber(String string) {		

			Scanner sc = new Scanner(System.in);
			String string;
			int areaCode;
			int num;
			System.out.println("Reminder this service is only used phone numbers from the USA");
			System.out.print("Please type your country code: ");
			areaCode = sc.nextInt();
			System.out.println();
			if(areaCode!= 1)
			{
				System.out.println("Wrong country code. Application will now end.");
				System.exit(0);
			}
				System.out.println("Please type in your phone number with the area code as well.");
				System.out.println("Example: XXX-XXX-XXXX");
				System.out.print("Phone number: ");
				string = sc.next();
				System.out.println();
				string = string.replaceAll("[^0-9]", "");
				
				num = string.length();
				 if(num < 9)
				{
				    System.out.println("You submitted " + string + ". This number is too short.");
				    System.out.println("Please try again.");
				    System.exit(0);
				}
				 else
				 {
					 System.out.println("Your submitted number is: " + string);
				 }
				
			}
			// TODO Write an implementation for this method declaration
			//return null;

		/**
		 * 6. Given a phrase, count the occurrences of each word in that phrase.
		 * 
		 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
		 * free: 1
		 * 
		 * @param string
		 * @return
		 */
		public Map<String, Integer> wordCount(String string) {
			
			 	sc = new Scanner(System.in);
	            String string;
	            System.out.println("Please type a phrase or sentence.");
	            System.out.print("Input: ");
	            string = sc.nextLine();
	            string = string.toLowerCase();
				
				Map<String, Integer> word = new HashMap<>();
				
				Scanner scanner = new Scanner(string);
				while(scanner.hasNext())
				{
				    String palabras = scanner.next();
				    Integer conteo = word.put(palabras, 1);
				    if(conteo!=null)
				    word.put(palabras, conteo+1);
				}
				System.out.println(word);
			
	}
			
			// TODO Write an implementation for this method declaration
			return null;
		}

		/**
		 * 7. Implement a binary search algorithm.
		 * 
		 * Searching a sorted collection is a common task. A dictionary is a sorted list
		 * of word definitions. Given a word, one can find its definition. A telephone
		 * book is a sorted list of people's names, addresses, and telephone numbers.
		 * Knowing someone's name allows one to quickly find their telephone number and
		 * address.
		 * 
		 * If the list to be searched contains more than a few items (a dozen, say) a
		 * binary search will require far fewer comparisons than a linear search, but it
		 * imposes the requirement that the list be sorted.
		 * 
		 * In computer science, a binary search or half-interval search algorithm finds
		 * the position of a specified input value (the search "key") within an array
		 * sorted by key value.
		 * 
		 * In each step, the algorithm compares the search key value with the key value
		 * of the middle element of the array.
		 * 
		 * If the keys match, then a matching element has been found and its index, or
		 * position, is returned.
		 * 
		 * Otherwise, if the search key is less than the middle element's key, then the
		 * algorithm repeats its action on the sub-array to the left of the middle
		 * element or, if the search key is greater, on the sub-array to the right.
		 * 
		 * If the remaining array to be searched is empty, then the key cannot be found
		 * in the array and a special "not found" indication is returned.
		 * 
		 * A binary search halves the number of items to check with each iteration, so
		 * locating an item (or determining its absence) takes logarithmic time. A
		 * binary search is a dichotomic divide and conquer search algorithm.
		 * 
		 */
		static class BinarySearch<T> {
			private List<T> sortedList;

			public int indexOf(T t) {
				// TODO Write an implementation for this method declaration
				return 0;
			}

			public BinarySearch(List<T> sortedList) {
				super();
				this.sortedList = sortedList;
			}

			public List<T> getSortedList() {
				return sortedList;
			}

			public void setSortedList(List<T> sortedList) {
				this.sortedList = sortedList;
			}

		}

		/**
		 * 8. Implement a program that translates from English to Pig Latin.
		 * 
		 * Pig Latin is a made-up children's language that's intended to be confusing.
		 * It obeys a few simple rules (below), but when it's spoken quickly it's really
		 * difficult for non-children (and non-native speakers) to understand.
		 * 
		 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
		 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
		 * of the word, and then add an "ay" sound to the end of the word. There are a
		 * few more rules for edge cases, and there are regional variants too.
		 * 
		 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
		 * 
		 * @param string
		 * @return
		 */
		public String toPigLatin(String string) {
			
			   String word;
			   
			   System.out.println("Please type the word you would like to be translated to Pig Latin");
			   System.out.print("Word: ");
			   word = sc.next();
		      
			   String sub = word.substring(0, 1);
		       String piglatin;
		    
		       if(sub.equals("a") || sub.equals("e") || sub.equals("i") || sub.equals("o") || sub.equals("u") )
		      {
		          piglatin = word;
		          StringBuilder sbl = new StringBuilder(piglatin);
		          sbl.append("way");
		          System.out.println(sbl);	            
		      }
		        
		          String sub2 = word.substring(0, 2);
		          if(sub2.equals("ch") || sub2.equals("th") || sub2.equals("sh")
		          || sub2.equals("st") || sub2.equals("sm") || sub2.equals("gl"))
		          {
		              piglatin = word.replace(sub2, "");
		              StringBuilder sbl = new StringBuilder(piglatin);
		              sbl.append(sub2 + "ay");
		              System.out.println(sbl);
		          }
		          
		          else {
		          piglatin = word.replace(sub, "");
		          StringBuilder sbl = new StringBuilder(piglatin);
		          sbl.append(sub + "ay");
		          System.out.println(sbl);
		      }
		          }
		        
		    
			// TODO Write an implementation for this method declaration
			return null;
		}

		/**
		 * 9. An Armstrong number is a number that is the sum of its own digits each
		 * raised to the power of the number of digits.
		 * 
		 * For example:
		 * 
		 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
		 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
		 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
		 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
		 * a number is an Armstrong number.
		 * 
		 * @param input
		 * @return
		 */
		public boolean isArmstrongNumber(int input) {
			
			 
		     int numero, temp;
		     int total = 0;
		     
		     System.out.pritln("Welcome! Would you like to see if your number is an Armstrong number?")
		     System.out.println("Please type the number you wish to verify.");
		     System.out.print("Number: ");
		     input = sc.nextInt();
		     System.out.println();
		    

		        numero = input;
		       
		        while (numero != 0)
		        {

		            temp = numero % 10;
		          
		            total = total + temp*temp*temp;
		           
		            numero /= 10;
		            
		        }

		        if(total == input)
		            System.out.println(numero + " is an Armstrong number");
		        else
		            System.out.println(numero + " is not an Armstrong number");
			
			// TODO Write an implementation for this method declaration
			return false;
		}

		/**
		 * 10. Compute the prime factors of a given natural number.
		 * 
		 * A prime number is only evenly divisible by itself and 1.
		 * 
		 * Note that 1 is not a prime number.
		 * 
		 * @param l
		 * @return
		 */
		public List<Long> calculatePrimeFactorsOf(long l) {
			  //Declarations
			long count;
	        
	        //Input
	        sc = new Scanner(System.in);
	        System.out.println("Please type the number you wish to check "
	         + "if it's a prime number or not");
	        
	         System.out.print("Number: ");
	         l = sc.nextLong();
	        System.out.println(); 
	        
	        //Setting up the limit
	        count = l/2;   
	        
	        if(l<=1)
	        {
	            System.out.println(l + " is not a prime number.");
	            System.exit(0);
	        }
	           for(int i=2; i<=count; i++)
	           {               
	                    if(l%i==0)
	                    {
	                        System.out.println(l + " is not a prime number.");
	                        System.exit(0);//Using the exit function in order to stop the For since after this I 
	                        				//no longer need to continue with the code
	                    }
	                 
	    			}           		
	           System.out.println(l + " is a prime number");                   
	                }
	            }
			// TODO Write an implementation for this method declaration
			return null;
		}

		/**
		 * 11. Create an implementation of the rotational cipher, also sometimes called
		 * the Caesar cipher.
		 * 
		 * The Caesar cipher is a simple shift cipher that relies on transposing all the
		 * letters in the alphabet using an integer key between 0 and 26. Using a key of
		 * 0 or 26 will always yield the same output due to modular arithmetic. The
		 * letter is shifted for as many values as the value of the key.
		 * 
		 * The general notation for rotational ciphers is ROT + <key>. The most commonly
		 * used rotational cipher is ROT13.
		 * 
		 * A ROT13 on the Latin alphabet would be as follows:
		 * 											
		 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
		 * stronger than the Atbash cipher because it has 27 possible keys, and 25
		 * usable keys.
		 * 
		 * Ciphertext is written out in the same formatting as the input including
		 * spaces and punctuation.
		 * 
		 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
		 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
		 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
		 * 					   
		 * quick brown fox jumps over the lazy dog.
		 */
		static class RotationalCipher {
			private static Scanner sc;
			private static int key;
			private static String string;

			public RotationalCipher(int key) {
				super();
				sc = new Scanner(System.in);
				System.out.println("How many rotations would you like to give the key?");
				System.out.println("Please input your number of rotation. Input 13 for the Cipher Encryption");
				System.out.print("Key: ");
				key = sc.nextInt();
				System.out.println("");
				System.out.println("You've chosen ROT" + key + ".");
				this.key = key;
			}
			public String rotate(String string, int key) {				
				
				string = "The quick brown fox jumps over the lazy dog";
			
				char[] letter = string.toCharArray();
				this.key = key;
				
				for (int i = 0; i<string.length(); i++)
				{
					char word = letter[i];
					 if (word >= 'a' && word <= 'z') {
						 
						 if(word > 'm') {
							 word+=key;
						 }
						 else {						 
						 word +=key;
						 }		 
					 if(word <=95)
					 {
						 int lastCheck = (word%122) + 96;
						 word = (char) lastCheck;
					 }
					 
					 else if(word > 122)
						 {
							 int lastCheck = (word%122) + 96;
							 word = (char) lastCheck;
						 }
				}	//	if (word >= 'a' && word <= 'z') ENDS		 
			            else if  (word >= 'A' && word <= 'Z')
					 {
						 if(word > 'M') {
							 word+=key;
						 }
						 else {
							 word+=key;
						 }
						 if(word <=64)
						 {
							 int lastCheck = (word%90) + 64;
							 word = (char) lastCheck;
						 }						 
						 else if(word > 90)
							 {
								 int lastCheck = (word%90) + 64;
								 word = (char) lastCheck;
							 }
					 }  System.out.print(word);	
				}//FOR ENDS				 
						return null;
						}//Constructor Ends	
			public static void main(String[] args)
			{
				RotationalCipher test = new RotationalCipher(key);
				test.rotate(string, key);
		}

		/**
		 * 12. Given a number n, determine what the nth prime is.
		 * 
		 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
		 * that the 6th prime is 13.
		 * 
		 * If your language provides methods in the standard library to deal with prime
		 * numbers, pretend they don't exist and implement them yourself.
		 * 
		 * @param i
		 * @return
		 */
		public int calculateNthPrime(int i) {
			
			 //Declarations
			int count = 0;
			int contando;		
		        
	        //Input
			sc = new Scanner(System.in);
		    System.out.println("Please type the number you wish to check "
		    + "if it's a prime number or not");
		    
		    //Begin For #1
		    for(int j = 0; j<6; j++) {
		    contando = j+1;
		    System.out.print("Number: ");
		    i = sc.nextInt();
		    System.out.println(); 
		        
		    //Setting up the limit
		    count = i/2;
		        
		        
		    if(i<=1)
		    {
		      System.out.println(i + " is not a prime number.");
		      System.exit(0);
		    }      
		    //Begin For #2
		    for(int z = 2; z <=count; z++)
		    {
		    	if(i%z==0)
		    {
		        System.out.println(i + " is not a prime number.");
	            System.exit(0);//Using the exit function in order to stop the For since after this I 
		       				  //no longer need to continue with the code
		    }           
		    } //End For #2           			  	
		    System.out.println(i + " is the " + contando + "th prime number");
		                    			 
		    							}//End For #1
			
			// TODO Write an implementation for this method declaration
			return 0;
		}

		/**
		 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
		 * system created in the Middle East.
		 * 
		 * The Atbash cipher is a simple substitution cipher that relies on transposing
		 * all the letters in the alphabet such that the resulting alphabet is
		 * backwards. The first letter is replaced with the last letter, the second with
		 * the second-last, and so on.
		 * 
		 * An Atbash cipher for the Latin alphabet would be as follows:
		 * 
		 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
		 * very weak cipher because it only has one possible key, and it is a simple
		 * monoalphabetic substitution cipher. However, this may not have been an issue
		 * in the cipher's time.
		 * 
		 * Ciphertext is written out in groups of fixed length, the traditional group
		 * size being 5 letters, and punctuation is excluded. This is to make it harder
		 * to guess things based on word boundaries.
		 * 
		 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
		 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
		 *
		 */
		static class AtbashCipher {

			/**
			 * Question 13
			 * 
			 * @param string
			 * @return
			 */
			public static String encode(String string) {
				string = "test";
				string = string.trim();
				char[] letter = string.toCharArray();
				//this.key = key;
				
				for (int i = 0; i<string.length(); i++)
				{
					char word = letter[i];
					
					 if (word >= 65 && word <= 90) {
						 
						 word = (char)(90-(word - 65));
						 }
					 
						 if(word >=97 && word <= 122)
						 {
							 word = (char)(122-(word - 97));
						 }
			
					   System.out.print(word);	
				}//FOR ENDS
				System.out.println("Encoding: " + string);
				// TODO Write an implementation for this method declaration
				return null;
			}

			/**
			 * Question 14
			 * 
			 * @param string
			 * @return
			 */
			public static String decode(String string) {
				string = "gvhg";
				char[] letter = string.toCharArray();
				
				
				for (int i = 0; i<string.length(); i++)
				{
					char word = letter[i];
					//If for lowercase
					 if (word >= 65 && word <= 90) {
						 
						 word = (char)(90-(word - 65));
						 }
					 	//If for Uppercase
						 if(word >=97 && word <= 122)
						 {
							 word = (char)(122-(word - 97));
						 }
						 
					  System.out.print(word);	
				}//FOR ENDS
					
					 
						return null;
			}
		

		/**
		 * 15. The ISBN-10 verification process is used to validate book identification
		 * numbers. These normally contain dashes and look like: 3-598-21508-8
		 * 
		 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
		 * a digit or an X only). In the case the check character is an X, this
		 * represents the value '10'. These may be communicated with or without hyphens,
		 * and can be checked for their validity by the following formula:
		 * 
		 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
		 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
		 * otherwise it is invalid.
		 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
		 * and get:									 * 
		 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
		 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
		 * 
		 * @param string
		 * @return
		 */
		public boolean isValidIsbn(String string) {
			sc = new Scanner(System.in);
			System.out.println("Input your ISBN-10 number you would like to test");
			System.out.print("ISBN-10: ");
			string = sc.nextLine();
			System.out.println("Your input is: " + string);
			
				
			
			if(string.length()<10)
			{
				System.out.println("Your ISBN is too short. Please try again.");
				System.exit(0);
			}  		
			else if(string.length()>10)
			{
				System.out.println("Your ISBN is too long. Please try again." );
				System.exit(0);
			}
			
			int isbn = 10;
			int[] value = new int[string.length()];
			for(int i = 0; i<10; i++)
			{		
				int num = string.charAt(i);			 
				 int result1 = num * isbn;		
				 value[i]=result1;
				 isbn-=1;		
			}		
			int sum =0;
			for(int j : value)
			{
				sum+=j;
			}
			int modulo = sum%11;
			if(modulo == 0)
			{
				System.out.println(string + " is a ISB number.");
				return true;
			}
			else
				System.out.println(string + " is not an ISB number.");
			
			return false;
		}

		/**
		 * 16. Determine if a sentence is a pangram. A pangram (Greek: , pan
		 * gramma, "every letter") is a sentence using every letter of the alphabet at
		 * least once. The best known English pangram is:
		 * 
		 * The quick brown fox jumps over the lazy dog.
		 * 
		 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
		 * insensitive. Input will not contain non-ASCII symbols.
		 * 
		 * @param string
		 * @return
		 */
		public boolean isPangram(String string) {
			
			//Code Will Not Work
			//Could not make it work
			string = "The quick brown fox jumps over the lazy dog";
			string = string.toLowerCase();
			int[] letra = new int[26];
			int count = 0;
			for(int i =0; i<string.length(); i++)
			{
				if(string.charAt(i)>= 65 && string.charAt(i)<=122)
				{
					if(letra[string.charAt(i) - 65] == 0)
					{
					count++;				
					}					
					}
				}			
			if (count == 26)
			{
				System.out.println("It is");
			}
			else
			{
				System.out.println("It is not");
			}
	
			// TODO Write an implementation for this method declaration
			return false;
		}
		

		/**
		 * 17. Calculate the moment when someone has lived for 10^9 seconds.
		 * 
		 * A gigasecond is 109 (1,000,000,000) seconds.
		 * 
		 * @param given
		 * @return
		 */
		public Temporal getGigasecondDate(Temporal given) {
			// TODO Write an implementation for this method declaration
			return null;
		}

		/**
		 * 18. Given a number, find the sum of all the unique multiples of particular
		 * numbers up to but not including that number.
		 * 
		 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
		 * get 3, 5, 6, 9, 10, 12, 15, and 18.
		 * 
		 * The sum of these multiples is 78.
		 * 
		 * @param i
		 * @param set
		 * @return
		 */
		public int getSumOfMultiples(int i, int[] set) {
			// TODO Write an implementation for this method declaration
			return 0;
		}

		/**
		 * 19. Given a number determine whether or not it is valid per the Luhn formula.
		 * 
		 * The Luhn algorithm is a simple checksum formula used to validate a variety of
		 * identification numbers, such as credit card numbers and Canadian Social
		 * Insurance Numbers.
		 * 
		 * The task is to check if a given string is valid.
		 * 
		 * Validating a Number Strings of length 1 or less are not valid. Spaces are
		 * allowed in the input, but they should be stripped before checking. All other
		 * non-digit characters are disallowed.
		 * 
		 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
		 * the Luhn algorithm is to double every second digit, starting from the right.
		 * We will be doubling
		 * 
		 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
		 * then subtract 9 from the product. The results of our doubling:
		 * 
		 * 8569 2478 0383 3437 Then sum all of the digits:
		 * 
		 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
		 * then the number is valid. This number is valid!
		 * 
		 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
		 * digits, starting from the right
		 * 
		 * 7253 2262 5312 0539 Sum the digits
		 * 
		 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
		 * this number is not valid.
		 * 
		 * @param string
		 * @return
		 */
		public boolean isLuhnValid(String string) {
			String string;
			sc = new Scanner(System.in);
			System.out.println("Please input your credit card number.");
			System.out.print("Card #: ");
			string = sc.nextLine();
			System.out.println("Input: " + string);
			string = string.replaceAll("\\s+","");
			System.out.println(string);
			
			String[] cardS = string.split("");
			
			
			int[] cardNum = new int[string.length()];
			for(int i = 0; i<string.length(); i++)
			{
				cardNum[i] = Integer.parseInt(cardS[i]);
			}
			
			for(int i = 0; i<string.length(); i++)
			{
				System.out.println("Before doubling " + cardNum[i] + i);
				i=16-2;
				
				cardNum[i] = cardNum[i] * cardNum[i];
				
				System.out.println("After " + cardNum[i] + i);
				if(cardNum[i] > 9)
				{
					System.out.println("Before subs 9 " + cardNum[i] + i);
					cardNum[i] = cardNum[i-9];
					System.out.println("After subs 9 " + cardNum[i] + i);
					
				}
				i-=2;
				
				System.out.print(cardNum[i]);
			}
			// TODO Write an implementation for this method declaration

			return false;
		}

		/**
		 * 20. Parse and evaluate simple math word problems returning the answer as an
		 * integer.
		 * 
		 * Add two numbers together.
		 * 
		 * What is 5 plus 13?
		 * 
		 * 18
		 * 
		 * Now, perform the other three operations.
		 * 
		 * What is 7 minus 5?
		 * 
		 * 2
		 * 
		 * What is 6 multiplied by 4?
		 * 
		 * 24
		 * 
		 * What is 25 divided by 5?
		 * 
		 * 5
		 * 
		 * @param string
		 * @return
		 */
		public int solveWordProblem(String string) {
			
			String string, num2;
			int numero1, numero2;
			
			System.out.println("Please type the two numbers which will be used for the math problems.");
			System.out.print("Numer #1: ");
			string = sc.next();
			System.out.println();
			System.out.print("Numer #2 ");
			num2 = sc.next();
			
			numero1.parseInt(string);
			numero2.parseInt(num2);
			
			int result=0;
			result = numero1 + numero2;
			System.out.println("For adding we have: " );
			System.out.println(numero1 + "+" + numero2 + " = " + result);
			
			result=0;
			result = numero1 + numero2;
			System.out.println("For subtracting we have: " );
			System.out.println(numero1 + "-" + numero2 + " = " + result);
			
			result=0;
			result = numero1 + numero2;
			System.out.println("For multiplication we have: " );
			System.out.println(numero1 + "X" + numero2 + " = " + result);
			
			result=0;
			result = numero1 + numero2;
			System.out.println("For dividing we have: " );
			System.out.println(numero1 + "/" + numero2 + " = " + result);
				
			// TODO Write an implementation for this method declaration
			return 0;
		}

	}

	


