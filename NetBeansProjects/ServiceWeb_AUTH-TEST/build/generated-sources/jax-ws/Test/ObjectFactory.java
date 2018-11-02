
package Test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Test package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AuthTest_QNAME = new QName("http://authentication.net/", "AuthTest");
    private final static QName _AuthTestResponse_QNAME = new QName("http://authentication.net/", "AuthTestResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthTest }
     * 
     */
    public AuthTest createAuthTest() {
        return new AuthTest();
    }

    /**
     * Create an instance of {@link AuthTestResponse }
     * 
     */
    public AuthTestResponse createAuthTestResponse() {
        return new AuthTestResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication.net/", name = "AuthTest")
    public JAXBElement<AuthTest> createAuthTest(AuthTest value) {
        return new JAXBElement<AuthTest>(_AuthTest_QNAME, AuthTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthTestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication.net/", name = "AuthTestResponse")
    public JAXBElement<AuthTestResponse> createAuthTestResponse(AuthTestResponse value) {
        return new JAXBElement<AuthTestResponse>(_AuthTestResponse_QNAME, AuthTestResponse.class, null, value);
    }

}
