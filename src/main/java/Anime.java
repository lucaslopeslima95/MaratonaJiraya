import lombok.Data;
@Data
public class Anime {
    private String title;
    private Integer quantity;
    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
