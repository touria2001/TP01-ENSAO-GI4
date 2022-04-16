package com.ensa.gi4.datatabase.impl;

import org.springframework.stereotype.Component;

import com.ensa.gi4.datatabase.api.MaterielDao;



@Component
public class MaterielDaoImpl implements MaterielDao {
   
  public MaterielDaoImpl() {}
  
  
  
     public ListMateriel getListMateriel() {
        return new ListMaterielImpl();
    }

    public void init() {
        System.out.println("post construct method");
    }
}
