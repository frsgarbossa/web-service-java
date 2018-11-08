/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calcolo;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Sgarbossa Francesco
 */
@WebService
public class Calcolo {

    @WebMethod
    public int add(int a, int b){
        return a + b;
    }
    @WebMethod
    public int substract(int a, int b){
        return a - b;
    }
    @WebMethod
    public int multiply(int a, int b){
        return a*b;
    }
    @WebMethod
    public int div(int a, int b){
        return a/b;
    }
}

