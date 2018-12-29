package pl.aniolySystem.webApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.aniolySystem.webApp.DAO.GuardianDAOImpl;
import pl.aniolySystem.webApp.Entity.Guardian;

import java.util.List;

@Service
public class GuardianServiceImpl implements GuardianService {
    @Autowired
    private GuardianDAOImpl guardianDAOImpl;

    @Autowired
    public GuardianServiceImpl(GuardianDAOImpl theGuardianaoImpl) {
        guardianDAOImpl = theGuardianaoImpl;
    }

    @Override
    @Transactional
    public List<Guardian> getAll() {
        return guardianDAOImpl.findAll();
    }

    @Override
    @Transactional
    public Guardian findById(int theId) {
        return guardianDAOImpl.findById(theId);
    }

    @Override
    @Transactional
    public void save(Guardian theGuardian) {
        guardianDAOImpl.save(theGuardian);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        guardianDAOImpl.deleteById(theId);
    }
}
