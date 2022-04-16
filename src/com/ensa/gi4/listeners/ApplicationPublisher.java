package com.ensa.gi4.listeners;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.ensa.gi4.modele.Materiel;

public class ApplicationPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;

    }

    public <T extends Materiel> void  publish(MyEvent<T> event) {
        applicationEventPublisher.publishEvent(event);

    }
}
