package com.example.Ticket.project.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTicketRequest {

    private String name;
    private Double price;
    private LocalDate releaseTime;
    private LocalDate endTime;
}
