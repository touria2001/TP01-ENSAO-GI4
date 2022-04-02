package com.ensa.gi4.service.impl;

import java.util.Scanner;

import com.ensa.gi4.datatabase.Factory;
import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;

public class GestionMaterielServiceImpl implements GestionMaterielService {
    // bd goes here
	private Factory factory;
    @Override
    public void init() {
        System.out.println("inititialisation du service");
    }

    @Override
    public void listerMateriel() {
        System.out.println("Liste de matériel :\n 3 Livres \n 4 chaises");
    }

    @Override
    public void ajouterNouveauMateriel(Materiel materiel) {
        // à compléter
        System.out.println("L'ajout du matériel " + materiel.getName() + " effectué avec succès !");
    }
    @Override
    public void supprimerMateriel(int id) {
    	
    	
    		
    		int i =0;
    		int j=0;
    		for(Materiel materiel : factory.getListMateriel()) {
    			i++;
    			if(materiel.getId() == id) {
    				j=1;
    				factory.getListMateriel().remove(i);
    				System.out.println("votre materiel a bien �t� supprim�");
    				break;
    			}
    		}
    		
    		factory. setListMateriel(factory.getListMateriel());
    		if(j == 0) {
    			System.out.println("le id que vous avez saisi n'exite pas dans notre shop");
    		}
    		
    	
    	
    	
    }
}
