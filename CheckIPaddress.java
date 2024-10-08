//Java program to check the IP address is valid or Not.
import java.util.*;
class IpAddress
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        char[] ch = new char[str.length()];
        int dot = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < str.length(); i++) 
        {
            ch[i] = str.charAt(i);
            if (ch[i] == '.')
             {
                dot++;  
            }
        }
        
        int number = 0;
        for (char c : ch) 
        {
            if (c == '.') 
            {
                list.add(number); 
                number = 0;        
            } else 
            {
                number = number * 10 + (c - '0');
            }
        }
        list.add(number);
        
        int validParts = 0;
        for (int i = 0; i < list.size(); i++)
         {
            if (list.get(i) >= 0 && list.get(i) <= 255) 
            {
                validParts++;
            }
        }

        if (validParts == 4 && list.size() == 4 && dot==3)
        {
            System.out.println("Valid IP Address");
        } else {
            System.out.println("Invalid IP Address");
        }
    }
}
