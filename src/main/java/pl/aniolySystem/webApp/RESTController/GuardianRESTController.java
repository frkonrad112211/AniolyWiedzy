package pl.aniolySystem.webApp.RESTController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.aniolySystem.webApp.DTO.GuardianDTO;
import pl.aniolySystem.webApp.Entity.Guardian;
import pl.aniolySystem.webApp.Service.GuardianServiceImpl;

import java.util.List;

@Api(description="Guardian REST controller.")
@RestController
@RequestMapping("/api")
public class GuardianRESTController {
    GuardianServiceImpl guardianService;

    @Autowired
    GuardianRESTController(GuardianServiceImpl theGuardianServiceImpl){
        guardianService = theGuardianServiceImpl;
    }

    @ApiOperation(value = "Get all guardians with children assigned.")
    @GetMapping("/guardians")
    public List<Guardian> getAll(){
        return guardianService.getAll();
    }

    @ApiOperation(value = "Get guardian by ID.")
    @GetMapping("/guardians&id={theId}")
    public Guardian findById(@PathVariable int theId){
        return guardianService.findById(theId);
    }

    @ApiOperation(value = "Add new guardian. (Without related entities) ")
    @PostMapping("/guardians/add")
    public Guardian addGuardian(@RequestBody GuardianDTO guardianDTO){
        Guardian guardian = new Guardian();
        guardian.guardianDTOtoguardian(guardianDTO);
        guardianService.save(guardian);
        return guardian;
    }

    @ApiOperation(value = "Update guardian data. ")
    @PutMapping("/guardians/update&id={theId}")
    public Guardian updateGuardian(@PathVariable int theId, @RequestBody GuardianDTO guardianDTO){
        Guardian guardian = findById(theId);
        guardian.guardianDTOtoguardian(guardianDTO);
        guardianService.save(guardian);
        return guardian;
    }

    @ApiOperation(value = "Deletes given guardian.")
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
