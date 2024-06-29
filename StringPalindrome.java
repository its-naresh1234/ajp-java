
public class StringPalindrome {

	public static void main(String[] args) {
             String s="Naresh";
            StringBuilder str1=new StringBuilder(s);
            str1.reverse();
            if(s.equals(str1.toString())) {
            	System.out.println("Yes palindrome");
            }else {
            	System.out.println("not apalindrome");
            }
             
	}

}
