public class App {
    public static void main(String[] args) throws Exception {
        Book[] books = {
            new Book(1, "Harry Potter and The Philosopher's Stone", "J.K. Rowling"),
            new Book(2, "1984", "George Orwell"),
            new Book(3, "The Martian", "Andy Weir"),
            new Book(4, "Crime and Punishment", "Fyodor Dostoevsky"),
        };

        Book result1 = LibrarySearch.linearSearchByTitle(books, "1984");
        System.out.println("Linear Search Result: " + result1);

        Book result2 = LibrarySearch.binarySearchByTitle(books, "Crime and Punishment");
        System.out.println("Binary Search Result: " + result2);
    }
}
