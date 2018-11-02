/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.authentication;
import net.service.ServiceWeb;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;


@WebService(endpointInterface = "net.authentication.WsAuth")
public class WsAuthImpl implements WsAuth{
    @Resource
    private WebServiceContext wsc;
    
    
    @Override
    public String AuthTest() {
        MessageContext mc = wsc.getMessageContext();
        Map requestHeader = (Map) mc.get(MessageContext.HTTP_REQUEST_HEADERS);
        List userList = (List) requestHeader.get("username");
        List passList = (List) requestHeader.get("password");
        String username = "";
        String password = "";
        if(passList!= null && userList!= null){
            username = (String) userList.get(0);
            password = (String) passList.get(0); 
        }
        if("francesco".equals(username) && "1234".equals(password)){
            return "Hello, you are valid user ...";
        }else{
            return "Unknown user";
        }
    }
    
    
    
}
