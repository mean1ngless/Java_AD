import java.util.*;
/**
 * Main class to demonstrate the functionality of the candy hierarchy.
 */
public class CandyHierarchy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gift gift = new Gift();

        try {
            System.out.println("Enter the number of sweets to add to the gift:");
            int numSweets = scanner.nextInt();

            for (int i = 0; i < numSweets; i++) {
                try {
                    System.out.println("Enter sweet type (1: Chocolate, 2: Caramel, 3: Jelly):");
                    int type = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter weight (grams):");
                    double weight = scanner.nextDouble();
                    System.out.println("Enter sugar content (%):");
                    double sugarContent = scanner.nextDouble();

                    switch (type) {
                        case 1:
                            System.out.println("Enter cocoa content (%):");
                            double cocoaContent = scanner.nextDouble();
                            gift.addSweet(new ChocolateCandy(name, weight, sugarContent, cocoaContent));
                            break;
                        case 2:
                            System.out.println("Does it have filling? (true/false):");
                            boolean hasFilling = scanner.nextBoolean();
                            gift.addSweet(new CaramelCandy(name, weight, sugarContent, hasFilling));
                            break;
                        case 3:
                            System.out.println("Enter flavor:");
                            scanner.nextLine(); // Consume newline
                            String flavor = scanner.nextLine();
                            gift.addSweet(new JellyCandy(name, weight, sugarContent, flavor));
                            break;
                        default:
                            System.out.println("Invalid type, skipping.");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Error adding sweet: " + e.getMessage());
                }
            }

            // Display total weight
            System.out.println("Total weight of the gift: " + gift.getTotalWeight() + " grams");

            // Sort by sugar content
            gift.sortBySugarContent();
            System.out.println("After sorting by sugar content: " + gift);

            // Find sweets by cocoa content
            try {
                System.out.println("Enter cocoa content range (min max):");
                double minCocoa = scanner.nextDouble();
                double maxCocoa = scanner.nextDouble();
                List<Sweet> cocoaSweets = gift.findSweetsByCocoaContent(minCocoa, maxCocoa);
                System.out.println("Sweets with cocoa content in range " + minCocoa + "-" + maxCocoa + "%: " + cocoaSweets);
            } catch (IllegalArgumentException e) {
                System.out.println("Error finding sweets: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

