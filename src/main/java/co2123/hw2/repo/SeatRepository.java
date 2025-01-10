package co2123.hw2.repo;

import co2123.hw2.model.Seat;
import org.springframework.data.repository.CrudRepository;

public interface SeatRepository extends CrudRepository<Seat, Integer> {
    public Seat findByPrice(int price);
}
