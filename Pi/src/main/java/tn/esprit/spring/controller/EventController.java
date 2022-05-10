package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Iservice.IEvent;
import tn.esprit.spring.entity.Event;

@RestController
@RequestMapping("/event")
public class EventController {
 
	
	@Autowired
	IEvent IE;
	
	@GetMapping("/retrieve-all-event")
	@ResponseBody
	public List<Event> getEvents() {
		List<Event> list = IE.retrieveAllEvents();
		return list;
	}
	
	@PostMapping("/add-event")
	@ResponseBody
	public Event addEvent(@RequestBody Event e) {
		Event event = IE.addEvent(e);
		return event;
		}
	
	@DeleteMapping("/remove-event/{event-id}")
	@ResponseBody
	public void deleteEvent(@PathVariable("event-id") Long idEvent) {
		IE.deleteEvent(idEvent);
	}
	
	@PutMapping("/modify-event")
	@ResponseBody
	public Event modifyEvent(@RequestBody Event event) {
		return IE.updateEvent(event);
	}
	
	@GetMapping("/retrieve-event/{event-id}")
	@ResponseBody
	public Event retrieveEvent(@PathVariable("event-id") Long idEvent) {
		return IE.getEventById(idEvent);
	}
	
	
}
