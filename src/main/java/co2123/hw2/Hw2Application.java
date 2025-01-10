package co2123.hw2;

import co2123.hw2.model.Carriage;
import co2123.hw2.model.Seat;
import co2123.hw2.model.Train;
import co2123.hw2.repo.CarriageRepository;
import co2123.hw2.repo.SeatRepository;
import co2123.hw2.repo.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class Hw2Application implements CommandLineRunner {

    @Autowired
    private TrainRepository TrainRepo;
    @Autowired
    private CarriageRepository CarriageRepo;
    @Autowired
    private SeatRepository SeatRepo;


    public static void main(String[] args) {
        SpringApplication.run(Hw2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Train t = new Train();
        t.setRoute("London to Manchester");
        t = TrainRepo.save(t);

        Carriage c = new Carriage();
        c.setDescription("Second Class");
        c=CarriageRepo.save(c);

        Seat s = new Seat();
        s.setPrice(25);
        s = SeatRepo.save(s);

        c.setSeats(new ArrayList<>());
        c.getSeats().add(s);
        c.setComfiest(s);
        c = CarriageRepo.save(c);

        t.setCarriages(new ArrayList<>());
        t.getCarriages().add(c);
        t.setLargest(c);
        t = TrainRepo.save(t);

        c.setTrains(new ArrayList<>());
        c.getTrains().add(t);
        c = CarriageRepo.save(c);


    }
}
