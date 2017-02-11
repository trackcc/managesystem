package com.isoftstone.finance.managesystem.webservice.app.services;

import com.isoftstone.finance.managesystem.webservice.app.interfaces.IHelloWorld;

import javax.jws.WebService;

@WebService
public class HelloWorldImpl implements IHelloWorld {
        @Override  
        public String sayHello(String username) {  
               
            return "Hello world" + username;
        }  
    }