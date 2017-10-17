package ocpp.cp._2012._06;

/**
 * @author    Jens Schmutzler <jens.schmutzler@tu-dortmund.de>
 * @author    Thomas Grabowski <thomas.grabowski@tu-dortmund.de>
 * @author    Mohamad Sbeiti <mohamad.sbeiti@telekom.de>
 * 
 *	This program is free software; you can redistribute it
 *	and/or modify it under the terms of the GNU General Public
 *	License as published by the Free Software Foundation; either
 *	version 2 of the License, or (at your option) any later version.
 *  For further information see file COPYING in the top level directory
 *  
 ********************************************************************************
 * This work is a joint work between Communication Networks Institute 
 * (CNI - Prof. Dr.-Ing. Christian Wietfeld) at Technische Universitaet Dortmund, Germany 
 * and the Deutsche Telekom 
 *  ********************************************************************************/
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for UpdateStatus.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="UpdateStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Accepted"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="HashError"/>
 *     &lt;enumeration value="NotSupported"/>
 *     &lt;enumeration value="VersionMismatch"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UpdateStatus")
@XmlEnum
public enum UpdateStatus {

	@XmlEnumValue("Accepted")
	ACCEPTED("Accepted"), @XmlEnumValue("Failed")
	FAILED("Failed"), @XmlEnumValue("HashError")
	HASH_ERROR("HashError"), @XmlEnumValue("NotSupported")
	NOT_SUPPORTED("NotSupported"), @XmlEnumValue("VersionMismatch")
	VERSION_MISMATCH("VersionMismatch");
	private final String value;

	UpdateStatus(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static UpdateStatus fromValue(String v) {
		for (UpdateStatus c : UpdateStatus.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}