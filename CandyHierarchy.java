import java.util.*;

/**
 * Main class to demonstrate the functionality of the candy hierarchy.
 * This program allows users to create a collection of various sweets, display them,
 * and remove specific sweets by their name.
 */
public class CandyHierarchy {

    /**
     * The entry point of the application.
     *
     * @param args the command-line arguments (not used in this application)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a typed collection to store sweets
        TypedCollection<Sweet> candyCollection = new TypedCollection<>();

        try {
            System.out.println("Enter the number of sweets to add:");
            int numSweets = -1;

            // Validate and read the number of sweets to be added
            while (numSweets < 0) {
                if (scanner.hasNextInt()) {
                    numSweets = scanner.nextInt();
                    if (numSweets < 0) {
                        System.out.println("Number of sweets cannot be negative. Please enter again:");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a positive integer:");
                    scanner.next(); // Clear invalid input
                }
            }

            // Loop to add sweets to the collection
            for (int i = 0; i < numSweets; i++) {
                try {
                    int type = -1;

                    // Validate sweet type input
                    while (type < 1 || type > 3) {
                        System.out.println("Enter sweet type (1: Chocolate, 2: Caramel, 3: Jelly):");
                        if (scanner.hasNextInt()) {
                            type = scanner.nextInt();
                            if (type < 1 || type > 3) {
                                System.out.println("Invalid type. Please enter 1, 2, or 3.");
                            }
                        } else {
                            System.out.println("Invalid input. Please enter 1, 2, or 3.");
                            scanner.next(); // Clear invalid input
                        }
                    }

                    scanner.nextLine(); // Consume newline

                    System.out.println("Enter name:");
                    String name = scanner.nextLine();

                    System.out.println("Enter weight (grams):");
                    double weight = scanner.nextDouble();

                    System.out.println("Enter sugar content (%):");
                    double sugarContent = scanner.nextDouble();

                    // Add sweet based on type
                    switch (type) {
                        case 1:
                            System.out.println("Enter cocoa content (%):");
                            double cocoaContent = scanner.nextDouble();
                            candyCollection.add(new ChocolateCandy(name, weight, sugarContent, cocoaContent));
                            break;
                        case 2:
                            System.out.println("Does it have filling? (true/false):");
                            boolean hasFilling = scanner.nextBoolean();
                            candyCollection.add(new CaramelCandy(name, weight, sugarContent, hasFilling));
                            break;
                        case 3:
                            System.out.println("Enter flavor:");
                            scanner.nextLine(); // Consume newline
                            String flavor = scanner.nextLine();
                            candyCollection.add(new JellyCandy(name, weight, sugarContent, flavor));
                            break;
                        default:
                            System.out.println("Invalid type, skipping.");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Error adding sweet: " + e.getMessage());
                }
            }

            // Display the current candy collection
            System.out.println("Candy Collection: " + candyCollection);

            // Allow user to remove a sweet by name
            System.out.println("Enter sweet to remove (by name):");
            scanner.nextLine(); // Consume newline
            String nameToRemove = scanner.nextLine();

            boolean removed = false;
            for (Sweet sweet : candyCollection) {
                if (sweet.getName().equals(nameToRemove)) {
                    candyCollection.remove(sweet);
                    removed = true;
                    break;
                }
            }

            if (removed) {
                System.out.println("Sweet removed successfully.");
            } else {
                System.out.println("Sweet not found.");
            }

            // Display the updated collection
            System.out.println("Updated Collection: " + candyCollection);

            // Display statistics
            double totalWeight = 0;
            int totalCount = 0;

            for (Sweet sweet : candyCollection) {
                totalWeight += sweet.getWeight();
                totalCount++;
            }

            System.out.println("Total sweets: " + totalCount);
            System.out.println("Total weight: " + totalWeight + " grams");

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Ensure the scanner is closed
            scanner.close();
        }
    }
}