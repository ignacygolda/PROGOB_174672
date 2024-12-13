import java.util.Objects;
import java.util.ArrayList;

public class Book {
    String title;
    String author;
    ArrayList<Double> reviews;

    public Book(String title, String author, ArrayList<Double> reviews) {
        this.title = title;
        this.author = author;
        this.reviews = reviews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<Double> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Double> reviews) {
        this.reviews = reviews;
    }

    public void addReview(double review) {
        this.reviews.add(review);
    }

    public void removeReview(double review) {
        this.reviews.remove(review);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", reviews=" + reviews +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;

        return Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getReviews(), book.getReviews());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getTitle());
        result = 31 * result + Objects.hashCode(getAuthor());
        result = 31 * result + Objects.hashCode(getReviews());
        return result;
    }
}
