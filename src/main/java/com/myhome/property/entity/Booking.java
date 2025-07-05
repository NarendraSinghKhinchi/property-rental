package com.myhome.property.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bookings")
@Builder
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long tenant_id;

    private Date start_date;

    private Date end_date;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String payment_status;
}
