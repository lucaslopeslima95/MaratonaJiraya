import lombok.Data;
@Data
public class Anime {
    private String title;
    private int quantity;

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
