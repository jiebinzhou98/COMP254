import java.util.Scanner;

public class exercise_two {
    public static boolean isPalindrome(String str){
        if(str.length() == 0 || str.length() ==1){
            return true;
        }
        if(str.charAt(0) == str.charAt(str.length()-1)){
            return isPalindrome(str.substring(1,str.length()-1));
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to check if is palindrome or not: ");
        String test = scanner.nextLine();
        if(isPalindrome(test)){
            System.out.println(test + " is palindrome");
        }
        else {
            System.out.println(test + " is not palindrome");
        }
    }
}
