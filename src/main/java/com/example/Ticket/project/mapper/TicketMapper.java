package com.example.Ticket.project.mapper;

import com.example.Ticket.project.entity.Ticket;
import com.example.Ticket.project.model.TicketDto;
import com.example.Ticket.project.model.request.CreateTicketRequest;
import com.example.Ticket.project.model.request.UpdateTicketRequest;
import lombok.experimental.UtilityClass;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class TicketMapper {

    public static Ticket mapToEntity(CreateTicketRequest request) {
        return Ticket.builder()
                .name(request.getName())
                .price(request.getPrice())
                .releaseTime(LocalDate.now())
                .endTime(LocalDate.now())
                .build();
    }

    public static TicketDto mapEntityToDto(Ticket ticket) {
        return TicketDto.builder()
                .name(ticket.getName())
                .price(ticket.getPrice())
                .releaseTime(LocalDate.now())
                .endTime(LocalDate.now())
                .build();
    }

    public static Ticket mapDtoToEntity(TicketDto ticketDto) {
        return Ticket.builder()
                .name(ticketDto.getName())
                .price(ticketDto.getPrice())
                .releaseTime(LocalDate.now())
                .endTime(LocalDate.now())
                .build();
    }

    public static Ticket mapUpdatedRequestToEntity(Ticket ticket, UpdateTicketRequest request) {
        return Ticket.builder()
                .id(ticket.getId())
                .name(request.getName())
                .price(request.getPrice())
                .releaseTime(request.getReleaseTime())
                .endTime(request.getEndTime())
                .build();
    }
}
