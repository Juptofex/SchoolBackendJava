package be.vinci.cae.fiche2.models;

import jakarta.persistence.*;

@Entity
@Table(name = "drinks")
public class Drink {
    public Drink() {}

    public Drink(String name, String description, float price, Boolean alcoholic) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.alcoholic = alcoholic;
    }

    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String name;
    private String description;
    private float price;
    private Boolean alcoholic;


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public Boolean getAlcoholic() {
        return alcoholic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setAlcoholic(Boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
