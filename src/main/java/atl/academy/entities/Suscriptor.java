package atl.academy.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "suscriptor")
public class Suscriptor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;
}
