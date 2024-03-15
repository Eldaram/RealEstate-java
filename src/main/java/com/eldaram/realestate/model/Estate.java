package com.eldaram.realestate.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "estate")
@Data
public class Estate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String image;
    private Integer price;
    private String description;
    private String address_line;
    private String zip_code;
    private String city;
    private String rental_charges;

    @ManyToOne
    private Client client;
}
