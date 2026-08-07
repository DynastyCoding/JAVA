package practice.syntax;

public class AverageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = average(12, 24, 36);
		System.out.println("12,24,36 的平均數為" + result);

	}

	public static double average(int a, int b, int c) {
		return (a + b + c) / 3.0;
	}

}
