/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import com.client.BasicAuthentication;
import com.client.BasicAuthentication_Service;

/**
 *
 * @author Sgarbossa Francesco
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BasicAuthentication_Service service = new BasicAuthentication_Service();
        final BasicAuthentication porty = service.getBasicAuthenticationPort();
        System.out.println(porty.square(67));
    }
    
}
