
								/* Chapter: 1 String */


package interViewPracticeQuestions;

import java.util.Scanner;

public class StringProblems {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//reverseString();
		//reverseWordsAtItsPlace();
		//interchangeLetterPositions();
		//checkVowelInString();
		//System.out.println(palindromeString("radar"));
		//System.out.println(removeSpace("     Ram Kumar   "));
		
		/*String s = removeOccurence("abcdea" , 'a');
		System.out.println(s+"  contains "+s.length()+" distinct characters");*/
		//System.out.println(strLength("ram"));
		//System.out.println(strLenWitoutSpace("arun   "));

		
		
		
	}
	
	
	//Q1: Reverse a string 
	public static void reverseString() {
		System.out.println("Enter a string to be reversed..!");
		String st = sc.nextLine();
		for (int i = st.length()-1; i >= 0; i--) {
			System.out.print(st.charAt(i)+"");
		}
	}
	
	
	//Q2: Reverse each word of string at its place
	public static void reverseWordsAtItsPlace() {
		System.out.println("Enter String.......!");
		String st = sc.nextLine();
		
		String [] stAr = st.split("\\s+");
		
		char [] ch1 = stAr[0].toCharArray();
		char [] ch2 = stAr[1].toCharArray();
		char [] ch3 = stAr[2].toCharArray();
		
		for (int i = ch1.length -1; i >=0 ; i--) {
			System.out.print(ch1[i]);
		}
		
		System.out.print(" ");
		for (int i = ch2.length -1; i >=0 ; i--) {
			System.out.print(ch2[i]);
		}
		
		System.out.print(" ");
		for (int i = ch3.length -1; i >=0 ; i--) {
			System.out.print(ch3[i]);
		}
	}
	
	
	//Q3: Interchange the words of a string 
	/* Problem description
	 * suppose there is a string "Arun" in this case you have to write 
	 * a program which changes the position of A to n & n to A
	 * & position of r to u & u to r
	 */
	
	
	public static void interchangeLetterPositions() {
		System.out.println("Enter a word without any space between the charachters...!");
		String st = sc.nextLine();
		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			if (i == 0) {
				System.out.print(ch[2]);
			}
			
			if(i == 1) {
				System.out.print(ch[3]);
			}
			
			if(i == 2) {
				System.out.print(ch[0]);
			}
			
			if(i == 3) {
				System.out.print(ch[1]);
			}
			
			
		}
	}
	
	
	
	//Q4: Check if a vowel is present in a string.
	public static void checkVowelInString() {
		System.out.println("Please enter a string....!");
		String st = sc.nextLine();
		for (int i = 0; i < st.length(); i++) {
			if('a' == st.charAt(i) | 'e' == st.charAt(i) |
			   'i' == st.charAt(i) | 'o' == st.charAt(i) |
			   'u' == st.charAt(i) | 'e' == st.charAt(i)) {
				System.out.println("vowel is present in the string....!");
				break;
			}
			else if(i+2 > st.length()) {
				System.out.println("vowel is not present in the string....!");
			}
				
		}
	}
	
	
	//Q5: Check whether a string is a palindrome in Java?
	public static Boolean palindromeString(String s) {
		int j =0;
		char[] c = s.toCharArray();
		char [] ch = new char[c.length];
		for (int i = c.length-1; i >= 0; i--) { 
			ch[j++] = c[i];
		}
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] != c[i]) {
				return false;
			}
		}
		return true;
	}
	
	//Q6: Remove spaces from a string in Java?
	public static String removeSpace(String s) {
		String sb = "";
		String[] st = s.split("\\s");
		for (int i = 0; i < st.length; i++) {
			sb += st[i];
		}
		return sb;
	}
	
	//Q7: Remove leading and trailing spaces from a string in Java?
	//Please refer to the Question 6.
	
	//Q8: Remove all occurrences of a given character from an input string
	public static String removeOccurence(String st, char ch) {
		char[] c = st.toCharArray();
		String s = "";
		for (int i = 0; i < st.length(); i++) {
			if(ch != c[i] ) {
				s +=c[i];
			}
		}
		return s;
	}
	
	//Q9: Get distinct characters and their count in a string
	//Please refer to Q8, only store the return value in a variable and print the value
	
	
	//Q10: Find length of a string.
	public static int strLength(String str) {
		int len = 0;
		char [] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			len++;
		}
		return len;
	}
	
	
	//Q11: Find length of a string without space.
		public static int strLenWitoutSpace(String str) {
			int len = 0;
			char [] ch = str.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if(ch[i] != ' ') {
					len++;
				}
			}
			return len;
		}
	
	
	//Q12: Remove leading or trailing space of a string - Important Question


	//Q13:

		
		
}
