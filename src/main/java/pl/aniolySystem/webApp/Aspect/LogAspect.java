package pl.aniolySystem.webApp.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class LogAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("within(pl.aniolySystem.webApp.*.*)")
    public void whatMethodWasTriggered(JoinPoint joinPoint){
        logger.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        logger.info(joinPoint.getSignature().toLongString());
        logger.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

    }
}
