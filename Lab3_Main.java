public class Lab3_Main {
    public static void main(String[] args) {
        Automobile[] array =    {
                new Automobile("Mazda", "AB4R2T", 4,false, 20950.45),
                new Automobile("Toyota", "XC9B2Y", 5, true, 18999.99),
                new Automobile("Honda", "HY6T8K", 4, false, 21500.75),
                new Automobile("Ford", "JK3R5Q", 4, true, 17500.50),
                new Automobile("Chevrolet", "LM2D9F", 2, false, 24300.00),
                new Automobile("Nissan", "QA7U3J", 5, true, 19950.30),
                new Automobile("BMW", "VG4M1L", 4, false, 32999.99),
                new Automobile("Audi", "TE6Y9P", 5, true, 27950.40),
                new Automobile("Mercedes", "RW8F2C", 4, false, 34900.00),
                new Automobile("Hyundai", "PO1L6D", 4, true, 17999.95),
                new Automobile("Volkswagen", "UZ5Q3X", 5, false, 21900.85)
        };
        System.out.println("Sorted by Price(desc):");
        MergeSort.mergeSort(array, ObjectComparators.byPriceDesc);
        for(Automobile element : array){
            System.out.println(element.toString());
        }
        System.out.println("\nSorted by Number(asc):");
        MergeSort.mergeSort(array, ObjectComparators.byNumber);
        for(Automobile element : array){
            System.out.println(element.toString());
        }
    }
}




