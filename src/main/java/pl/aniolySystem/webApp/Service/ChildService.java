package pl.aniolySystem.webApp.Service;

import pl.aniolySystem.webApp.Entity.Child;
import pl.aniolySystem.webApp.Entity.Guardian;
import pl.aniolySystem.webApp.Entity.Volo;

import java.util.List;
import java.util.Set;

public interface ChildService {
    public List<Child> getAll();

    public Child findById(int theId);

    public void save(Child theChild);

    public void  deleteById(int theId);

    public void assignGuardian(int childId, int guardianId);

    public void assignVolo(int childId, int voloId);

    public Set<Guardian> getGuardianList(int childId);

    public Set<Volo> getVoloList(int childId);
}
