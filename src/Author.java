import java.util.Objects;

public class Author {
    private String authorName;
    private String authorSurname;

    public Author (String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }

    public String getFullName() {
        return this.authorName+" "+this.authorSurname;
    }
    public String toString() {
        return "Автор: "+ this.authorName+" "+ this.authorSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author authors = (Author) o;
        return Objects.equals(authorName, authors.authorName) && Objects.equals(authorSurname, authors.authorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }
}
