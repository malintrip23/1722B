// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book carte1 = new Book("C++","Olaf","12345");
        Book carte2 = new Book("C#","Gorp","54321");
        Book carte3 = new Book("Java","Arda","22222");

        Library library = new Library();

        library.addBook(carte1);
        library.addBook(carte2);
        library.addBook(carte3);

        library.displayBooks();
        System.out.println("\n");
        library.removeBook(carte3);
        library.displayBooks();
    }
}