import java.util.Scanner;

public class Ruin {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("How much money do you have: ");
        int StartAmount = in.nextInt();
        System.out.print("What is your probability of winning (enter probability as decimal):");
        double winChance = in.nextDouble();
        System.out.print("What is your win limit: ");
        int simulation = 0;
        int winLimit = in.nextInt();

        for (int i = 0; i < 500; i++) {
            int currentAmount = StartAmount;
            simulation++;
            int totalSimulations = 0;
            while (currentAmount > 0 && currentAmount < winLimit) {

                totalSimulations++;
                if (Math.random() < winChance) {
                    currentAmount++;
                } else {
                    currentAmount--;
                }

            }
            if (currentAmount == 0) {
                System.out.println("You are ruined!");
            }
            if (currentAmount >= winLimit)
                System.out.println("You won!");
            System.out.println("Simulation " + simulation + ": " + totalSimulations);
        }
    }
}
