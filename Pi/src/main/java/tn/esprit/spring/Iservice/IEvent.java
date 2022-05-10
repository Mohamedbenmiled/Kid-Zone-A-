package tn.esprit.spring.Iservice;

import java.util.List;

import tn.esprit.spring.entity.Event;



public interface IEvent {
	List<Event> retrieveAllEvents();
	Event addEvent (Event e);
	Event updateEvent (Event e);
    void deleteEvent(Long id);
    Event getEventById(Long id);

}
