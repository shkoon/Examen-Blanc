package ma.enset.conferenceservice.entitie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private String texte;
    private int note;
    @ManyToOne
    private Conference conference;
}
