package com.example.jpaentry.jpaentry.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;
@Entity
@Table(name = "New_jpa_enties") // Consider correcting typo to "New_jpa_entities"
@Data
@NoArgsConstructor


public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String name;
    private String email;
    private String department;
}
