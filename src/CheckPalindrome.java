
public class CheckPalindrome {
	public static void main(String[] args) {
		String name="madam";
		String temp="";
		
		for(int i=name.length()-1;i>=0;i--) {
			temp=temp+name.charAt(i);
			
		}
		//System.out.println(temp);
					
	
		if(name.equalsIgnoreCase(temp)) {
			System.out.println(name+ " is palindrome");
		}
	
		else {
			System.out.println(name+ "is Not Palindrome");
		}
	}
}