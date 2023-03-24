package com.example.Ticket.project.service;

import com.example.Ticket.project.entity.Ticket;
import com.example.Ticket.project.exception.TicketNotFoundException;
import com.example.Ticket.project.mapper.TicketMapper;
import com.example.Ticket.project.model.TicketDto;
import com.example.Ticket.project.model.request.CreateTicketRequest;
import com.example.Ticket.project.model.request.UpdateTicketRequest;
import com.example.Ticket.project.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;

    public List<TicketDto> getAllTickets() {
        return ticketRepository.findAll().stream()
                .map(TicketMapper::mapEntityToDto)
                .collect(Collectors.toList());
    }

    public TicketDto getTicketById(Long id) {
        return ticketRepository.findById(id)
                .map(TicketMapper::mapEntityToDto)
                .orElseThrow(() -> new TicketNotFoundException("Book not found"));
    }

    public void createTicket(CreateTicketRequest request) {
        Ticket mappedToEntity = TicketMapper.mapToEntity(request);
        ticketRepository.save(mappedToEntity);
    }

    public void deleteTicketById(Long id) {
        ticketRepository.deleteById(id);
    }

    public TicketDto updateTicket(Long id, UpdateTicketRequest request) {
        var ticket = ticketRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ticket not found" + id));

        var updatedTicket = TicketMapper.mapUpdatedRequestToEntity(ticket, request);
        ticketRepository.save(updatedTicket);
        return TicketMapper.mapEntityToDto(updatedTicket);
    }
}
