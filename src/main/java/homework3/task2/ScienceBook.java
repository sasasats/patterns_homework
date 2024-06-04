package homework3.task2;

import java.util.Objects;

public class ScienceBook extends Book {
    public int numberOfPages;

    public ScienceBook() {

    }

    public ScienceBook(ScienceBook target) {
        super(target);
        if (target != null) {
            this.numberOfPages = target.numberOfPages;
        }
    }

    @Override
    public Book clone() {
        return new ScienceBook(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ScienceBook that = (ScienceBook) o;
        return numberOfPages == that.numberOfPages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfPages);
    }
}
