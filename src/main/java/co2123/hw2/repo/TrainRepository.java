package co2123.hw2.repo;

import co2123.hw2.model.Carriage;
import co2123.hw2.model.Train;
import org.springframework.data.repository.CrudRepository;

public interface TrainRepository extends CrudRepository<Train, Integer> {
    public Train findByRoute(String route);
    public Train findByLargest(Carriage largest);
}