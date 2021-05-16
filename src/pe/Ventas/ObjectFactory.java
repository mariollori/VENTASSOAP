
package pe.Ventas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.ventas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DetalleventaResponse_QNAME = new QName("http://Ventas.pe/", "detalleventaResponse");
    private final static QName _Detalleventa_QNAME = new QName("http://Ventas.pe/", "detalleventa");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.ventas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Detalleventa }
     * 
     */
    public Detalleventa createDetalleventa() {
        return new Detalleventa();
    }

    /**
     * Create an instance of {@link DetalleventaResponse }
     * 
     */
    public DetalleventaResponse createDetalleventaResponse() {
        return new DetalleventaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleventaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ventas.pe/", name = "detalleventaResponse")
    public JAXBElement<DetalleventaResponse> createDetalleventaResponse(DetalleventaResponse value) {
        return new JAXBElement<DetalleventaResponse>(_DetalleventaResponse_QNAME, DetalleventaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Detalleventa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Ventas.pe/", name = "detalleventa")
    public JAXBElement<Detalleventa> createDetalleventa(Detalleventa value) {
        return new JAXBElement<Detalleventa>(_Detalleventa_QNAME, Detalleventa.class, null, value);
    }

}
