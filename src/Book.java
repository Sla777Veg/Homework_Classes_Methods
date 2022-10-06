import java.util.Objects;

public class Book {
    private Author author;
    private int publisherAge;
    private String title;

    public Book(String title, int publisherAge, Author author) {
        this.title = title;
        this.publisherAge = publisherAge;
        this.author = author;

    }
    public String getTitle() {
        return this.title;
    }

    public int getPublisherAge() {
        return this.publisherAge;
    }

    public void setPublisherAge(int publisherAge) {
        this.publisherAge = publisherAge;
    }
    public Author getAuthor() {
        return this.author;
    }

    public String toString() {
        return  "Название книги: "+ this.title + ", " + this.author+ ", " + " Дата публикации: "+this.publisherAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publisherAge == book.publisherAge && Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, publisherAge, title);
    }
}
