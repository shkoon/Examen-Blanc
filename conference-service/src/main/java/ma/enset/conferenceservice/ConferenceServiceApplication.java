package ma.enset.conferenceservice;

import ma.enset.conferenceservice.entitie.Conference;
import ma.enset.conferenceservice.entitie.Review;
import ma.enset.conferenceservice.entitie.Type;
import ma.enset.conferenceservice.repository.ConferenceRepository;
import ma.enset.conferenceservice.repository.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ConferenceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConferenceServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(ConferenceRepository conferenceRepository, ReviewRepository reviewRepository, RepositoryRestConfiguration restConfiguration){
        return args -> {
            restConfiguration.exposeIdsFor(Conference.class,Review.class);
            Conference conference=Conference.builder().date(new Date())
                    .durée((int)Math.random()*10000)
                    .nombreInscrits((int)Math.random()*11)
                    .score((int)Math.random()*11)
                    .titre("Titre")
                    .type(Type.ACADEMIQUE).build();
            Conference conference1=Conference.builder().date(new Date())
                    .durée((int)Math.random()*10000)
                    .nombreInscrits((int)Math.random()*11)
                    .score((int)Math.random()*11)
                    .titre("Titre")
                    .type(Type.ACADEMIQUE).build();

            List<Conference> conferenceList=new ArrayList<>();
            conferenceList.add(conference);
            conferenceList.add(conference1);
            conferenceRepository.saveAll(conferenceList);
            for (Conference c:conferenceList
                 ) {
                for (int i = 0; i < 3; i++) {
                    Review review=Review.builder()
                            .date(new Date())
                            .note((int)Math.random()*6).conference(c)
                            .texte("Review")
                            .build();
                    reviewRepository.save(review);
                }
            }


        };
    }
}
