package pl.aniolySystem.webApp.DAO;

import pl.aniolySystem.webApp.Entity.Volo;

import java.util.List;

public interface VoloDAO {
    public List<Volo> findAll();

    public Volo findById(int theId);

    public void save(Volo theVolo);

    public void  deleteById(int theId);
}
