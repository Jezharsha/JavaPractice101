/**
This program checks whether a string is a palindrome or not!
@author Harsha Chady
*/

import java.io.*;

public class PalindromeString{

	public static void main(String[] args) throws Exception {
           String strn1;
           int flag = 0;

					 String strn2 = "";

           System.out.println("Enter the string: ");
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           strn1 = br.readLine();

					 int l = strn1.length();

					 for (int i = l - 1; i >= 0; i--){
						 strn2 = strn2 + strn1.charAt(i);
					 }

					 if (strn1.equalsIgnoreCase(strn2)){
						 flag = 1;
					 }
					 else {
						 flag = 0;
					 }


           if (flag == 1){
						  System.out.print(strn1 + " is a palindrome!\n");
					 }
           else if (flag == 0){
						 System.out.print(strn1 + "is not a palindrome!\n");
					 }


  }
}
