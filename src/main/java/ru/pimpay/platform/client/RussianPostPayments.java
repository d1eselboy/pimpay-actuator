
package ru.pimpay.platform.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RussianPostPayments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RussianPostPayments"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RussianPostPayment" type="{urn:PlatformApiWsdl}RussianPostPayment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RussianPostPayments", propOrder = {
    "russianPostPayment"
})
public class RussianPostPayments {

    @XmlElement(name = "RussianPostPayment")
    protected List<RussianPostPayment> russianPostPayment;

    /**
     * Gets the value of the russianPostPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the russianPostPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRussianPostPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RussianPostPayment }
     * 
     * 
     */
    public List<RussianPostPayment> getRussianPostPayment() {
        if (russianPostPayment == null) {
            russianPostPayment = new ArrayList<RussianPostPayment>();
        }
        return this.russianPostPayment;
    }

}
