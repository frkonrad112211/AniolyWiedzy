package pl.aniolySystem.webApp.DAO;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.aniolySystem.webApp.Entity.Child;

import javax.persistence.EntityManager;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Repository
public class ChildDAOImpl implements ChildDAO {

    private EntityManager entityManager;

    @Autowired
    public ChildDAOImpl (EntityManager theEntityManager){
        entityManager = theEntityManager;
    }
    @Override
    public List<Child> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Child> query = currentSession.createQuery("from Child");
        List<Child> children = query.getResultList();
        return children;
    }

    @Override
    public Child findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Child> query = currentSession.createQuery("from Child where id = :theId");
        query.setParameter("theId", theId);
        Child child = query.getSingleResult();
        return child;
    }

    @Override
    public void save(Child theChild) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theChild);
    }

    @Override
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Child> query = currentSession.createQuery("from Child where id = :theId");
        query.setParameter("theId", theId);
        Child child = query.getSingleResult();
        currentSession.delete(child);
    }
}
