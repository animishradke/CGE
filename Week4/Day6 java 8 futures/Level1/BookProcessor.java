package Level1;
import java.util.*;
import java.util.stream.*;

class Book {
    String title;
    String author;
    String genre;
    double rating;

    public Book(String title, String author, String genre, double rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }

    public String getGenre() { return genre; }
    public double getRating() { return rating; }
    public String getTitle() { return title; }
}

class BookRecommendation {
    String title;
    double rating;

    public BookRecommendation(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return title + " - Rating: " + rating;
    }
}

public class BookProcessor {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Dune", "Frank Herbert", "Science Fiction", 4.8),
            new Book("Foundation", "Isaac Asimov", "Science Fiction", 4.4),
            new Book("Neuromancer", "William Gibson", "Science Fiction", 4.1),
            new Book("Snow Crash", "Neal Stephenson", "Science Fiction", 4.3),
            new Book("Hyperion", "Dan Simmons", "Science Fiction", 4.5),
            new Book("Ender's Game", "Orson Scott Card", "Science Fiction", 4.7),
            new Book("The Martian", "Andy Weir", "Science Fiction", 4.6),
            new Book("Ready Player One", "Ernest Cline", "Science Fiction", 4.2),
            new Book("Childhood's End", "Arthur C. Clarke", "Science Fiction", 4.0),
            new Book("Red Mars", "Kim Stanley Robinson", "Science Fiction", 4.05),
            new Book("Brave New World", "Aldous Huxley", "Dystopian", 4.3),
            new Book("1984", "George Orwell", "Dystopian", 4.6)
        );

        List<BookRecommendation> top10 = books.stream()
            .filter(b -> b.getGenre().equals("Science Fiction") && b.getRating() > 4.0)
            .map(b -> new BookRecommendation(b.getTitle(), b.getRating()))
            .sorted(Comparator.comparingDouble(BookRecommendation::getRating).reversed())
            .limit(10)
            .collect(Collectors.toList());

        List<List<BookRecommendation>> paginated = new ArrayList<>();
        for (int i = 0; i < top10.size(); i += 5) {
            paginated.add(top10.subList(i, Math.min(i + 5, top10.size())));
        }

        for (int page = 0; page < paginated.size(); page++) {
            System.out.println("Page " + (page + 1));
            paginated.get(page).forEach(System.out::println);
            System.out.println();
        }
    }
}
