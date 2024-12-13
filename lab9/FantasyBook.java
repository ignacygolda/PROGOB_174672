import java.util.ArrayList;
import java.util.Objects;

public class FantasyBook extends Book{
    String fantasySubgenre;
    public FantasyBook(String title, String author, ArrayList<Double> reviews, String fantasySubgenre) {
        super(title,author,reviews);
        this.fantasySubgenre = fantasySubgenre;
    }

    public String getFantasySubgenre() {
        return fantasySubgenre;
    }

    public void setFantasySubgenre(String fantasySubgenre) {
        this.fantasySubgenre = fantasySubgenre;
    }

    @Override
    public String toString() {
        return "FantasyBook{" +
                "fantasySubgenre='" + fantasySubgenre + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", reviews=" + reviews +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FantasyBook that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getFantasySubgenre(), that.getFantasySubgenre());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(getFantasySubgenre());
        return result;
    }
}
