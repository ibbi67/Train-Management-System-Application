package co2123.hw2.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String route;

    @ManyToMany(mappedBy = "trains", cascade = CascadeType.PERSIST)
    private List<Carriage> carriages;

    @ManyToOne
    private Carriage largest;

    public Train(int id, String route, List<Carriage> carriages, Carriage largest) {
        this.id = id;
        this.route = route;
        this.carriages = carriages;
        this.largest = largest;
    }

    public Train() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public List<Carriage> getCarriages() {
        return carriages;
    }

    public void setCarriages(List<Carriage> carriages) {
        this.carriages = carriages;
    }

    public Carriage getLargest() {
        return largest;
    }

    public void setLargest(Carriage largest) {
        this.largest = largest;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", route='" + route + '\'' +
                ", carriages=" + carriages +
                ", largest=" + largest +
                '}';
    }
}