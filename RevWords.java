/* Java program to reverse a words in the String */

import java.util.Scanner;

public class ReverseWords 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        String[] words = str.split(" ");
        String rev = "";

        for (int i = words.length - 1; i >= 0; i--)
        {
             rev=rev + words[i] + " ";
        }

        System.out.println(rev.trim());
    }
}
