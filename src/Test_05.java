
public class Test_05 {
	public static void main(String[] args) {
		String a=args[0];
		String temp="";
		
		for(int i=a.length()-1;i>=0;i--) {
			
			temp=temp+a.charAt(i);
		}
		System.out.println(temp);
	}

}
