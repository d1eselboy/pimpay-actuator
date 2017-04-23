
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for moneyRecipientType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="moneyRecipientType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="delivery_service"/&gt;
 *     &lt;enumeration value="client"/&gt;
 *     &lt;enumeration value="pimpay"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "moneyRecipientType")
@XmlEnum
public enum MoneyRecipientType {

    @XmlEnumValue("delivery_service")
    DELIVERY_SERVICE("delivery_service"),
    @XmlEnumValue("client")
    CLIENT("client"),
    @XmlEnumValue("pimpay")
    PIMPAY("pimpay");
    private final String value;

    MoneyRecipientType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MoneyRecipientType fromValue(String v) {
        for (MoneyRecipientType c: MoneyRecipientType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
