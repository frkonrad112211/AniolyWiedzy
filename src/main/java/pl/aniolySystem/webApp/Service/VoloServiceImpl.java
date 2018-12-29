package pl.aniolySystem.webApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.aniolySystem.webApp.DAO.VoloDAO;
import pl.aniolySystem.webApp.DAO.VoloDAOImpl;
import pl.aniolySystem.webApp.Entity.Volo;

import java.util.List;

@Service
public class VoloServiceImpl implements VoloService{
    @Autowired
    private VoloDAOImpl voloDAOImpl;

    @Autowired
    public VoloServiceImpl(VoloDAOImpl theVoloDaoImpl) {
        voloDAOImpl = theVoloDaoImpl;
    }

    @Override
    @Transactional
    public List<Volo> getAll() {
        return voloDAOImpl.findAll();
    }

    @Override
    @Transactional
    public Volo findById(int theId) {
        return voloDAOImpl.findById(theId);
    }

    @Override
    @Transactional
    public void save(Volo theVolo) {
        voloDAOImpl.save(theVolo);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        voloDAOImpl.deleteById(theId);
    }
}
