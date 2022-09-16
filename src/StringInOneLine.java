
public class StringInOneLine {
	public static void main(String[] args) {
		String b="JAVA";
		String a="";
		for(int i=0;i<b.length();i++) {
			a=a+b.charAt(i);
			//System.out.println(i);
		}
		System.out.println(a);
	}
}
