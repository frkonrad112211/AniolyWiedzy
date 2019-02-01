package pl.aniolySystem.webApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.aniolySystem.webApp.Entity.Guardian;

public interface GuardianRepository extends JpaRepository<Guardian, Integer> {
}
