package pl.aniolySystem.webApp.DAO;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.aniolySystem.webApp.Entity.Guardian;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class GuardianDAOImpl implements GuardianDAO {

    private EntityManager entityManager;

    @Autowired
    public GuardianDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Guardian> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Guardian> query = currentSession.createQuery("from Guardian");
        List<Guardian> children = query.getResultList();
        return children;
    }

    @Override
    public Guardian findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Guardian> query = currentSession.createQuery("from Guardian where id = :theId");
        query.setParameter("theId", theId);
        Guardian child = query.getSingleResult();
        return child;
    }

    @Override
    public void save(Guardian theGuardian) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theGuardian);
    }

    @Override
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Guardian> query = currentSession.createQuery("from Guardian where id = :theId");
        query.setParameter("theId", theId);
        Guardian child = query.getSingleResult();
        currentSession.delete(child);
    }
}
