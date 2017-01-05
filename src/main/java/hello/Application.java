package hello;

import hello.storage.StorageProperties;
import hello.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * Created by Luke Chang on 05-Jan-17.
 */
@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class Application{

    @Bean
    CommandLineRunner init(StorageService storageService) {
        return args -> {
          storageService.deleteAll();
          storageService.init();
        };
    }

    /**
     * visit http://localhost:8080/ when the server is running
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
