package pl.aniolySystem.webApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.aniolySystem.webApp.Entity.Volo;

public interface VoloRepository extends JpaRepository<Volo,Integer> {
}
