package ma.enset.conferenceservice.repository;


import ma.enset.conferenceservice.entitie.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ConferenceRepository extends JpaRepository<Conference,Long> {
}
