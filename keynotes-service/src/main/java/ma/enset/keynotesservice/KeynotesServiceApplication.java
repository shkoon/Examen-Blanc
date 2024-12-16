package ma.enset.keynotesservice;

import ma.enset.keynotesservice.entitie.Keynote;
import ma.enset.keynotesservice.repository.KeynoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KeynotesServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeynotesServiceApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(KeynoteRepository keynoteRepository){
        return (args ->{

           keynoteRepository.save(Keynote.builder().email("ahmed@gmail.com").fonction("Developpeur")
                   .prénom("Morgan").nom("Ahmed").build());
            keynoteRepository.save(Keynote.builder().email("Nissy@gmail.com").fonction("Business Analyst")
                    .prénom("Kabbaj").nom("Nissrin").build());
            keynoteRepository.save(Keynote.builder().email("zineb@gmail.com").fonction("Developpeur")
                    .prénom("Zniber").nom("Zineb").build());
            keynoteRepository.save(Keynote.builder().email("jp@gmail.com").fonction("Testeur")
                    .prénom("Jp").nom("Morgan").build());
        });
    }
}
