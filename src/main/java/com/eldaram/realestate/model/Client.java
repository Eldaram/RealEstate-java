package com.eldaram.realestate.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name= "client")
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String first_name;
    private String last_name;
    private String phone_number;
    private String address;
}
