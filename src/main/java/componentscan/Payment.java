package componentscan;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class Payment {

    public void getPayment(){
        log.info(" payment library");
    }
}
