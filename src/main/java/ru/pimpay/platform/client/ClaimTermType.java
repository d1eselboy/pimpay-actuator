
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimTermType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClaimTermType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="reg"/&gt;
 *     &lt;enumeration value="fed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClaimTermType")
@XmlEnum
public enum ClaimTermType {

    @XmlEnumValue("reg")
    REG("reg"),
    @XmlEnumValue("fed")
    FED("fed");
    private final String value;

    ClaimTermType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClaimTermType fromValue(String v) {
        for (ClaimTermType c: ClaimTermType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
