package com.geekster.UniversityEventManagement.service;

import com.geekster.UniversityEventManagement.model.Event;
import com.geekster.UniversityEventManagement.repository.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    IEventRepo eventRepo;

    public String addEvent(Event event) {
        eventRepo.save(event);
        return "Event added";
    }

    public String updateEvent(Long id,Event event) {
        Optional<Event> renewEvent = eventRepo.findById(id);
        if(renewEvent.isEmpty())
            return "ID NOT FOUND: "+id;

        Event newEvent = renewEvent.get();
        newEvent.setEventName(event.getEventName());
        newEvent.setEventLocation(event.getEventLocation());
        newEvent.setDate(event.getDate());
        newEvent.setStartTime(event.getStartTime());
        newEvent.setEndTime(event.getEndTime());

        eventRepo.save(newEvent);
        return "Event Updated";
    }

    public String deleteEvent(Long id) {
        Optional<Event> event = eventRepo.findById(id);
        if(event.isEmpty())
            return "ID NOT FOUND: "+id;

        eventRepo.deleteById(id);
        return "Event by this id: "+id+ " Deleted";
    }

    public List<Event> getAllEventsByDate(LocalDate date) {
        return eventRepo.getAllByDate(date);
    }
}
