package com.ensa.gi4.datatabase;



import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;
import com.ensa.gi4.service.impl.GestionMaterielServiceImpl;
import org.springframework.context.support.LiveBeansView;

import java.util.ArrayList;
import java.util.List;

public class Factory {

	  private List<Materiel> listMateriel = new ArrayList<>();

	    public Factory()
	    {
	        Chaise chaise = new Chaise();
	        chaise.setName("sofa");
	        Livre livre = new Livre();
	        livre.setName("math livre");

	        listMateriel.add(chaise);
	        listMateriel.add(livre);
	    }

	    public List<Materiel> getListMateriel() {
	        return listMateriel;
	    }

	    public void setListMateriel(List<Materiel> listMateriel) {
	        this.listMateriel = listMateriel;
	    }

}
