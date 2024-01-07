public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title,String author,String ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }

    public String getTitle(){
        return  title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String getAuthor(){
        return  author;
    }

    public void setAuthor(String Author){
        this.author=author;
    }

    public String getISBN(){
        return  ISBN;
    }

    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }
}
