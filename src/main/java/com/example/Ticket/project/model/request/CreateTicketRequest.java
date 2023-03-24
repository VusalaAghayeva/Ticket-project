package com.example.Ticket.project.model.request;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class CreateTicketRequest {

    private String name;
    private Double price;
    private LocalDate releaseTime;
    private LocalDate endTime;
}
