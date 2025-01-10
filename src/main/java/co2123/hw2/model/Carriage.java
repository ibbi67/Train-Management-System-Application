package co2123.hw2.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Carriage {
    @Id
    private String description;

    @ManyToMany
    private List<Train> trains;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn
    private List<Seat> seats;

    @OneToOne
    private Seat comfiest;

    public Carriage(String description, List<Train> trains, List<Seat> seats, Seat comfiest) {
        this.description = description;
        this.trains = trains;
        this.seats = seats;
        this.comfiest = comfiest;
    }

    public Carriage() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public Seat getComfiest() {
        return comfiest;
    }

    public void setComfiest(Seat comfiest) {
        this.comfiest = comfiest;
    }

    @Override
    public String toString() {
        return "Carriage{" +
                "description='" + description + '\'' +
                ", seats=" + seats +
                ", comfiest=" + comfiest +
                '}';
    }
}
