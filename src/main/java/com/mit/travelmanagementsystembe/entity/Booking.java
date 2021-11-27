package com.mit.travelmanagementsystembe.entity;

import com.mit.travelmanagementsystembe.enums.TransportationMedium;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long requestId;
    private String staffId;
    private String staffName;
    private String travelType;
    private Date departureDate;
    private String departureLocation;
    private String arrivalDate;
    private TransportationMedium medium;
    private String transportName;
    private String ticketId;
    private String travelPurpose;
    private String destinationCountry;
    private String comment;
    private String approvedBy;
    
}
