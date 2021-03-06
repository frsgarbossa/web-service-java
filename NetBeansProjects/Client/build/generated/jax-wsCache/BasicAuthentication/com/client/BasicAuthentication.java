
package com.client;

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
@WebService(name = "BasicAuthentication", targetNamespace = "http://basic.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BasicAuthentication {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "square", targetNamespace = "http://basic.com/", className = "com.client.Square")
    @ResponseWrapper(localName = "squareResponse", targetNamespace = "http://basic.com/", className = "com.client.SquareResponse")
    @Action(input = "http://basic.com/BasicAuthentication/squareRequest", output = "http://basic.com/BasicAuthentication/squareResponse")
    public double square(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://basic.com/", className = "com.client.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://basic.com/", className = "com.client.HelloResponse")
    @Action(input = "http://basic.com/BasicAuthentication/helloRequest", output = "http://basic.com/BasicAuthentication/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
