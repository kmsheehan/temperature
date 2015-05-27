package temperature;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "temperaturedata", path = "temperaturedata")
public interface TemperatureDataRepository extends PagingAndSortingRepository<TemperatureData, Long> {
	
	List<TemperatureData> findBySensorName(@Param("sensorName") String sensorName);

}
