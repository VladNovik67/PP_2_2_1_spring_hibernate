package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private int series;
    @Id
    private Long id;


    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private User user;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Car() {
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", id=" + id +
                ", user=" + user +
                '}';
    }
}
