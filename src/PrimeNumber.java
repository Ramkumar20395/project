
public class PrimeNumber {
	public static void main (String[] args) {
		int num=25;
		boolean flag=true;
		for(int i=0;i<=25;i++) {
			if(i%2==0) {
				flag=false;
			}
		}
		if(flag==false) {
			System.out.println(num+" is Prime Number");
		}
		else {
			System.out.println(num+" is Not Prime Number");
		}
	}

}
