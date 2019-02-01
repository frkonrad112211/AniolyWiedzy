package pl.aniolySystem.webApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.aniolySystem.webApp.Entity.Volo;
import pl.aniolySystem.webApp.Exceptions.VoloNotFoundException;
import pl.aniolySystem.webApp.Repository.VoloRepository;

import java.util.List;
import java.util.Optional;

@Service
public class VoloServiceImpl implements VoloService{
    @Autowired
    private VoloRepository voloRepository;

    @Override
    @Transactional
    public List<Volo> getAll() {
        return voloRepository.findAll();
    }

    @Override
    @Transactional
    public Volo findById(int theId) {
        Optional<Volo> volo = voloRepository.findById(theId);
        if(!volo.isPresent()){
            throw new VoloNotFoundException();
        }
        return volo.get();
    }

    @Override
    @Transactional
    public void save(Volo theVolo) {
        voloRepository.saveAndFlush(theVolo);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        Volo volo = findById(theId);
        voloRepository.deleteById(volo.getId());
    }
}
