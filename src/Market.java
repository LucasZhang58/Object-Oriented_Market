import java.util.Scanner;


public class Market {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String machine;

        while (true) {
            System.out.println("What machine do want?: Press 'a' for vending machine, 'b' for printer, and 'c' for car");
            machine = scan.nextLine();

            if (!(machine.equals("a") | machine.equals("b") | machine.equals("c"))) {
                System.out.println("Please press 'a', 'b', or 'c'.");
            } else {
                break;
            }
        }

        if (machine.equals("a")) {
            VendingMachine v = new VendingMachine();

            double myMoney = 10.0;
            System.out.println("You chose a vending machine! You have " + myMoney + " dollars to spend.");
            System.out.println("Please press 'o' to turn the vending machine on.");
            String on = scan.nextLine();
            if (on.equals("o")) {
                v.turnOn();
                System.out.println("Vending Machine is now on.");

            }
            while (true) {
                System.out.println("Which snack would you like? Press 'a' for Cheetos ($1.00), 'b' for Doritos ($1.50), and 'c' for Fritos ($2.00)");

                String snack = scan.nextLine();
                if (!(snack.equals("a") | snack.equals("b") | snack.equals("c"))) {
                    System.out.println("Please press 'a', 'b', or 'c'.");
                } else {
                    System.out.println("How many do you want?");
                    int numInput = scan.nextInt();

                    int numInStock;
                    double price;
                    if (snack.equals("a")) {
                        numInStock = v.getNumOfCheetos();
                        price = v.getCheetosPrice();

                    } else if (snack.equals("b")) {
                        numInStock = v.getNumOfDoritos();
                        price = v.getDoritosPrice();
                    } else {
                        numInStock = v.getNumOfFritos();
                        price = v.getFritosPrice();

                    }

                    if (numInStock < numInput) {
                        System.out.println("Sorry, we don't have that many in stock, try again!");
                        continue;
                    }

                    if ((price*numInput) > myMoney) {
                        System.out.println("Sorry, you can't afford it.");
                        continue;
                    }
                    myMoney = myMoney - (price*numInput);
                    System.out.println("You now have " + myMoney + " dollars.");



                    while (true) {
                        System.out.println("Would you like anything else? Press 'y' or 'n'");
                        String choice = scan.nextLine();
                        if (!(choice.equals("y") | choice.equals("n"))) {
                            System.out.println("Please press only 'y' or 'n'.");
                        }
                        if (choice.equals("y")) {
                            break;
                        }
                        else if (choice.equals("n")) {
                            System.out.println("Have a nice day. Bye!");
                            return;
                        }
                    }
                }
            }
        }
        if (machine.equals("b")) {
            System.out.println("You bought a printer!");
        }
        if (machine.equals("c")) {
            System.out.println("You bought a car!");
        }



    }
}
