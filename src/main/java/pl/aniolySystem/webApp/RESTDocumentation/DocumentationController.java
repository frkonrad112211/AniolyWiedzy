package pl.aniolySystem.webApp.RESTDocumentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DocumentationController {
    @RequestMapping(value = "/doc", method = RequestMethod.GET)
    public String goToDocumentation(){
        return "doc";
    }
}
