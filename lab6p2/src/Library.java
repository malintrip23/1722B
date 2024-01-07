import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    public Library(){
        this.books=new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("Carte adaugata în biblioteca: " + book.getTitle());
    }
    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Carte stearsa din biblioteca: " + book.getTitle());
        } else {
            System.out.println("Cartea nu exista în biblioteca.");
        }
    }
    public void displayBooks() {
        System.out.println("\nLista de carti din biblioteca:");
        for (Book book : books) {
            System.out.println("Titlu: " + book.getTitle() +
                    ", Autor: " + book.getAuthor() +
                    ", ISBN: " + book.getISBN());
        }
    }
}
