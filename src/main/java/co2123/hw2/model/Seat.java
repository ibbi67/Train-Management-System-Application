package co2123.hw2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identifier;

    private int price;

    public Seat(int identifier, int price) {
        this.identifier = identifier;
        this.price = price;
    }

    public Seat() {

    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "identifier=" + identifier +
                ", price=" + price +
                '}';
    }
}