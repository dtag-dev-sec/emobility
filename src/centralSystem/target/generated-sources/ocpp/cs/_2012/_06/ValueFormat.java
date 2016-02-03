
package ocpp.cs._2012._06;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ValueFormat.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ValueFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Raw"/&gt;
 *     &lt;enumeration value="SignedData"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ValueFormat")
@XmlEnum
public enum ValueFormat {

    @XmlEnumValue("Raw")
    RAW("Raw"),
    @XmlEnumValue("SignedData")
    SIGNED_DATA("SignedData");
    private final String value;

    ValueFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValueFormat fromValue(String v) {
        for (ValueFormat c: ValueFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
