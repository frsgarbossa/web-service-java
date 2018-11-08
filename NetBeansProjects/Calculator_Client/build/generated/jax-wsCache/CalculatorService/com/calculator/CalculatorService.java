
package com.calculator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorService", targetNamespace = "http://calculator.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://calculator.com/", className = "com.calculator.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://calculator.com/", className = "com.calculator.HelloResponse")
    @Action(input = "http://calculator.com/CalculatorService/helloRequest", output = "http://calculator.com/CalculatorService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
