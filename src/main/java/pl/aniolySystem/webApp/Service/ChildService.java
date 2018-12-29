package pl.aniolySystem.webApp.Service;

import pl.aniolySystem.webApp.Entity.Child;

import java.util.List;

public interface ChildService {
    public List<Child> getAll();

    public Child findById(int theId);

    public void save(Child theChild);

    public void  deleteById(int theId);
}
