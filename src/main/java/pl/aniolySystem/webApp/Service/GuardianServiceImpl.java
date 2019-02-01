package pl.aniolySystem.webApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.aniolySystem.webApp.Entity.Guardian;
import pl.aniolySystem.webApp.Exceptions.GuardianNotFoundException;
import pl.aniolySystem.webApp.Repository.GuardianRepository;

import java.util.List;
import java.util.Optional;

@Service
public class GuardianServiceImpl implements GuardianService {
    @Autowired
    private GuardianRepository guardianRepository;


    @Override
    @Transactional
    public List<Guardian> getAll() {
        return guardianRepository.findAll();
    }

    @Override
    @Transactional
    public Guardian findById(int theId) {
        Optional<Guardian> guardian = guardianRepository.findById(theId);
        if(!guardian.isPresent()){
            throw new GuardianNotFoundException();
        }
        return guardian.get();
    }

    @Override
    @Transactional
    public void save(Guardian theGuardian) {
        guardianRepository.saveAndFlush(theGuardian);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        Guardian guardian = findById(theId);
        guardianRepository.deleteById(guardian.getId());
    }
}
