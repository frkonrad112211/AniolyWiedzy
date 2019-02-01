package pl.aniolySystem.webApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.aniolySystem.webApp.Entity.Child;
import pl.aniolySystem.webApp.Entity.Guardian;
import pl.aniolySystem.webApp.Entity.Volo;
import pl.aniolySystem.webApp.Exceptions.ChildNotFoundException;
import pl.aniolySystem.webApp.Repository.ChildRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ChildServiceImpl implements ChildService {

    @Autowired
    ChildRepository childRepository;

    @Autowired
    GuardianService guardianService;

    @Autowired
    VoloService voloService;

    @Override
    @Transactional
    public List<Child> getAll() {
        return childRepository.findAll();
    }

    @Override
    @Transactional
    public Child findById(int theId) {
        Optional<Child> child = childRepository.findById(theId);
        if (!child.isPresent()){
            throw new ChildNotFoundException();
        }
        return child.get();
    }

    @Override
    @Transactional
    public void save(Child theChild) {
        //theChild.setId(0);
        childRepository.saveAndFlush(theChild);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        Child child= findById(theId);
        childRepository.deleteById(child.getId());
    }

    @Override
    @Transactional
    public void assignGuardian(int childId, int guardianId) {
        Child child = findById(childId);
        Guardian guardian = guardianService.findById(guardianId);
        child.getGuardianList().add(guardian);
        childRepository.save(child);
    }

    @Override
    @Transactional
    public void assignVolo(int childId, int voloId) {
        Child child = findById(childId);
        Volo volo = voloService.findById(voloId);
        child.getVoloList().add(volo);
        childRepository.save(child);
    }

    @Override
    @Transactional
    public Set<Guardian> getGuardianList(int childId) {
        Child child = findById(childId);
        return child.getGuardianList();
    }

    @Override
    @Transactional
    public Set<Volo> getVoloList(int childId) {
        Child child = findById(childId);
        return child.getVoloList();
    }



}
