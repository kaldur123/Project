package logos.logos.shop;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "zoo")
@NoArgsConstructor
@Getter
@Setter
public class Zoo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", length = 60)
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "square")
    private double square;

    @Column(name = "description", length = 500)
    private String description;

    @ManyToOne
    @JoinColumn(name = "director_id")
    private Director director;

    @ManyToMany
    @JoinTable(name = "animal_zoo", joinColumns = @JoinColumn(name = "zoo_id"), inverseJoinColumns = @JoinColumn(name = "animal_id"))
    private List<Animal> animals = new ArrayList<>();


}
