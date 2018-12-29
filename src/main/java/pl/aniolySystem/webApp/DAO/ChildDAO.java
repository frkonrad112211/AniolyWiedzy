package pl.aniolySystem.webApp.DAO;

import pl.aniolySystem.webApp.Entity.Child;

import java.util.List;

public interface ChildDAO {
    public List<Child> findAll();

    public Child findById(int theId);

    public void save(Child theChild);

    public void  deleteById(int theId);
}