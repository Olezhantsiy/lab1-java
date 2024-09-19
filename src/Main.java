public class Main {
    public static void main(String[] args) {

        Author author = new Author(1, "Pushkin", "Aleksander");
        Publisher publisher = new Publisher(1, "AST", "Sant Petersburg", "www.aaaaa.com");
        Book book = new Book(1, 1, 1, "Evgeniy Onegin", "123-456", 2012, 567, true, "roman(novela)", true);

        BookProcessor bookProcessor = (b) -> {
                System.out.println("Book: " + b.getTitle());
                System.out.println("Author: " + author.getFirstName() + " " + author.getLastName());
                System.out.println("Publisher: " + publisher.getNamePublisher() + ", " + publisher.getAddress());
                System.out.println("Доступно: " + (b.isStatus() ? "В наличие" : "Отсутствуют"));
        };

        bookProcessor.processBook(book);
    }
}

interface BookProcessor {
    void processBook(Book book);
}