package com.example.Ticket.project.repository;

import com.example.Ticket.project.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {


}
