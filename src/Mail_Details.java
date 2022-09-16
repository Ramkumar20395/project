
public class Mail_Details {
	public static void main(String[] args) {
		String name = "Ramkumar20395@gmail.com";
		int stringupCount = 0;
		int stringloCount = 0;
		int charCount = 0;
		int numberCount = 0;

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
				stringupCount++;
			} else if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') {
				stringloCount++;
			} else if (name.charAt(i) >= '0' && name.charAt(i) <= '9') {
				numberCount++;
			} else {
				charCount++;
			}

		}

		System.out.println(stringupCount);
		System.out.println(stringloCount);
		System.out.println(numberCount);
		System.out.println(charCount);

	}
}
