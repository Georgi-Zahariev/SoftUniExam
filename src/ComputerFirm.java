import java.util.Scanner;

public class ComputerFirm {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = Integer.parseInt(inp.nextLine());
		int spec = 0;
		int deals = 0;
		double sum = 0;
		double sum2 = 0;
		double sum3 = 0;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(inp.nextLine());
			spec = num % 10;
			deals = num / 10;
			switch (spec) {
			case 2:
				sum = 0;
				break;
			case 3:
				sum = deals * 50 / 100.0;
				break;
			case 4:
				sum = deals * 70 / 100.0;
				break;
			case 5:
				sum = deals * 85 / 100.0;
				break;
			case 6:
				sum = deals;
				break;
			default:
				break;
			}
			sum2 = sum2 + sum;
			sum3 = sum3 + spec;

		}

		System.out.printf("%.2f", sum2);
		System.out.println();
		System.out.printf("%.2f", sum3 / n);

	}

}
