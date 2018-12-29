package pl.aniolySystem.webApp.Service;

import pl.aniolySystem.webApp.Entity.Volo;

import java.util.List;

public interface VoloService {
    public List<Volo> getAll();

    public Volo findById(int theId);

    public void save(Volo theVolo);

    public void  deleteById(int theId);

}
