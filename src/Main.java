import java.util.*;
//8330 Vietor Avenue Apt 629, Elmhurst, NY 11373
//1313 Mockingbird Lane Apt 6A, Springfield, MO 65123


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PostageCalculator postage = new PostageCalculator();
        System.out.println("Welcome to the postage calculator");
        System.out.print("Would you like to (s)imulate the postage calculator, (e)nter your own package, or (q)uit? : ");
        String str = input.nextLine();

        while (!str.equalsIgnoreCase("q"))
        {
            if (str.equalsIgnoreCase("s"))
            {
                int zip1 = (int)(Math.random() * 99499) + 501;
                int zip2 = (int)(Math.random() * 99499) + 501;
                Address a1 = new Address("1313","Mockingbird Lane","Apt 6A","Springfield","MO",""+zip1);
                Address a2 = new Address("1313","Mockingbird Lane","Apt 6A","Springfield","MO",""+zip2);
                int l = (int)(Math.random() * 46) + 2;
                int w = (int)(Math.random() * 46) + 2;
                int h = (int)(Math.random() * 46) + 2;
                Package p1 = new Package(a1,a2,3.0,l,w,h);
                System.out.println("Address 1: " + a1.toString());
                System.out.println("Address 2: " + a2.toString());
                System.out.println("Cost: $"+ postage.calculatePostage(p1));
                System.out.print("Would you like to (s)imulate the postage calculator, (e)nter your own package, or (q)uit? : ");
                str = input.nextLine();
            }

            if (str.equalsIgnoreCase("e"))
            {
                System.out.print("Enter the first address: ");
                String a3 = input.nextLine();
                System.out.print("Enter the second address: ");
                String a4 = input.nextLine();
                System.out.print("Enter the weight of the package: ");
                double weight = Integer.parseInt(input.nextLine());
                System.out.print("Enter the length of the package: ");
                int l = Integer.parseInt(input.nextLine());
                System.out.print("Enter the width of the package: ");
                int w = Integer.parseInt(input.nextLine());
                System.out.print("Enter the height of the package: ");
                int h = Integer.parseInt(input.nextLine());
                Package p = new Package(new Address(a3), new Address(a4), weight, l, w, h);
                System.out.println("Cost: $" + postage.calculatePostage(p));
                System.out.print("Would you like to (s)imulate the postage calculator, (e)nter your own package, or (q)uit? : ");
                str = input.nextLine();
            }
            if (str.equalsIgnoreCase("q")) break;
        }

    }
}
