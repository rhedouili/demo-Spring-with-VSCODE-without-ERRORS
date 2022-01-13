package com.example.service;

import com.example.dao.IClientDao;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class ClientService implements IClientService {
    IClientDao dao;
   
    ClientService(){
        System.out.println("creation service instance");

    }

    public IClientDao getDao() {
        return this.dao;
    }

    public void setDao(IClientDao dao) {
        this.dao = dao;
    }

}
