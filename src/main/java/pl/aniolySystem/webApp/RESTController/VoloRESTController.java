package pl.aniolySystem.webApp.RESTController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.aniolySystem.webApp.Entity.Volo;
import pl.aniolySystem.webApp.Service.VoloServiceImpl;

import java.util.List;

@Api(description="Volunteer REST controller.")
@RestController
@RequestMapping("/api")
public class VoloRESTController {
    VoloServiceImpl voloService;

    @Autowired
    VoloRESTController(VoloServiceImpl theVoloServiceImpl){
        voloService = theVoloServiceImpl;
    }

    @ApiOperation(value = "Return all volunteers with related entities.")
    @GetMapping("/volos")
    public List<Volo> getAll(){
        return voloService.getAll();
    }

    @ApiOperation(value = "Find volunteer by id.")
    @GetMapping("/volos&id={theId}")
    public Volo findById(@PathVariable int theId){
        return voloService.findById(theId);
    }

    @ApiOperation(value = "Add volunteer by id.")
    @PostMapping("/volos/add")
    public Volo addVolo(@RequestBody Volo volo){
        volo.setId(0);

        voloService.save(volo);
        return volo;
    }

    @ApiOperation(value = "Update volunteer data without related entities. ")
    @PutMapping("/volos/update")
    public Volo updateVolo(@RequestBody Volo volo){
        voloService.save(volo);
        return volo;
    }

    @ApiOperation(value = "Deletes volunteer by id.")
    @DeleteMapping("/volos/delete&id={theId}")
    public String deleteById(@PathVariable int theId){

        if(voloService.findById(theId) == null){
            return "Volo doesn't exists.";
        }
        voloService.deleteById(theId);
        return "Volo Deleted.";
    }


}
