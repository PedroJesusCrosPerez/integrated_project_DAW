package app.proyecto.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "userAll")
public class UserAll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private final String email;

    @EqualsAndHashCode.Exclude
    private final String password;

    @EqualsAndHashCode.Exclude
    private String first_name;

    @EqualsAndHashCode.Exclude
    private String last_name;
}
