package logos.logos.shop;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "animal")
@NoArgsConstructor
@Getter
@Setter
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(name = "animal_zoo", joinColumns = @JoinColumn(name = "animal_id"), inverseJoinColumns = @JoinColumn(name = "zoo_id"))
    private List<Zoo> zoos = new ArrayList<>();

    @OneToOne(mappedBy = "animal")
    private AnimalDetail animalDetail;

}
