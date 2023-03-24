package com.example.Ticket.project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketDto {
    private String name;
    private Double price;
    private LocalDate releaseTime;
    private LocalDate endTime;

}
