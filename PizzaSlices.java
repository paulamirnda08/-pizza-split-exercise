import java.util.Scanner;

public class PizzaSlices {
  
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int people = scanner.nextInt();
        int slicesPerPizza = scanner.nextInt();

        int pizzas = 1;

        while ((pizzas * slicesPerPizza) % people != 0) {
            pizzas++;
        }

        System.out.println(pizzas);
    }
}


