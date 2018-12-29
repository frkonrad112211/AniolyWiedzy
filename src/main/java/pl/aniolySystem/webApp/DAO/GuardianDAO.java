package pl.aniolySystem.webApp.DAO;

import pl.aniolySystem.webApp.Entity.Guardian;

import java.util.List;

public interface GuardianDAO {
    public List<Guardian> findAll();

    public Guardian findById(int theId);

    public void save(Guardian theGuardian);

    public void  deleteById(int theId);
}
