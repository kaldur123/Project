package logos.logos.shop;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "director")
@NoArgsConstructor
@Getter
@Setter
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "full_name", length = 100)
    private String fullName;

    @Column(name = "age")
    private int age;

    @Column(name = "email")
    private String email;

    @Column(name = "hobby", length = 100)
    private String hobby;

    @OneToMany(mappedBy = "director")
    private List<Zoo> zoos = new ArrayList<>();

}
