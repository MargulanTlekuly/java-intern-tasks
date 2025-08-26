public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        myLibrary.addBook("Война и мир", "Лев Толстой");
        myLibrary.addBook("1984", "Джордж Оруэлл");
        myLibrary.addBook("Мастер и Маргарита", "Михаил Булгаков");
        System.out.println();

        myLibrary.getAllBooks();
        System.out.println();

        myLibrary.getBookById(2);
        myLibrary.getBookById(99);
        System.out.println();

        myLibrary.removeBookById(1);
        System.out.println();

        myLibrary.getAllBooks();
    }
}