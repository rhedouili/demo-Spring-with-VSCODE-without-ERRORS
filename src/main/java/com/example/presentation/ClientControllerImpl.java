package com.example.presentation;

import com.example.service.IClientService;



public class ClientControllerImpl implements IClientController {
    IClientService serv; 
    
    ClientControllerImpl(){
        System.out.println("Controller construct");
    }

    public IClientService getServ() {
        return this.serv;
    }

    public void setServ(IClientService serv) {
        this.serv = serv;
    }
    
}
