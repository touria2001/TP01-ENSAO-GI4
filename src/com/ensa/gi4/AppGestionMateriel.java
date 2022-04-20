package com.ensa.gi4;

import com.ensa.gi4.controller.GestionMaterielController;
import com.ensa.gi4.listeners.ApplicationPublisher;
import com.ensa.gi4.listeners.EventType;
import com.ensa.gi4.listeners.MyEvent;
import com.ensa.gi4.modele.Livre;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("all")

@ComponentScan(basePackages = {"com.ensa.gi4"})
public class AppGestionMateriel {
 //   private static final ApplicationContext APPLICATION_CONTEXT;
	private static final AnnotationConfigApplicationContext  APPLICATION_CONTEXT ;

    static { // bloc static pour initilialisation
     //   APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("/beans/*-context.xml");
    	//   APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("/beans/annotation.xml");
    	 APPLICATION_CONTEXT = new AnnotationConfigApplicationContext(AppGestionMateriel.class);
    }

    public static void main(String[] args) {
        final GestionMaterielController gestionMaterielController = APPLICATION_CONTEXT.getBean(GestionMaterielController.class);
      //  final ApplicationPublisher publisher = APPLICATION_CONTEXT.getBean(ApplicationPublisher.class);
      //  publisher.publish(new MyEvent<>(new Livre(), EventType.ADD));
        
        while (true) { // pour que l'appliation tourne jusqu'à la demande de l'utilisateur de l'arrêter
            gestionMaterielController.afficherMenu();
        }

    }
}
