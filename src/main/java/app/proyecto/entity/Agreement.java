package app.proyecto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "agreement")
public class Agreement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime datetime_start;
    private LocalDateTime datetime_end;

    @EqualsAndHashCode.Exclude
    private int period;
    @EqualsAndHashCode.Exclude
    private long teacher_id;
    @EqualsAndHashCode.Exclude
    private long student_id;
}
