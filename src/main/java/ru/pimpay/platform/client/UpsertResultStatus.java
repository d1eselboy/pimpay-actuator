
package ru.pimpay.platform.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpsertResultStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpsertResultStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ok"/&gt;
 *     &lt;enumeration value="error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UpsertResultStatus")
@XmlEnum
public enum UpsertResultStatus {

    @XmlEnumValue("ok")
    OK("ok"),
    @XmlEnumValue("error")
    ERROR("error");
    private final String value;

    UpsertResultStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpsertResultStatus fromValue(String v) {
        for (UpsertResultStatus c: UpsertResultStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
