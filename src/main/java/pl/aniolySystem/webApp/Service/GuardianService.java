package pl.aniolySystem.webApp.Service;

import pl.aniolySystem.webApp.Entity.Guardian;

import java.util.List;

public interface GuardianService {
    public List<Guardian> getAll();

    public Guardian findById(int theId);

    public void save(Guardian theGuardian);

    public void  deleteById(int theId);
}
