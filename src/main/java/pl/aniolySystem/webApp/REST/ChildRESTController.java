package pl.aniolySystem.webApp.REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.aniolySystem.webApp.Entity.Child;
import pl.aniolySystem.webApp.Service.ChildServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChildRESTController {
    ChildServiceImpl childService;

    @Autowired
    ChildRESTController(ChildServiceImpl theChildServiceImpl){
        childService = theChildServiceImpl;
    }

    @GetMapping("/children")
    public List<Child> getAll(){
        return childService.getAll();
    }

    @GetMapping("/children&id={theId}")
    public Child findById(@PathVariable int theId){
        return childService.findById(theId);
    }

    @PostMapping("/children/add")
    public Child addChild(@RequestBody Child child){
        child.setId(0);

        childService.save(child);
        return child;
    }

    @PutMapping("/children/update")
    public Child updateChild(@RequestBody Child child){
        childService.save(child);
        return child;
    }

    @DeleteMapping("/children/delete&id={theId}")
    public String deleteById(@PathVariable int theId){
        try {
            Child child = childService.findById(theId);
        }catch (javax.persistence.NoResultException e){
            return "Child doesn't exists.";
        }
        childService.deleteById(theId);
        return "Child Deleted.";
    }


}
