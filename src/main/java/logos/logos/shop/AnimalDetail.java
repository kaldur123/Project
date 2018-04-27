package logos.logos.shop;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "animal_detail")
@NoArgsConstructor
@Getter
@Setter
public class AnimalDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "species", length = 100)
    private String species;

    @Column(name = "description", length = 500)
    private String description;

    @OneToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;

}
