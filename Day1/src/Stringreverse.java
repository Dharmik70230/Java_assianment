
public class Stringreverse {

	public static String re(String s) {
//		char ch[] = s.toCharArray();
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			
			rev += s.charAt(i);	
		}
		System.out.println(rev);
		return rev;
//		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		re("Hello");
	}

}
