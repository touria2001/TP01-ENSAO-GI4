package com.ensa.gi4.service.impl;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.ensa.gi4.datatabase.api.MaterielDao;
import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;

import com.ensa.gi4.service.api.GestionMaterielService;

import java.util.List;
@Component 
public class GestionMaterielServiceImpl implements GestionMaterielService {
	

	private MaterielDao materielDao;
	private static int n = 0;


	public GestionMaterielServiceImpl(MaterielDao materielDao) {
		this.materielDao = materielDao;
	}

	@Override
	public void init() {
		System.out.println("inititialisation du service");

	}

	@Override
	public void listerMateriel() {
		// System.out.println("Liste de matériel :\n 3 Livres \n 4 chaises");
		for (Materiel m : materielDao.getListMateriel().getListMateriel()) {
			System.out.println(m.getName());
		}
	}

	@Override
	public void ajouterNouveauMateriel() {
		Materiel materiel;
		List<Materiel> list = materielDao.getListMateriel().getListMateriel();
		System.out.println("voulez vous ajouter chaise ou livre? ");
		Scanner scanner = new Scanner(System.in);
		String monMateriel = scanner.next();
		if (monMateriel.equals("chaise")) {
			materiel = new Chaise();
			System.out.println("le nom : ");
			String name = scanner.next();

			materiel.setName(name);
			materiel.setId(n++);
			list.add(materiel);
			materielDao.getListMateriel().setListMateriel(list);

		} else if (monMateriel.equals("livre")) {
			materiel = new Livre();
			System.out.println("le nom : ");
			String name = scanner.next();

			materiel.setName(name);
			materiel.setId(n++);
			list.add(materiel);
			materielDao.getListMateriel().setListMateriel(list);

		}

		else {
			System.out.println("choix invalide");
		}

	}

	@Override

	public void supprimerMateriel(int id) {

		int i = 0;
		int j = 0;
		for (Materiel materiel : materielDao.getListMateriel().getListMateriel()) {
			i++;
			if (materiel.getId() == id) {
				j = 1;
				materielDao.getListMateriel().getListMateriel().remove(i);
				System.out.println("votre materiel a bien �t� supprim�");
				break;
			}
		}

		materielDao.getListMateriel().setListMateriel(materielDao.getListMateriel().getListMateriel());
		if (j == 0) {
			System.out.println("le id que vous avez saisi n'exite pas dans notre shop");
		}

	}

	public void modifier(int id) {

		Scanner scanner = new Scanner(System.in);

		String next;
		int a = 0;
		for (Materiel m : materielDao.getListMateriel().getListMateriel()) {
			if (m.getId() == id) {
				System.out.println("Le nouveau nom : ");
				next = scanner.next();
				m.setName(next);
				a = 1;
			}

		}
		if (a == 0) {
			System.out.println("il n'existe pas");
		}

	}

}
