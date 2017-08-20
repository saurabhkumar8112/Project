import java.util.Scanner;

public class Caesar {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Message: ");
		String str=scn.nextLine();
		System.out.println("Want to encrypt or Decypt ? Enter 1 and 0 accordingly: ");
		int b=scn.nextInt();
		if(b==1)
		{
			System.out.print("Enter the key for Encryption: ");
			int key= scn.nextInt();
			String encrypted = en(str, key);
			System.out.println(encrypted);
		}
//		weyvefl mw er ewwspi  && key=4

		else if(b==0)
		{
			while(true)
			{
				System.out.print("Enter the Key to decrypt: ");
				int key= scn.nextInt();
				String decrypted = de(str, key);
				System.out.println(decrypted);
				System.out.println("\nGot the decrypted msg? ");
				int i=scn.nextInt();
				if(i==1)
				{
					break;
				}
			}
		}
		else
		{
			System.out.println("Enter valid chice");
		}
	}

	public static String en(String str, int k) {
		str = str.toLowerCase();
		StringBuilder sb = new StringBuilder(str);
		StringBuilder collector = new StringBuilder();
		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			int p = ch;
			if (ch != 32&&ch!=33&&ch!=46) {
				p += k;
				if (p > 122) {
					p = p - 122;
					p += 96;
				}
			}
			collector.append((char) p);
		}
		return collector.toString();
	}

	public static String de(String str, int k) {
		String en1 = en(str, 26-k);
		return en1;

	}

}