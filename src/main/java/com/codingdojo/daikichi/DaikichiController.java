package com.codingdojo.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	@RequestMapping("")
	public String welcome() {
		return "Welcome";
	}
		
	@RequestMapping("/message")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
		
	@RequestMapping("/message/two")
	public String tommorow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/travel/{destination}")
	public String destination(@PathVariable("destination") String destination) {
		return "You are going to " + destination;
	}
	
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") int number) {
		
		if (number %2 == 0) {
			return "winner";
		}
		else {
			return "Loser";
		}
		
	}
	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	@RequestMapping("/travel/{place}")
//	public String travel(@PathVariable("place") String place) {
//	    return "Your journey to " + place + " will bring you great joy and adventure!";
//	}
//
//	@RequestMapping("/lotto/{num}")
//	public String lotto(@PathVariable("num") Integer num) {
//	    if(num % 2 == 0) {
//	        return "A grand adventure is in store for you, but beware of false promises and temptations!";
//	    } else {
//	        return "You have worked hard and it's time to enjoy the company of your loved ones!";
//	    }
//	}
}
