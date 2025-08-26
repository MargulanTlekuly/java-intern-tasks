public class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    // Этот метод позволяет красиво выводить информацию об объекте Book
    @Override
    public String toString() {
        return "Книга {id=" + id + ", название='" + title + '\'' + ", автор='" + author + '\'' + '}';
    }
}