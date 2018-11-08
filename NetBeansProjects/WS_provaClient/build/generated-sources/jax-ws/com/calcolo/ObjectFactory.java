
package com.calcolo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.calcolo package. 
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

    private final static QName _AuthTestResponse_QNAME = new QName("http://calcolo.com/", "AuthTestResponse");
    private final static QName _Hello_QNAME = new QName("http://calcolo.com/", "hello");
    private final static QName _Somma_QNAME = new QName("http://calcolo.com/", "somma");
    private final static QName _RestartResponse_QNAME = new QName("http://calcolo.com/", "restartResponse");
    private final static QName _SommaResponse_QNAME = new QName("http://calcolo.com/", "sommaResponse");
    private final static QName _AuthTest_QNAME = new QName("http://calcolo.com/", "AuthTest");
    private final static QName _Restart_QNAME = new QName("http://calcolo.com/", "restart");
    private final static QName _HelloResponse_QNAME = new QName("http://calcolo.com/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.calcolo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RestartResponse }
     * 
     */
    public RestartResponse createRestartResponse() {
        return new RestartResponse();
    }

    /**
     * Create an instance of {@link SommaResponse }
     * 
     */
    public SommaResponse createSommaResponse() {
        return new SommaResponse();
    }

    /**
     * Create an instance of {@link AuthTest }
     * 
     */
    public AuthTest createAuthTest() {
        return new AuthTest();
    }

    /**
     * Create an instance of {@link Restart }
     * 
     */
    public Restart createRestart() {
        return new Restart();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link AuthTestResponse }
     * 
     */
    public AuthTestResponse createAuthTestResponse() {
        return new AuthTestResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Somma }
     * 
     */
    public Somma createSomma() {
        return new Somma();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthTestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calcolo.com/", name = "AuthTestResponse")
    public JAXBElement<AuthTestResponse> createAuthTestResponse(AuthTestResponse value) {
        return new JAXBElement<AuthTestResponse>(_AuthTestResponse_QNAME, AuthTestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calcolo.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Somma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calcolo.com/", name = "somma")
    public JAXBElement<Somma> createSomma(Somma value) {
        return new JAXBElement<Somma>(_Somma_QNAME, Somma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calcolo.com/", name = "restartResponse")
    public JAXBElement<RestartResponse> createRestartResponse(RestartResponse value) {
        return new JAXBElement<RestartResponse>(_RestartResponse_QNAME, RestartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SommaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calcolo.com/", name = "sommaResponse")
    public JAXBElement<SommaResponse> createSommaResponse(SommaResponse value) {
        return new JAXBElement<SommaResponse>(_SommaResponse_QNAME, SommaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calcolo.com/", name = "AuthTest")
    public JAXBElement<AuthTest> createAuthTest(AuthTest value) {
        return new JAXBElement<AuthTest>(_AuthTest_QNAME, AuthTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Restart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calcolo.com/", name = "restart")
    public JAXBElement<Restart> createRestart(Restart value) {
        return new JAXBElement<Restart>(_Restart_QNAME, Restart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calcolo.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
