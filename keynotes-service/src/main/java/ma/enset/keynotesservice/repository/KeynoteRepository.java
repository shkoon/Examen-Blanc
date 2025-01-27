package ma.enset.keynotesservice.repository;

import ma.enset.keynotesservice.entitie.Keynote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface KeynoteRepository extends JpaRepository<Keynote, Long> {
}
