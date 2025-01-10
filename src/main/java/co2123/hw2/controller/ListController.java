package co2123.hw2.controller;

import co2123.hw2.model.Carriage;
import co2123.hw2.model.Seat;
import co2123.hw2.model.Train;
import co2123.hw2.repo.CarriageRepository;
import co2123.hw2.repo.SeatRepository;
import co2123.hw2.repo.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListController {

    @Autowired
    private TrainRepository TrainRepo;
    @Autowired
    private CarriageRepository CarriageRepo;
    @Autowired
    private SeatRepository SeatRepo;

    @RequestMapping("/listTrain")
    public String listTrain(Model model){
        model.addAttribute("data", TrainRepo.findAll());
        return "list";
    }

    @RequestMapping("/listCarriage")
    public String listCarriage(Model model) {
        model.addAttribute("data", CarriageRepo.findAll());
        return "list";
    }

    @RequestMapping("/listSeat")
    public String listSeat(Model model) {
        model.addAttribute("data", SeatRepo.findAll());
        return "list";
    }
}
