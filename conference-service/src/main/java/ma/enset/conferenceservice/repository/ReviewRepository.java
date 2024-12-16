package ma.enset.conferenceservice.repository;

import ma.enset.conferenceservice.entitie.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ReviewRepository extends JpaRepository<Review,Long> {
}
