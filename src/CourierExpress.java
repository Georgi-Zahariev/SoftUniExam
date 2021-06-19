import java.util.Scanner;

public class CourierExpress {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		double weight = Double.parseDouble(inp.nextLine());
		String type = inp.nextLine();
		int km = Integer.parseInt(inp.nextLine());
		double price = 0;

		switch (type) {
		case "standard":
			if (weight < 1)
				price = 0.03;
			else if (weight < 10)
				price = 0.05;
			else if (weight < 40)
				price = 0.10;
			else if (weight < 90)
				price = 0.15;
			else
				price = 0.20;

			break;
		case "express":
			if (weight < 1)
				price = 0.03 * 1.80;
			else if (weight < 10)
				price = 0.05 * 1.40;
			else if (weight < 40)
				price = 0.10 * 1.05;
			else if (weight < 90)
				price = 0.15 * 1.02;
			else
				price = 0.20 * 1.01;

			if (weight < 1)
				price = 0.03 + 0.03 * 0.80 * weight;
			else if (weight < 10)
				price = 0.05 + 0.05 * 0.40 * weight;
			else if (weight < 40)
				price = 0.10 + 0.10 * 0.05 * weight;
			else if (weight < 90)
				price = 0.15 + 0.15 * 0.02 * weight;
			else
				price = 0.20 + 0.20 * 0.01 * weight;
			break;

		default:
			break;
		}

		System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight,
				price * km);
	}

}
