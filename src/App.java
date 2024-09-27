import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
       //different variables
        double kg;
        double oz;
        double mi;
        double in;
        int input;
        String contInput;
    
    Scanner scanner = new Scanner(System.in);
do{
    System.out.println("Please select type of conversion:\n(1)kg to lbs \n(2)oz to g \n(3)mile to km \n(4)cm to inch");
    input = scanner.nextInt();
    while (input < 1 || input > 4) {
        System.out.println("Please pick one of the available options, input again.");
        input = scanner.nextInt();
    }


         if (input == 1 ) {
        System.out.println("Input kg amount to convert to lbs");
        kg = scanner.nextDouble();
        double lbs = kg * 2.205;
        System.out.println("Your input " +kg + "kg is equal to " +lbs+"lbs");
        }
          else if (input == 2) {
        System.out.println("Input oz amount to convert to g");
        oz = scanner.nextDouble();
        double gram = oz * 28.349;
        System.out.println("Your input " +oz + "oz is equal to " +gram+"g");
         }
        else if (input == 3) {
         System.out.println("Input mi amount to convert to km");
        mi = scanner.nextDouble();
        double km = mi * 1.609;
        System.out.println("Your input " +mi + "mi is equal to " +km+"km");
         }
         else if (input == 4) {
        System.out.println("Input in amout to convert to cm");
        in = scanner.nextDouble();
        double cm = in * 2.54;
        System.out.println("Your input " +in + "in is equal to " +cm+"cm");
    }
        //close loop
        System.out.println("Want to perform another conversion? (yes/no)");
        contInput = scanner.next();
 }
    while(contInput.equalsIgnoreCase("yes"));

    scanner.close();
 }

}

