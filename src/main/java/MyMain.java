import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a'){
                count ++;
            }else if (str.charAt(i)== 'b'){
                count ++;
            }else if (str.charAt(i)== 'c'){
                count ++;
            }
        }
        System.out.println("Your string contains "+ count +" a's, b's, or c's");
        return count;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        String str2 = str.toLowerCase();
        int idx1 = str2.indexOf("the");
        if (idx1 > -1){
            System.out.println("Your string DOES contain the");
            return true;

        }else 
            System.out.println("Your string DOES NOT contain the");
            return false;
    } 

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        String strbackwards = "";
        for (int i = str.length()-1; i>=0 ; i--) {
            strbackwards = strbackwards + str.charAt(i);
        }if (str.equals(strbackwards)){
            System.out.println("Your string IS a palindrome");
            return true;
        }else {
            System.out.println("Your string IS NOT a palindrome");
            return false;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String input = scan.nextLine();
        countABC(input);
        containsThe(input);
        isPalindrome(input);
    }
}
