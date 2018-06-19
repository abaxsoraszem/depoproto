package depoproto;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "kunden", path = "kunden")
public interface KundeRepository extends PagingAndSortingRepository<Kunde, Long> {

	List<Kunde> findByStadt(@Param("stadt") String stadt);

}
