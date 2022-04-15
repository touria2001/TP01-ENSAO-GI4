package com.ensa.gi4.datatabase.impl;

import com.ensa.gi4.datatabase.api.MaterielDao;



public class MaterielDaoImpl implements MaterielDao {
   
  public MaterielDaoImpl() {}
  
  
  
     public ListMateriel getListMateriel() {
        return new ListMaterielImpl(this);
    }

    public void init() {
        System.out.println("post construct method");
    }
}
