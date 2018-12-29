package pl.aniolySystem.webApp.REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.aniolySystem.webApp.Entity.Volo;
import pl.aniolySystem.webApp.Service.VoloServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VoloRESTController {
    VoloServiceImpl voloService;

    @Autowired
    VoloRESTController(VoloServiceImpl theVoloServiceImpl){
        voloService = theVoloServiceImpl;
    }

    @GetMapping("/volos")
    public List<Volo> getAll(){
        return voloService.getAll();
    }

    @GetMapping("/volos&id={theId}")
    public Volo findById(@PathVariable int theId){
        return voloService.findById(theId);
    }

    @PostMapping("/volos/add")
    public Volo addVolo(@RequestBody Volo volo){
        volo.setId(0);

        voloService.save(volo);
        return volo;
    }

    @PutMapping("/volos/update")
    public Volo updateVolo(@RequestBody Volo volo){
        voloService.save(volo);
        return volo;
    }

    @DeleteMapping("/volos/delete&id={theId}")
    public String deleteById(@PathVariable int theId){

        if(voloService.findById(theId) == null){
            return "Volo doesn't exists.";
        }
        voloService.deleteById(theId);
        return "Volo Deleted.";
    }


}
