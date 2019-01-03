package pl.aniolySystem.webApp.DBInit;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import pl.aniolySystem.webApp.Entity.Child;
import pl.aniolySystem.webApp.Entity.Guardian;
import pl.aniolySystem.webApp.Entity.Volo;
import pl.aniolySystem.webApp.Service.*;

import java.util.Date;

@Component
public class DbInit implements ApplicationRunner {

        private ChildService childService;
        private GuardianService guardianService;
        private VoloService voloService;


        @Autowired
        public DbInit(ChildService theChildService, GuardianService theGuardianService, VoloService theVoloService) {
            childService = theChildService;
            guardianService = theGuardianService;
            voloService = theVoloService;
        }

        public void run(ApplicationArguments args) {
            Child child1 = new Child("child - Lucja","Nowak",new Date(2008-1900,03,10),
                    "Łacznosci 13/1", "Wrocław", "852159753", "Matematyka");
            Child child2 = new Child("child - Marcin","Furman",new Date(2005-1900,12,
                    15), "Sliczna 1", "Wrocław", "789654123", "Geografia");
            Child child3 = new Child("child - Edward","Wierzbicki",new Date(2002-1900,10,
                    11),"Teczowa 78", "Wrocław", "506 129 841", "Fizyka");

            childService.save(child1);
            childService.save(child2);
            childService.save(child3);

            Guardian  guardian1 = new Guardian("guardian - Nadia", "Furman", "Tęczowa 8",
                    "Wrocław", "753159852", "fruman@gmail.com","Notatka");
            Guardian  guardian2 = new Guardian( "guardian - Konrad ", "Fryszkowski",
                    "Łączności 13/1", "Wrocław", "+48506129841", "frkonrad@gmail.com",
                    "Notatka2");

            guardianService.save(guardian1);
            guardianService.save(guardian2);

            Volo volo1 = new Volo("volo - Jakub", "Urbanek", "Wolontariusz", new Date(2018-1900,06,12),
                    new Date(1995-1900,06,12), "Legnicka 56", "Wrocław", "500400300",
                    "urbanek@gmail.com", "Matematyka - liceum", "Ogarnięty chłopak",
                    "Koordynator", "Magnolia");
            Volo volo2 = new Volo("volo - Ivan", "Chepurin", "Koordynator",
                    new Date(2018-1900,01,10), new Date(1990-1900,06,12), "Śliczna 1",
                    "Wrocław", "300200100", "chepurin@gmail.com",
                    "Geografia - podstawwka", "Bardzo pomocny",
                    "Wolontariusz", "Krzyki");

            voloService.save(volo1);
            voloService.save(volo2);

            childService.assignGuardian(child1.getId(),guardian1.getId());



        }

}
