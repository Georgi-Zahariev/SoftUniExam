import java.util.Scanner;

public class BestPlayer {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String problem = inp.nextLine();
		int maxGoals = -1;
		String maxName = "";
		while (!problem.equals("END")) {
			String name = problem;
			int goals = Integer.parseInt(inp.nextLine());
			if (goals > maxGoals) {
				maxGoals = goals;
				maxName = name;
			}
			if (goals >= 10) {
				break;
			}
			problem = inp.nextLine();
		}

		System.out.println(maxName + " is the best player!");
		if (maxGoals > 2) {
			System.out.println("He has scored " + maxGoals + " goals and made a hat-trick !!!");
		} else {
			System.out.println("He has scored " + maxGoals + " goals.");
		}
	}

}
