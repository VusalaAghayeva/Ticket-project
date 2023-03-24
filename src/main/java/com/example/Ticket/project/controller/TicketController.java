package com.example.Ticket.project.controller;

import com.example.Ticket.project.entity.Ticket;
import com.example.Ticket.project.model.TicketDto;
import com.example.Ticket.project.model.request.CreateTicketRequest;
import com.example.Ticket.project.model.request.UpdateTicketRequest;
import com.example.Ticket.project.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
@RequiredArgsConstructor
public class TicketController {

    private final TicketService ticketService;

    @GetMapping
    public List<TicketDto> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @GetMapping("/{id}")
    public TicketDto getTicketById(@PathVariable Long id) {
        return ticketService.getTicketById(id);
    }

    @PostMapping
    public void createTicket(@RequestBody CreateTicketRequest request) {
        ticketService.createTicket(request);
    }

    @PutMapping("/{id}")
  public TicketDto updateTicketById(@PathVariable Long id, @RequestBody UpdateTicketRequest request){
   return ticketService.updateTicket(id,request);
    }

   @DeleteMapping("/{id}")
    public void deleteTicketById(@PathVariable Long id){
        ticketService.deleteTicketById(id);
   }
}
