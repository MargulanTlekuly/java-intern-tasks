import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
    private List<Book> books = new ArrayList<>();
    private int nextId = 1;

    public void addBook(String title, String author) {
        Book newBook = new Book(nextId, title, author);
        books.add(newBook);
        System.out.println("Добавлена книга: " + newBook);
        nextId++;
    }

    public void getAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Библиотека пуста.");
            return;
        }
        System.out.println("--- Список всех книг в библиотеке ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void getBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                System.out.println("Найдена книга по id=" + id + ": " + book);
                return;
            }
        }
        System.out.println("Книга с id=" + id + " не найдена.");
    }

    public void removeBookById(int id) {
        boolean removed = books.removeIf(book -> book.getId() == id);
        if (removed) {
            System.out.println("Книга с id=" + id + " успешно удалена.");
        } else {
            System.out.println("Не удалось удалить: книга с id=" + id + " не найдена.");
        }
    }
}