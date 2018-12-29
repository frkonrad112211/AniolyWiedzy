package pl.aniolySystem.webApp.DAO;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.aniolySystem.webApp.Entity.Volo;

import javax.persistence.EntityManager;

import java.util.List;
@Repository
public class VoloDAOImpl implements VoloDAO {
    private EntityManager entityManager;

    @Autowired
    public VoloDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Volo> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Volo> query = currentSession.createQuery("from Volo", Volo.class);
        List<Volo> volos = query.getResultList();
        return volos;
    }

    @Override
    public Volo findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Volo volo = currentSession.find(Volo.class,theId);
        return volo;
    }

    @Override
    public void save(Volo theVolo) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theVolo);
    }

    @Override
    public void deleteById(int theId) {
        Session curentSession = entityManager.unwrap(Session.class);
        Query query = curentSession.createQuery("delete from Volo where id = :theId");
        query.setParameter("theId", theId);
        query.executeUpdate();
    }
}
