package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Entity
@Getter @Setter
@Table(name = "autos", schema = "public", catalog = "postgres")
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // генерация ID
    private int id;

    @Column (name = "model")
    private String model;
    @Column (name = "color")
    private String color;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Auto() {
    }

    public Auto(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return id + " " + color + " " + model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return id == auto.id && Objects.equals(model, auto.model) && Objects.equals(color, auto.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, color, user);
    }
}
