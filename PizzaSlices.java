import java.util.Scanner;

public class PizzaSlices {
  
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

        int people = 0;
        int slicesPerPizza = 0;

        while (true) {
            System.out.print("Enter the number of people: ");
            people = keyboard.nextInt();

            System.out.print("Enter the number of slices per pizza: ");
            slicesPerPizza = keyboard.nextInt();

            if (people > 0 && slicesPerPizza > 0) {
            	
                break;
                
            } else {
                System.out.println(" Error: both values must be positive! Please try again.\n");
            }
        }

        int pizzas = 1;

      
        while ((pizzas * slicesPerPizza) % people != 0) {
            pizzas++;
        }

        System.out.println("Minimum number of pizzas needed: " + pizzas);
    }
}

