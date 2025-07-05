package com.myhome.property.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name="properties")
@NoArgsConstructor
@Builder
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private Double price;

    private ArrayList images;

    @Column(nullable = false)
    private Long owner_id;

    @Enumerated(EnumType.STRING)
    private Status status;

}
