package app.proyecto.repository;

import app.proyecto.entity.UserAll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAllRepository extends JpaRepository<UserAll, Integer> {
}
