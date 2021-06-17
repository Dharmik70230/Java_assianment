
public class ArmNumberCount {
	public static void armscount(int count) {
		int temp, sum;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			if (count == 0)
				break;
			sum = 0;
			temp = i;
			
			while (temp > 0) {
				sum += Math.pow(temp % 10, 3);
				temp /= 10;
			}
			if (sum == i) {
				System.out.println(sum + " ");
				count--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmNumberCount arm = new ArmNumberCount();
		arm.armscount(15);

	}

}
