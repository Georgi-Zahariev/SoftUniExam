import java.util.Scanner;

public class ChristmasPreparation {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int r = Integer.parseInt(inp.nextLine());
		int p = Integer.parseInt(inp.nextLine());
		double l = Double.parseDouble(inp.nextLine());
		int persent = Integer.parseInt(inp.nextLine());
		double sum = 0;

		sum = r * 5.80 + p * 7.20 + l * 1.20;
		sum = sum * (100 - persent) / 100.0;
		System.out.printf("%.3f", sum);

	}

}
