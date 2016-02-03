package ocpp.cs._2012._06;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * The Central System Service for the Open Charge Point Protocol
 *
 * This class was generated by Apache CXF 3.1.1
 * 2016-02-03T17:21:13.721+01:00
 * Generated source version: 3.1.1
 * 
 */
@WebServiceClient(name = "CentralSystemService", 
                  wsdlLocation = "file:/home/msbeiti/T-PotI4.0/src/centralSystem/src/main/resources/wsdl/ocpp_centralsystemservice_1.5_final.wsdl",
                  targetNamespace = "urn://Ocpp/Cs/2012/06/") 
public class CentralSystemService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn://Ocpp/Cs/2012/06/", "CentralSystemService");
    public final static QName CentralSystemServiceSoap12 = new QName("urn://Ocpp/Cs/2012/06/", "CentralSystemServiceSoap12");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/msbeiti/T-PotI4.0/src/centralSystem/src/main/resources/wsdl/ocpp_centralsystemservice_1.5_final.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CentralSystemService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/msbeiti/T-PotI4.0/src/centralSystem/src/main/resources/wsdl/ocpp_centralsystemservice_1.5_final.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CentralSystemService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CentralSystemService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CentralSystemService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CentralSystemService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CentralSystemService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CentralSystemService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns CentralSystemService
     */
    @WebEndpoint(name = "CentralSystemServiceSoap12")
    public CentralSystemService getCentralSystemServiceSoap12() {
        return super.getPort(CentralSystemServiceSoap12, CentralSystemService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CentralSystemService
     */
    @WebEndpoint(name = "CentralSystemServiceSoap12")
    public CentralSystemService getCentralSystemServiceSoap12(WebServiceFeature... features) {
        return super.getPort(CentralSystemServiceSoap12, CentralSystemService.class, features);
    }

}
