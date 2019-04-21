package co.com.datacredito.services.v1.serviciolocalizacion;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2019-04-21T12:53:15.012-05:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "ServicioLocalizacion", 
                  wsdlLocation = "file:/E:/proyectos/holding/LocationXperian/src/main/resources/META-INF/ServicioLocalizacion_1.wsdl",
                  targetNamespace = "http://www.datacredito.com.co/services/v1/ServicioLocalizacion") 
public class ServicioLocalizacion_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.datacredito.com.co/services/v1/ServicioLocalizacion", "ServicioLocalizacion");
    public final static QName ServicioLocalizacionPortWanHttps = new QName("http://www.datacredito.com.co/services/v1/ServicioLocalizacion", "ServicioLocalizacionPort.wan.https");
    public final static QName ServicioLocalizacionPortDmzHttps = new QName("http://www.datacredito.com.co/services/v1/ServicioLocalizacion", "ServicioLocalizacionPort.dmz.https");
    static {
        URL url = null;
        try {
            url = new URL("file:/E:/proyectos/holding/LocationXperian/src/main/resources/META-INF/ServicioLocalizacion_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServicioLocalizacion_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/E:/proyectos/holding/LocationXperian/src/main/resources/META-INF/ServicioLocalizacion_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ServicioLocalizacion_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServicioLocalizacion_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioLocalizacion_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServicioLocalizacion_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServicioLocalizacion_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ServicioLocalizacion_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ServicioLocalizacion
     */
    @WebEndpoint(name = "ServicioLocalizacionPort.wan.https")
    public ServicioLocalizacion getServicioLocalizacionPortWanHttps() {
        return super.getPort(ServicioLocalizacionPortWanHttps, ServicioLocalizacion.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioLocalizacion
     */
    @WebEndpoint(name = "ServicioLocalizacionPort.wan.https")
    public ServicioLocalizacion getServicioLocalizacionPortWanHttps(WebServiceFeature... features) {
        return super.getPort(ServicioLocalizacionPortWanHttps, ServicioLocalizacion.class, features);
    }
    /**
     *
     * @return
     *     returns ServicioLocalizacion
     */
    @WebEndpoint(name = "ServicioLocalizacionPort.dmz.https")
    public ServicioLocalizacion getServicioLocalizacionPortDmzHttps() {
        return super.getPort(ServicioLocalizacionPortDmzHttps, ServicioLocalizacion.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioLocalizacion
     */
    @WebEndpoint(name = "ServicioLocalizacionPort.dmz.https")
    public ServicioLocalizacion getServicioLocalizacionPortDmzHttps(WebServiceFeature... features) {
        return super.getPort(ServicioLocalizacionPortDmzHttps, ServicioLocalizacion.class, features);
    }

}
