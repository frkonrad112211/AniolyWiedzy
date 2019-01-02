package pl.aniolySystem.webApp.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import pl.aniolySystem.webApp.DAO.ChildDAO;
import pl.aniolySystem.webApp.DAO.ChildDAOImpl;
import pl.aniolySystem.webApp.Entity.Child;
import pl.aniolySystem.webApp.Service.ChildServiceImpl;

import java.util.Date;

@Component
public class DbInit implements ApplicationRunner {

        private ChildServiceImpl childService;

        @Autowired
        public DbInit(ChildServiceImpl theChildService) {
            childService = theChildService;
        }

        public void run(ApplicationArguments args) {
            Child child1 = new Child("Lucja","Nowak",new Date(2008-1900,03,10),"Łacznosci 13/1", "Wrocław", "852159753", "Matematyka");
            Child child2 = new Child("Marcin","Furman",new Date(2005-1900,12,15),"Sliczna 1", "Wrocław", "789654123", "Geografia");
            Child child3 = new Child("Edward","Wierzbicki",new Date(2002-1900,10,11),"Teczowa 78", "Wrocław", "506 129 841", "Fizyka");
            childService.save(child1);
        }

}
