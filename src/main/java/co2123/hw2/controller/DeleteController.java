package co2123.hw2.controller;

import co2123.hw2.repo.CarriageRepository;
import co2123.hw2.repo.SeatRepository;
import co2123.hw2.repo.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteController {

    @Autowired
    private TrainRepository TrainRepo;
    @Autowired
    private CarriageRepository CarriageRepo;
    @Autowired
    private SeatRepository SeatRepo;

    @RequestMapping("/deleteTrain")
    public String DeleteTrain(@RequestParam int id) {
        if(TrainRepo.existsById(id)){
            TrainRepo.deleteById(id);
        }
        return "/";
    }

    @RequestMapping("/deleteCarriage")
    public String DeleteCarriage(@RequestParam String description) {
        if(CarriageRepo.existsById(description)){
            CarriageRepo.deleteById(description);
        }
        return "/";
    }

    @RequestMapping("/deleteSeat")
    public String DeleteSeat(@RequestParam int identifier) {
        if(SeatRepo.existsById(identifier)){
            SeatRepo.deleteById(identifier);
        }
        return "/";
    }
}
