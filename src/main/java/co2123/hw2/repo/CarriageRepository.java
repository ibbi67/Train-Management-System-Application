package co2123.hw2.repo;

import co2123.hw2.model.Carriage;
import org.springframework.data.repository.CrudRepository;

public interface CarriageRepository extends CrudRepository<Carriage, String> {
    public Carriage findByDescription(String description);
}
