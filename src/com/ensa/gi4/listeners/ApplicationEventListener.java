package com.ensa.gi4.listeners;

import org.springframework.context.ApplicationListener;

import com.ensa.gi4.modele.Materiel;

public class ApplicationEventListener<T extends Materiel> implements ApplicationListener<MyEvent<T>> {
    @Override
    public void onApplicationEvent(MyEvent<T> event) {
        System.out.println("Event triggered");
        System.out.println("event.getEventType() = " + event.getEventType());
        System.out.println("event.getSource() = " + event.getSource());
        
        
        
     /*   if(event.getEventType().equals("ADD")) {
        	
        }else if(event.getEventType().equals("UPDATE")) {
        	
        }else if(event.getEventType().equals("REMOVE")) {
        	
        }else if(event.getEventType().equals("SHOW")) {
        	
        }else if(event.getEventType().equals("EXIT")) {
        	
        }else {
        	
        }*/
    }
}