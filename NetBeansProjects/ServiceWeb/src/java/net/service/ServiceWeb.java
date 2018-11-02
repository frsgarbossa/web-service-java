/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Sgarbossa Francesco
 */
@WebService(serviceName = "ServiceWeb")
public class ServiceWeb {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "somma")
    public double somma(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a + b;
    }
    
    @WebMethod(operationName = "restart")
    public double restart(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a - b;
    }
    
}
