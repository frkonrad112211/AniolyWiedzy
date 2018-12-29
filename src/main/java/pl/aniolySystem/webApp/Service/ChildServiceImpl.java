package pl.aniolySystem.webApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.aniolySystem.webApp.DAO.ChildDAOImpl;
import pl.aniolySystem.webApp.Entity.Child;

import java.util.List;

@Service
public class ChildServiceImpl implements ChildService {
    @Autowired
    private ChildDAOImpl childDAOImpl;

    @Autowired
    public ChildServiceImpl(ChildDAOImpl theChildDaoImpl) {
        childDAOImpl = theChildDaoImpl;
    }

    @Override
    @Transactional
    public List<Child> getAll() {
        return childDAOImpl.findAll();
    }

    @Override
    @Transactional
    public Child findById(int theId) {
        return childDAOImpl.findById(theId);
    }

    @Override
    @Transactional
    public void save(Child theChild) {
        childDAOImpl.save(theChild);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        childDAOImpl.deleteById(theId);
    }
}
