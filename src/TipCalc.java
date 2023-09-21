
import java.util.Scanner; //add to github


public class TipCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator! ");
        System.out.print("How many people are in your group: ");
        int numberOfPpl = scan.nextInt();




        System.out.print("Do you want to add a set tip or make it a percent? Type 1 or 2: "); // Line 52 for option 2 of a set tip
        int typeTip = scan.nextInt();


        if (typeTip == 2) {
            System.out.print("Whats the tip percentage? (1-100) ");
            int intTip = scan.nextInt();
            double tipPercent = intTip / 100.0;
            boolean loop = true;
            double cost2 = 0;


            while (loop) {
                System.out.print("Enter the cost of your meal: (-1 to end) "); // Add as many meals as necessary
                double cost = scan.nextDouble();
                if (cost < 0) {
                    loop = false;
                } else {
                    cost2 = cost2 + cost;
                }
            }


            System.out.print("The total before tip: $" + cost2);
            System.out.println();
            System.out.print("Total percentage: " + intTip + "%");
            System.out.println();


            double tip = (double) Math.round((tipPercent * cost2) * 100) / 100;
            double totalCost = cost2 + tip;


            System.out.print("Total tip: $" + tip);
            System.out.println();
            System.out.print("Total bill with tip: $" + (tip + cost2));
            System.out.println();
            double costPerPerson = (double) Math.round((cost2 / numberOfPpl) * 100) / 100;


            System.out.print("Per person before tip: $" + costPerPerson);
            System.out.println();
            System.out.print("Tip per person: $" + (double) Math.round((tip / numberOfPpl) * 100) / 100);
            System.out.println();
            System.out.print("Total cost per person: $" + (double) Math.round((totalCost / numberOfPpl) * 100) / 100);
            System.out.println();
        }
        else {
            System.out.print("How much do you want to add?");
            double tip = scan.nextDouble();
            boolean loop = true;
            double cost2 = 0;


            while (loop) {
                System.out.print("Enter the cost of your meal: (-1 to end) ");
                double cost = scan.nextDouble();
                if (cost < 0) {
                    loop = false;
                } else {
                    cost2 = cost2 + cost;
                }
            }


            System.out.print("The total before tip: $" + cost2);
            System.out.println();


            double totalCost = cost2 + tip;


            System.out.print("Total tip: $" + tip);
            System.out.println();
            System.out.print("Total bill with tip: $" + (Math.round((tip + cost2) * 100) / 100));
            System.out.println();
            double costPerPerson = (double) Math.round((cost2 / numberOfPpl) * 100) / 100;


            System.out.print("Per person before tip: $" + costPerPerson);
            System.out.println();
            System.out.print("Tip per person: $" + (double) Math.round((tip / numberOfPpl) * 100) / 100);
            System.out.println();
            System.out.print("Total cost per person: $" + (double) Math.round((totalCost / numberOfPpl) * 100) / 100);
            System.out.println();
        }


    }

