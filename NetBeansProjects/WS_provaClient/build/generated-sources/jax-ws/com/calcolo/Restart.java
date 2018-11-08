
package com.calcolo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per restart complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="restart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="a" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="b" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "restart", propOrder = {
    "a",
    "b"
})
public class Restart {

    protected double a;
    protected double b;

    /**
     * Recupera il valore della proprietà a.
     * 
     */
    public double getA() {
        return a;
    }

    /**
     * Imposta il valore della proprietà a.
     * 
     */
    public void setA(double value) {
        this.a = value;
    }

    /**
     * Recupera il valore della proprietà b.
     * 
     */
    public double getB() {
        return b;
    }

    /**
     * Imposta il valore della proprietà b.
     * 
     */
    public void setB(double value) {
        this.b = value;
    }

}
