/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceweb_auth.test;

import Test.WsAuth;
import Test.WsAuthImplService;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;


public class ServiceWeb_AUTHTEST {
    public static void main(String[] args) {
        WsAuthImplService wais = new WsAuthImplService();
        WsAuth soap = wais.getWsAuthImplPort();
        System.out.println(soap.authTest());
        Map<String, Object>reqMap = ((BindingProvider)soap).getRequestContext();
        reqMap.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/ServiceWeb/WsAuthImplService?WSDL");
        Map<String, List<String>> header = new HashMap<>();
        header.put("UserName", Collections.singletonList("francesco"));
        header.put("Password", Collections.singletonList("1234"));
        reqMap.put(MessageContext.HTTP_REQUEST_HEADERS, header);
        System.out.println(soap.authTest());
            
    }
    
}
