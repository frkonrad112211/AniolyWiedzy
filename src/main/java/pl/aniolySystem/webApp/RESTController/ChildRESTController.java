package pl.aniolySystem.webApp.RESTController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.aniolySystem.webApp.DTO.ChildDTO;
import pl.aniolySystem.webApp.Entity.Child;
import pl.aniolySystem.webApp.Entity.Guardian;
import pl.aniolySystem.webApp.Entity.Volo;
import pl.aniolySystem.webApp.Service.ChildServiceImpl;

import java.util.List;
import java.util.Set;

@Api(description="Child REST controller.")
@RestController
@RequestMapping("/api")
public class ChildRESTController {
    @Autowired
    ChildServiceImpl childService;

    @ApiOperation(value = "Fetch all children with their guardians and volunteers.")
    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/child")
    public List<Child> getAll(){
        return childService.getAll();
    }

    @ApiOperation(value = "Find child by id.")
    @ResponseStatus(HttpStatus.FOUND)
    @GetMapping("/child&id={theId}")
    public Child findById(@PathVariable int theId){
        return childService.findById(theId);
    }

    @ApiOperation(value = "Add new child")
    @PostMapping(value = "/child/add", consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_JSON_VALUE})
    public Child addChild(@RequestBody ChildDTO childDTO){
        Child child = new Child();
        child.fromChildDTOtoChild(childDTO);
        childService.save(child);
        return child;
    }

    @ApiOperation(value = "Assigns guardian to child, by childId and guardianId.")
    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/child/assignGuardian&childId={childId}&guardianId={guardianId}")
    public Child assignGuardianToChild( @PathVariable int childId, @PathVariable int guardianId){
        childService.assignGuardian(childId,guardianId);
        return childService.findById(childId);
    }

    @ApiOperation(value = "Gets all the guardians assigned to child with childId.")
    @GetMapping("/child/getGurdians&id={theId}")
    public Set<Guardian> getChildGuardians(@PathVariable int theId){
        return childService.getGuardianList(theId);
    }

    @ApiOperation(value = "Gets all the volunteers assigned to child with childId.")
    @GetMapping("/child/getVolos&id={theId}")
    public Set<Volo> getChildVolos(@PathVariable int theId){
        return childService.getVoloList(theId);
    }


    @ApiOperation(value = "Updates child information. Without related entities.")
    @PutMapping("/child/update&childId={childId}")
    public Child updateChild(@PathVariable int childId, @RequestBody ChildDTO childDTO){
        Child child = findById(childId);
        child.fromChildDTOtoChild(childDTO);
        childService.save(child);
        return child;
    }

    @ApiOperation(value = "Deletes child from database by id.")
    @DeleteMapping("/child/delete&id={theId}")
    public String deleteById(@PathVariable int theId){
        Child child = childService.findById(theId);
        childService.deleteById(theId);
        return "Child Deleted.";
    }




}
