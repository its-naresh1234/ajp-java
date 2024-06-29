
public class StringPalindrome2 {

	public static void main(String[] args) {
String s="naresh";
String rev="";
String temp=s;
//char array[]=s.toCharArray();
for(int i=s.length()-1;i>=0;i--) {
	rev=rev+s.charAt(i);
}
System.out.println(s);
System.out.println(rev);
//if(s.equals(temp)) {
//	System.out.println("yes palindrome");
//}else {
//	System.out.println("not");
//}

	}

}
