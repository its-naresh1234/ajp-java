
public class NumberPalindrome {

	public static void main(String[] args) {
        int num=121;
        int tem=num;
        int reverse=0;
        //both side same number
        for(int i=0;i<=num;i++) {
        	reverse=reverse*10+num%10;
        	num=num/10;
        }
//        while(num>0) {
//        //	num=num%10;
//        	reverse=reverse*10+num%10;
//        	num=num/10;
//        }
        System.out.println(tem);
        System.out.println(reverse);
        if(tem==reverse) {
        	System.out.println("yes palindrome");
        }else {
        	System.out.println("not apalindrome");
        }
	}

}
