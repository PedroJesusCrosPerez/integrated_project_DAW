//package app.proyecto.entity;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//@Data @NoArgsConstructor(force = true) @AllArgsConstructor @EqualsAndHashCode
//@Entity
//@Table(name = "user")
//public sealed abstract class User permits Person {
//
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private final String email;
//    @EqualsAndHashCode.Exclude
//    private final String password;
//}
