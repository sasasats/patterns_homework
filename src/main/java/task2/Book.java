package task2;

import java.util.Objects;

public abstract class Book {
    public String author;
    public String name;

    public Book() {

    }

    public Book(Book target) {
        if (target != null) {
            this.author = target.author;
            this.name = target.name;
        }
    }

    public abstract Book clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name);
    }
}
