package pl.aniolySystem.webApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.aniolySystem.webApp.Entity.Child;

public interface ChildRepository extends JpaRepository<Child,Integer> {

}
