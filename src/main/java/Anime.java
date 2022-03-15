import lombok.Data;
@Data
public class Anime {
    private String title;
    private Integer episodes;

    public Anime(String title, Integer quantity) {
        this.title = title;
        this.episodes = quantity;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "episodes='" + title + '\'' +
                ", quantity=" + episodes +
                '}';
    }
}
