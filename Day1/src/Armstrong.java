
public class Armstrong {

	public static void armstrong(int num) {

		int r, sum = 0;
		int temp = num;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			sum = sum + r * r * r;
		}
		if (temp == sum) {
			System.out.println("Given NUmber Is Armstrong number");
		} else {
			System.out.println("Given Number is not Armstrong number");
		}

	}

	public static void main(String[] args) {
		int num = 15;
		armstrong(num);
	}

}
