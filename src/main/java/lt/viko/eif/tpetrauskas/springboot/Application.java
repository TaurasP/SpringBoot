package lt.viko.eif.tpetrauskas.springboot;

import lt.viko.eif.tpetrauskas.springboot.contact.ContactRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@RestController
//@EnableSwagger2
//@EnableJpaRepositories(basePackageClasses = ContactRepository.class)
public class Application {

    //private static final Logger LOG = LogManager.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        /*LOG.debug("This Will Be Printed On Debug");
        LOG.info("This Will Be Printed On Info");
        LOG.warn("This Will Be Printed On Warn");
        LOG.error("This Will Be Printed On Error");
        LOG.fatal("This Will Be Printed On Fatal");

        LOG.info("Appending string: {}.", "Hello, World");*/
    }
}
