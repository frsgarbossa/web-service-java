
package com.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.client package. 
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

    private final static QName _Square_QNAME = new QName("http://basic.com/", "square");
    private final static QName _HelloResponse_QNAME = new QName("http://basic.com/", "helloResponse");
    private final static QName _Hello_QNAME = new QName("http://basic.com/", "hello");
    private final static QName _SquareResponse_QNAME = new QName("http://basic.com/", "squareResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Square }
     * 
     */
    public Square createSquare() {
        return new Square();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link SquareResponse }
     * 
     */
    public SquareResponse createSquareResponse() {
        return new SquareResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Square }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://basic.com/", name = "square")
    public JAXBElement<Square> createSquare(Square value) {
        return new JAXBElement<Square>(_Square_QNAME, Square.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://basic.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://basic.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SquareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://basic.com/", name = "squareResponse")
    public JAXBElement<SquareResponse> createSquareResponse(SquareResponse value) {
        return new JAXBElement<SquareResponse>(_SquareResponse_QNAME, SquareResponse.class, null, value);
    }

}
