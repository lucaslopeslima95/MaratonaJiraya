import lombok.*;

@Data
@Getter
@Setter
@Builder
@ToString
public class Anime {
    private String title;
    private Integer episodes;
}
