
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for verificationStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="verificationStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="pending"/&gt;
 *     &lt;enumeration value="matched"/&gt;
 *     &lt;enumeration value="discarded"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "verificationStatusType")
@XmlEnum
public enum VerificationStatusType {

    @XmlEnumValue("pending")
    PENDING("pending"),
    @XmlEnumValue("matched")
    MATCHED("matched"),
    @XmlEnumValue("discarded")
    DISCARDED("discarded");
    private final String value;

    VerificationStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VerificationStatusType fromValue(String v) {
        for (VerificationStatusType c: VerificationStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
