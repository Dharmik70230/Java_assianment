
public class Primecount {

	public static void pcount(int count) {

		int i, j, flag;

		for (i = 0; i <= Integer.MAX_VALUE; i++) {
			if (count == 0)
				break;
			if (i == 0 || i == 1)
				continue;
			flag = 1;
			for (j = 2; j <= i; ++j) {
				if (i % j == 0)
					flag = 0;
				break;
			}
			if (flag == 1) {
				System.out.println(i + " ");
				count--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primecount s = new Primecount();
		
		s.pcount(5);

	}
}