package pl.aniolySystem.webApp.REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.aniolySystem.webApp.Entity.Guardian;
import pl.aniolySystem.webApp.Service.GuardianServiceImpl;

import java.util.List;


@RestController
@RequestMapping("/api")
public class GuardianRESTController {
    GuardianServiceImpl guardianService;

    @Autowired
    GuardianRESTController(GuardianServiceImpl theGuardianServiceImpl){
        guardianService = theGuardianServiceImpl;
    }

    @GetMapping("/guardians")
    public List<Guardian> getAll(){
        return guardianService.getAll();
    }

    @GetMapping("/guardians&id={theId}")
    public Guardian findById(@PathVariable int theId){
        return guardianService.findById(theId);
    }

    @PostMapping("/guardians/add")
    public Guardian addGuardian(@RequestBody Guardian guardian){
        guardian.setId(0);

        guardianService.save(guardian);
        return guardian;
    }

    @PutMapping("/guardians/update")
    public Guardian updateGuardian(@RequestBody Guardian guardian){
        guardianService.save(guardian);
        return guardian;
    }

    @DeleteMapping("/guardians/delete&id={theId}")
    public String deleteById(@PathVariable int theId){
        try {
            Guardian guardian = guardianService.findById(theId);
        }catch (javax.persistence.NoResultException e){
            return "Guardian doesn't exists.";
        }
        guardianService.deleteById(theId);
        return "Guardian Deleted.";
    }
}
