public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Noli Me Tangere", "Jose Rizal",
                "ISBN-001", 350.00);
        Book book2 = new Book("El Filibusterismo", "Jose Rizal",
                "ISBN-002", 320.00);

        EBook book3 = new EBook("Florante at Laura", "Francisco Balagtas",
                "ISBN-003", 150.00, "PDF");

        System.out.println("===== BOOK INFORMATION =====");
        book1.displayInfo();
        System.out.println();
        book2.displayInfo();

        System.out.println("\n===== E-BOOK =====");
        book3.displayInfo();

        book2.setPrice(299.50);
        System.out.println("\n===== UPDATED INFORMATION =====");
        System.out.println("Title: " + book2.getTitle());
        System.out.printf("Price: PHP %.2f%n", book2.getPrice());
    }
}

/*
Reflection:
1. setPrice() controls the value and prevents a negative price.
2. EBook inherits title, author, ISBN, price, getters, setters, and
   displayInfo() from Book. It adds fileFormat.
3. An AudioBook class can also extend Book and add its own audio details,
   so the common book information does not need to be written again.
*/
