package app.proyecto.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "person")
public sealed /*final*/ class Person extends User permits Teacher {

    @EqualsAndHashCode.Exclude
    private String first_name;
    @EqualsAndHashCode.Exclude
    private String last_name;

    public Person(Long id, String email, String password, String first_name, String last_name) {
        super(id, email, password);
        this.first_name = first_name;
        this.last_name = last_name;
    }
}
