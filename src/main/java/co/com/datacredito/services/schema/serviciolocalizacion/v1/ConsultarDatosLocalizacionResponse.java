
package co.com.datacredito.services.schema.serviciolocalizacion.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsultarDatosLocalizacionReturn">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Localizacion">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FechaConsulta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TipoIdDigitado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NaturalNacional" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="PrimerApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="SegundoApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NombreCompleto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Validada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Rut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Genero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CodigoCIIU" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ActividadEconomica" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Identificacion">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="FechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Edad">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Min" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Max" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Ubicacion">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Antiguedad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Direccion" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CodigoDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Contrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Estrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Actualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Creacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="UltimaConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NombreCiudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NombreDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NumReportes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="TipoResidencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="TipoLaboralOComercial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="TipoCorrespondencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Zona" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NumeroEntidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Entidad" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Telefono" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CodigoArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Contrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Actualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Creacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="UltimaConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="IndicativoPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NombreCiudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NombreDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NumReportes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NumeroEntidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="TipoResidencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="TipoLaboralOComercial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Entidad" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Celular" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Celular" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Contrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Actualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Creacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="UltimaConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NumReportes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NumeroEntidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Entidad" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Email" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Contrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Actualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Creacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="UltimaConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NumReportes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="NumeroEntidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Entidad" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="IndicadorMovilidad" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="FechaInicial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="FechaFinal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="VectorDirecciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consultarDatosLocalizacionReturn"
})
@XmlRootElement(name = "ConsultarDatosLocalizacionResponse")
public class ConsultarDatosLocalizacionResponse {

    @XmlElement(name = "ConsultarDatosLocalizacionReturn", required = true)
    protected ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn consultarDatosLocalizacionReturn;

    /**
     * Gets the value of the consultarDatosLocalizacionReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn }
     *     
     */
    public ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn getConsultarDatosLocalizacionReturn() {
        return consultarDatosLocalizacionReturn;
    }

    /**
     * Sets the value of the consultarDatosLocalizacionReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn }
     *     
     */
    public void setConsultarDatosLocalizacionReturn(ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn value) {
        this.consultarDatosLocalizacionReturn = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Localizacion">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FechaConsulta" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TipoIdDigitado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NaturalNacional" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="PrimerApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="SegundoApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NombreCompleto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Validada" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Rut" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Genero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CodigoCIIU" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ActividadEconomica" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Identificacion">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="FechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Edad">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Min" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Max" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Ubicacion">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Antiguedad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Direccion" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CodigoDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Contrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Estrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Actualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Creacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="UltimaConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NombreCiudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NombreDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NumReportes" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="TipoResidencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="TipoLaboralOComercial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="TipoCorrespondencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Zona" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NumeroEntidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Entidad" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Telefono" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CodigoArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Contrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Actualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Creacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="UltimaConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="IndicativoPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NombreCiudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NombreDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NumReportes" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NumeroEntidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="TipoResidencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="TipoLaboralOComercial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Entidad" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Celular" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Celular" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Contrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Actualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Creacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="UltimaConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NumReportes" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NumeroEntidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Entidad" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Email" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Contrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Actualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Creacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="UltimaConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NumReportes" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="NumeroEntidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Entidad" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="IndicadorMovilidad" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="FechaInicial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="FechaFinal" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="VectorDirecciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "localizacion"
    })
    public static class ConsultarDatosLocalizacionReturn {

        @XmlElement(name = "Localizacion", required = true)
        protected ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion localizacion;

        /**
         * Gets the value of the localizacion property.
         * 
         * @return
         *     possible object is
         *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion }
         *     
         */
        public ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion getLocalizacion() {
            return localizacion;
        }

        /**
         * Sets the value of the localizacion property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion }
         *     
         */
        public void setLocalizacion(ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion value) {
            this.localizacion = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="FechaConsulta" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TipoIdDigitado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NaturalNacional" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="PrimerApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="SegundoApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NombreCompleto" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Validada" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Rut" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Genero" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CodigoCIIU" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ActividadEconomica" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Identificacion">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="FechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Edad">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Min" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Max" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Ubicacion">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Antiguedad" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Direccion" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CodigoDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Contrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Estrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Actualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Creacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="UltimaConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NombreCiudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NombreDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NumReportes" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="TipoResidencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="TipoLaboralOComercial" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="TipoCorrespondencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Zona" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NumeroEntidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Entidad" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Telefono" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CodigoArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Contrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Actualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Creacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="UltimaConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="IndicativoPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NombreCiudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NombreDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NumReportes" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NumeroEntidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="TipoResidencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="TipoLaboralOComercial" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Entidad" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Celular" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Celular" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Contrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Actualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Creacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="UltimaConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NumReportes" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NumeroEntidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Entidad" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Email" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Contrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Actualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Creacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="UltimaConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NumReportes" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="NumeroEntidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Entidad" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="IndicadorMovilidad" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="FechaInicial" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="FechaFinal" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="VectorDirecciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "fechaConsulta",
            "respuesta",
            "tipoIdDigitado",
            "identificacion",
            "naturalNacional",
            "direccion",
            "telefono",
            "celular",
            "email",
            "indicadorMovilidad"
        })
        public static class Localizacion {

            @XmlElement(name = "FechaConsulta", required = true)
            protected String fechaConsulta;
            @XmlElement(name = "Respuesta", required = true)
            protected String respuesta;
            @XmlElement(name = "TipoIdDigitado", required = true)
            protected String tipoIdDigitado;
            @XmlElement(name = "Identificacion")
            protected String identificacion;
            @XmlElement(name = "NaturalNacional")
            protected ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional naturalNacional;
            @XmlElement(name = "Direccion")
            protected List<ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Direccion> direccion;
            @XmlElement(name = "Telefono")
            protected List<ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Telefono> telefono;
            @XmlElement(name = "Celular")
            protected List<ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Celular> celular;
            @XmlElement(name = "Email")
            protected List<ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Email> email;
            @XmlElement(name = "IndicadorMovilidad")
            protected List<ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.IndicadorMovilidad> indicadorMovilidad;

            /**
             * Gets the value of the fechaConsulta property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaConsulta() {
                return fechaConsulta;
            }

            /**
             * Sets the value of the fechaConsulta property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaConsulta(String value) {
                this.fechaConsulta = value;
            }

            /**
             * Gets the value of the respuesta property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRespuesta() {
                return respuesta;
            }

            /**
             * Sets the value of the respuesta property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRespuesta(String value) {
                this.respuesta = value;
            }

            /**
             * Gets the value of the tipoIdDigitado property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoIdDigitado() {
                return tipoIdDigitado;
            }

            /**
             * Sets the value of the tipoIdDigitado property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoIdDigitado(String value) {
                this.tipoIdDigitado = value;
            }

            /**
             * Gets the value of the identificacion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdentificacion() {
                return identificacion;
            }

            /**
             * Sets the value of the identificacion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdentificacion(String value) {
                this.identificacion = value;
            }

            /**
             * Gets the value of the naturalNacional property.
             * 
             * @return
             *     possible object is
             *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional }
             *     
             */
            public ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional getNaturalNacional() {
                return naturalNacional;
            }

            /**
             * Sets the value of the naturalNacional property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional }
             *     
             */
            public void setNaturalNacional(ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional value) {
                this.naturalNacional = value;
            }

            /**
             * Gets the value of the direccion property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the direccion property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDireccion().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Direccion }
             * 
             * 
             */
            public List<ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Direccion> getDireccion() {
                if (direccion == null) {
                    direccion = new ArrayList<ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Direccion>();
                }
                return this.direccion;
            }

            /**
             * Gets the value of the telefono property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the telefono property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTelefono().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Telefono }
             * 
             * 
             */
            public List<ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Telefono> getTelefono() {
                if (telefono == null) {
                    telefono = new ArrayList<ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Telefono>();
                }
                return this.telefono;
            }

            /**
             * Gets the value of the celular property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the celular property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCelular().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Celular }
             * 
             * 
             */
            public List<ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Celular> getCelular() {
                if (celular == null) {
                    celular = new ArrayList<ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Celular>();
                }
                return this.celular;
            }

            /**
             * Gets the value of the email property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the email property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEmail().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Email }
             * 
             * 
             */
            public List<ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Email> getEmail() {
                if (email == null) {
                    email = new ArrayList<ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Email>();
                }
                return this.email;
            }

            /**
             * Gets the value of the indicadorMovilidad property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the indicadorMovilidad property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIndicadorMovilidad().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.IndicadorMovilidad }
             * 
             * 
             */
            public List<ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.IndicadorMovilidad> getIndicadorMovilidad() {
                if (indicadorMovilidad == null) {
                    indicadorMovilidad = new ArrayList<ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.IndicadorMovilidad>();
                }
                return this.indicadorMovilidad;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Celular" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Contrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Actualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Creacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="UltimaConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NumReportes" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NumeroEntidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Entidad" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "celular",
                "contrato",
                "actualizacion",
                "creacion",
                "ultimaConfirmacion",
                "numReportes",
                "numeroEntidades",
                "entidad",
                "llave"
            })
            public static class Celular {

                @XmlElement(name = "Celular", required = true, nillable = true)
                protected String celular;
                @XmlElement(name = "Contrato", required = true, nillable = true)
                protected String contrato;
                @XmlElement(name = "Actualizacion", required = true, nillable = true)
                protected String actualizacion;
                @XmlElement(name = "Creacion", required = true, nillable = true)
                protected String creacion;
                @XmlElement(name = "UltimaConfirmacion", required = true, nillable = true)
                protected String ultimaConfirmacion;
                @XmlElement(name = "NumReportes", required = true, nillable = true)
                protected String numReportes;
                @XmlElement(name = "NumeroEntidades", required = true, nillable = true)
                protected String numeroEntidades;
                @XmlElement(name = "Entidad")
                protected ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Celular.Entidad entidad;
                @XmlElement(name = "Llave")
                protected String llave;

                /**
                 * Gets the value of the celular property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCelular() {
                    return celular;
                }

                /**
                 * Sets the value of the celular property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCelular(String value) {
                    this.celular = value;
                }

                /**
                 * Gets the value of the contrato property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContrato() {
                    return contrato;
                }

                /**
                 * Sets the value of the contrato property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContrato(String value) {
                    this.contrato = value;
                }

                /**
                 * Gets the value of the actualizacion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getActualizacion() {
                    return actualizacion;
                }

                /**
                 * Sets the value of the actualizacion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setActualizacion(String value) {
                    this.actualizacion = value;
                }

                /**
                 * Gets the value of the creacion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCreacion() {
                    return creacion;
                }

                /**
                 * Sets the value of the creacion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCreacion(String value) {
                    this.creacion = value;
                }

                /**
                 * Gets the value of the ultimaConfirmacion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUltimaConfirmacion() {
                    return ultimaConfirmacion;
                }

                /**
                 * Sets the value of the ultimaConfirmacion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUltimaConfirmacion(String value) {
                    this.ultimaConfirmacion = value;
                }

                /**
                 * Gets the value of the numReportes property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumReportes() {
                    return numReportes;
                }

                /**
                 * Sets the value of the numReportes property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumReportes(String value) {
                    this.numReportes = value;
                }

                /**
                 * Gets the value of the numeroEntidades property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumeroEntidades() {
                    return numeroEntidades;
                }

                /**
                 * Sets the value of the numeroEntidades property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumeroEntidades(String value) {
                    this.numeroEntidades = value;
                }

                /**
                 * Gets the value of the entidad property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Celular.Entidad }
                 *     
                 */
                public ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Celular.Entidad getEntidad() {
                    return entidad;
                }

                /**
                 * Sets the value of the entidad property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Celular.Entidad }
                 *     
                 */
                public void setEntidad(ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Celular.Entidad value) {
                    this.entidad = value;
                }

                /**
                 * Gets the value of the llave property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLlave() {
                    return llave;
                }

                /**
                 * Sets the value of the llave property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLlave(String value) {
                    this.llave = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "nit",
                    "codigoSuscriptor",
                    "nombreNit",
                    "nombreSuscriptor",
                    "numero"
                })
                public static class Entidad {

                    @XmlElement(name = "Nit")
                    protected String nit;
                    protected String codigoSuscriptor;
                    protected String nombreNit;
                    protected String nombreSuscriptor;
                    @XmlElement(name = "Numero", required = true)
                    protected String numero;

                    /**
                     * Gets the value of the nit property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNit() {
                        return nit;
                    }

                    /**
                     * Sets the value of the nit property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNit(String value) {
                        this.nit = value;
                    }

                    /**
                     * Gets the value of the codigoSuscriptor property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodigoSuscriptor() {
                        return codigoSuscriptor;
                    }

                    /**
                     * Sets the value of the codigoSuscriptor property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodigoSuscriptor(String value) {
                        this.codigoSuscriptor = value;
                    }

                    /**
                     * Gets the value of the nombreNit property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNombreNit() {
                        return nombreNit;
                    }

                    /**
                     * Sets the value of the nombreNit property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNombreNit(String value) {
                        this.nombreNit = value;
                    }

                    /**
                     * Gets the value of the nombreSuscriptor property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNombreSuscriptor() {
                        return nombreSuscriptor;
                    }

                    /**
                     * Sets the value of the nombreSuscriptor property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNombreSuscriptor(String value) {
                        this.nombreSuscriptor = value;
                    }

                    /**
                     * Gets the value of the numero property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumero() {
                        return numero;
                    }

                    /**
                     * Sets the value of the numero property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumero(String value) {
                        this.numero = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="CodigoDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CodigoPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Contrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Estrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Actualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Creacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="UltimaConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NombreCiudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NombreDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NumReportes" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="TipoResidencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="TipoLaboralOComercial" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="TipoCorrespondencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Zona" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NumeroEntidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Entidad" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "codigoDepartamento",
                "codigoPais",
                "contrato",
                "direccion",
                "estrato",
                "actualizacion",
                "creacion",
                "ultimaConfirmacion",
                "nombreCiudad",
                "nombreDepartamento",
                "numReportes",
                "tipo",
                "tipoResidencia",
                "tipoLaboralOComercial",
                "tipoCorrespondencia",
                "zona",
                "numeroEntidades",
                "entidad",
                "llave"
            })
            public static class Direccion {

                @XmlElement(name = "CodigoDepartamento", required = true, nillable = true)
                protected String codigoDepartamento;
                @XmlElement(name = "CodigoPais", required = true, nillable = true)
                protected String codigoPais;
                @XmlElement(name = "Contrato", required = true, nillable = true)
                protected String contrato;
                @XmlElement(name = "Direccion", required = true, nillable = true)
                protected String direccion;
                @XmlElement(name = "Estrato", required = true, nillable = true)
                protected String estrato;
                @XmlElement(name = "Actualizacion", required = true, nillable = true)
                protected String actualizacion;
                @XmlElement(name = "Creacion", required = true, nillable = true)
                protected String creacion;
                @XmlElement(name = "UltimaConfirmacion", required = true, nillable = true)
                protected String ultimaConfirmacion;
                @XmlElement(name = "NombreCiudad", required = true, nillable = true)
                protected String nombreCiudad;
                @XmlElement(name = "NombreDepartamento", required = true, nillable = true)
                protected String nombreDepartamento;
                @XmlElement(name = "NumReportes", required = true, nillable = true)
                protected String numReportes;
                @XmlElement(name = "Tipo", required = true, nillable = true)
                protected String tipo;
                @XmlElement(name = "TipoResidencia", required = true, nillable = true)
                protected String tipoResidencia;
                @XmlElement(name = "TipoLaboralOComercial", required = true, nillable = true)
                protected String tipoLaboralOComercial;
                @XmlElement(name = "TipoCorrespondencia", required = true, nillable = true)
                protected String tipoCorrespondencia;
                @XmlElement(name = "Zona", required = true, nillable = true)
                protected String zona;
                @XmlElement(name = "NumeroEntidades", required = true, nillable = true)
                protected String numeroEntidades;
                @XmlElement(name = "Entidad")
                protected ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Direccion.Entidad entidad;
                @XmlElement(name = "Llave")
                protected String llave;

                /**
                 * Gets the value of the codigoDepartamento property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodigoDepartamento() {
                    return codigoDepartamento;
                }

                /**
                 * Sets the value of the codigoDepartamento property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodigoDepartamento(String value) {
                    this.codigoDepartamento = value;
                }

                /**
                 * Gets the value of the codigoPais property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodigoPais() {
                    return codigoPais;
                }

                /**
                 * Sets the value of the codigoPais property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodigoPais(String value) {
                    this.codigoPais = value;
                }

                /**
                 * Gets the value of the contrato property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContrato() {
                    return contrato;
                }

                /**
                 * Sets the value of the contrato property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContrato(String value) {
                    this.contrato = value;
                }

                /**
                 * Gets the value of the direccion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDireccion() {
                    return direccion;
                }

                /**
                 * Sets the value of the direccion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDireccion(String value) {
                    this.direccion = value;
                }

                /**
                 * Gets the value of the estrato property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEstrato() {
                    return estrato;
                }

                /**
                 * Sets the value of the estrato property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEstrato(String value) {
                    this.estrato = value;
                }

                /**
                 * Gets the value of the actualizacion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getActualizacion() {
                    return actualizacion;
                }

                /**
                 * Sets the value of the actualizacion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setActualizacion(String value) {
                    this.actualizacion = value;
                }

                /**
                 * Gets the value of the creacion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCreacion() {
                    return creacion;
                }

                /**
                 * Sets the value of the creacion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCreacion(String value) {
                    this.creacion = value;
                }

                /**
                 * Gets the value of the ultimaConfirmacion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUltimaConfirmacion() {
                    return ultimaConfirmacion;
                }

                /**
                 * Sets the value of the ultimaConfirmacion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUltimaConfirmacion(String value) {
                    this.ultimaConfirmacion = value;
                }

                /**
                 * Gets the value of the nombreCiudad property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNombreCiudad() {
                    return nombreCiudad;
                }

                /**
                 * Sets the value of the nombreCiudad property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNombreCiudad(String value) {
                    this.nombreCiudad = value;
                }

                /**
                 * Gets the value of the nombreDepartamento property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNombreDepartamento() {
                    return nombreDepartamento;
                }

                /**
                 * Sets the value of the nombreDepartamento property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNombreDepartamento(String value) {
                    this.nombreDepartamento = value;
                }

                /**
                 * Gets the value of the numReportes property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumReportes() {
                    return numReportes;
                }

                /**
                 * Sets the value of the numReportes property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumReportes(String value) {
                    this.numReportes = value;
                }

                /**
                 * Gets the value of the tipo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipo() {
                    return tipo;
                }

                /**
                 * Sets the value of the tipo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipo(String value) {
                    this.tipo = value;
                }

                /**
                 * Gets the value of the tipoResidencia property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipoResidencia() {
                    return tipoResidencia;
                }

                /**
                 * Sets the value of the tipoResidencia property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipoResidencia(String value) {
                    this.tipoResidencia = value;
                }

                /**
                 * Gets the value of the tipoLaboralOComercial property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipoLaboralOComercial() {
                    return tipoLaboralOComercial;
                }

                /**
                 * Sets the value of the tipoLaboralOComercial property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipoLaboralOComercial(String value) {
                    this.tipoLaboralOComercial = value;
                }

                /**
                 * Gets the value of the tipoCorrespondencia property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipoCorrespondencia() {
                    return tipoCorrespondencia;
                }

                /**
                 * Sets the value of the tipoCorrespondencia property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipoCorrespondencia(String value) {
                    this.tipoCorrespondencia = value;
                }

                /**
                 * Gets the value of the zona property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getZona() {
                    return zona;
                }

                /**
                 * Sets the value of the zona property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setZona(String value) {
                    this.zona = value;
                }

                /**
                 * Gets the value of the numeroEntidades property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumeroEntidades() {
                    return numeroEntidades;
                }

                /**
                 * Sets the value of the numeroEntidades property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumeroEntidades(String value) {
                    this.numeroEntidades = value;
                }

                /**
                 * Gets the value of the entidad property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Direccion.Entidad }
                 *     
                 */
                public ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Direccion.Entidad getEntidad() {
                    return entidad;
                }

                /**
                 * Sets the value of the entidad property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Direccion.Entidad }
                 *     
                 */
                public void setEntidad(ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Direccion.Entidad value) {
                    this.entidad = value;
                }

                /**
                 * Gets the value of the llave property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLlave() {
                    return llave;
                }

                /**
                 * Sets the value of the llave property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLlave(String value) {
                    this.llave = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "nit",
                    "codigoSuscriptor",
                    "nombreNit",
                    "nombreSuscriptor",
                    "numero"
                })
                public static class Entidad {

                    @XmlElement(name = "Nit")
                    protected String nit;
                    protected String codigoSuscriptor;
                    protected String nombreNit;
                    protected String nombreSuscriptor;
                    @XmlElement(name = "Numero", required = true)
                    protected String numero;

                    /**
                     * Gets the value of the nit property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNit() {
                        return nit;
                    }

                    /**
                     * Sets the value of the nit property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNit(String value) {
                        this.nit = value;
                    }

                    /**
                     * Gets the value of the codigoSuscriptor property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodigoSuscriptor() {
                        return codigoSuscriptor;
                    }

                    /**
                     * Sets the value of the codigoSuscriptor property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodigoSuscriptor(String value) {
                        this.codigoSuscriptor = value;
                    }

                    /**
                     * Gets the value of the nombreNit property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNombreNit() {
                        return nombreNit;
                    }

                    /**
                     * Sets the value of the nombreNit property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNombreNit(String value) {
                        this.nombreNit = value;
                    }

                    /**
                     * Gets the value of the nombreSuscriptor property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNombreSuscriptor() {
                        return nombreSuscriptor;
                    }

                    /**
                     * Sets the value of the nombreSuscriptor property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNombreSuscriptor(String value) {
                        this.nombreSuscriptor = value;
                    }

                    /**
                     * Gets the value of the numero property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumero() {
                        return numero;
                    }

                    /**
                     * Sets the value of the numero property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumero(String value) {
                        this.numero = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Contrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Actualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Creacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="UltimaConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NumReportes" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NumeroEntidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Entidad" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "contrato",
                "actualizacion",
                "creacion",
                "ultimaConfirmacion",
                "email",
                "numReportes",
                "numeroEntidades",
                "entidad",
                "llave"
            })
            public static class Email {

                @XmlElement(name = "Contrato", required = true, nillable = true)
                protected String contrato;
                @XmlElement(name = "Actualizacion", required = true, nillable = true)
                protected String actualizacion;
                @XmlElement(name = "Creacion", required = true, nillable = true)
                protected String creacion;
                @XmlElement(name = "UltimaConfirmacion", required = true, nillable = true)
                protected String ultimaConfirmacion;
                @XmlElement(name = "Email", required = true, nillable = true)
                protected String email;
                @XmlElement(name = "NumReportes", required = true, nillable = true)
                protected String numReportes;
                @XmlElement(name = "NumeroEntidades", required = true, nillable = true)
                protected String numeroEntidades;
                @XmlElement(name = "Entidad")
                protected ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Email.Entidad entidad;
                @XmlElement(name = "Llave")
                protected String llave;

                /**
                 * Gets the value of the contrato property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContrato() {
                    return contrato;
                }

                /**
                 * Sets the value of the contrato property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContrato(String value) {
                    this.contrato = value;
                }

                /**
                 * Gets the value of the actualizacion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getActualizacion() {
                    return actualizacion;
                }

                /**
                 * Sets the value of the actualizacion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setActualizacion(String value) {
                    this.actualizacion = value;
                }

                /**
                 * Gets the value of the creacion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCreacion() {
                    return creacion;
                }

                /**
                 * Sets the value of the creacion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCreacion(String value) {
                    this.creacion = value;
                }

                /**
                 * Gets the value of the ultimaConfirmacion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUltimaConfirmacion() {
                    return ultimaConfirmacion;
                }

                /**
                 * Sets the value of the ultimaConfirmacion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUltimaConfirmacion(String value) {
                    this.ultimaConfirmacion = value;
                }

                /**
                 * Gets the value of the email property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEmail() {
                    return email;
                }

                /**
                 * Sets the value of the email property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEmail(String value) {
                    this.email = value;
                }

                /**
                 * Gets the value of the numReportes property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumReportes() {
                    return numReportes;
                }

                /**
                 * Sets the value of the numReportes property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumReportes(String value) {
                    this.numReportes = value;
                }

                /**
                 * Gets the value of the numeroEntidades property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumeroEntidades() {
                    return numeroEntidades;
                }

                /**
                 * Sets the value of the numeroEntidades property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumeroEntidades(String value) {
                    this.numeroEntidades = value;
                }

                /**
                 * Gets the value of the entidad property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Email.Entidad }
                 *     
                 */
                public ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Email.Entidad getEntidad() {
                    return entidad;
                }

                /**
                 * Sets the value of the entidad property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Email.Entidad }
                 *     
                 */
                public void setEntidad(ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Email.Entidad value) {
                    this.entidad = value;
                }

                /**
                 * Gets the value of the llave property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLlave() {
                    return llave;
                }

                /**
                 * Sets the value of the llave property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLlave(String value) {
                    this.llave = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "nit",
                    "codigoSuscriptor",
                    "nombreNit",
                    "nombreSuscriptor",
                    "numero"
                })
                public static class Entidad {

                    @XmlElement(name = "Nit")
                    protected String nit;
                    protected String codigoSuscriptor;
                    protected String nombreNit;
                    protected String nombreSuscriptor;
                    @XmlElement(name = "Numero", required = true)
                    protected String numero;

                    /**
                     * Gets the value of the nit property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNit() {
                        return nit;
                    }

                    /**
                     * Sets the value of the nit property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNit(String value) {
                        this.nit = value;
                    }

                    /**
                     * Gets the value of the codigoSuscriptor property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodigoSuscriptor() {
                        return codigoSuscriptor;
                    }

                    /**
                     * Sets the value of the codigoSuscriptor property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodigoSuscriptor(String value) {
                        this.codigoSuscriptor = value;
                    }

                    /**
                     * Gets the value of the nombreNit property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNombreNit() {
                        return nombreNit;
                    }

                    /**
                     * Sets the value of the nombreNit property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNombreNit(String value) {
                        this.nombreNit = value;
                    }

                    /**
                     * Gets the value of the nombreSuscriptor property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNombreSuscriptor() {
                        return nombreSuscriptor;
                    }

                    /**
                     * Sets the value of the nombreSuscriptor property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNombreSuscriptor(String value) {
                        this.nombreSuscriptor = value;
                    }

                    /**
                     * Gets the value of the numero property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumero() {
                        return numero;
                    }

                    /**
                     * Sets the value of the numero property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumero(String value) {
                        this.numero = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="FechaInicial" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="FechaFinal" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="VectorDirecciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "fechaInicial",
                "fechaFinal",
                "vectorDirecciones",
                "tipo"
            })
            public static class IndicadorMovilidad {

                @XmlElement(name = "FechaInicial", required = true, nillable = true)
                protected String fechaInicial;
                @XmlElement(name = "FechaFinal", required = true, nillable = true)
                protected String fechaFinal;
                @XmlElement(name = "VectorDirecciones", required = true, nillable = true)
                protected String vectorDirecciones;
                @XmlElement(name = "Tipo", required = true, nillable = true)
                protected String tipo;

                /**
                 * Gets the value of the fechaInicial property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFechaInicial() {
                    return fechaInicial;
                }

                /**
                 * Sets the value of the fechaInicial property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFechaInicial(String value) {
                    this.fechaInicial = value;
                }

                /**
                 * Gets the value of the fechaFinal property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFechaFinal() {
                    return fechaFinal;
                }

                /**
                 * Sets the value of the fechaFinal property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFechaFinal(String value) {
                    this.fechaFinal = value;
                }

                /**
                 * Gets the value of the vectorDirecciones property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVectorDirecciones() {
                    return vectorDirecciones;
                }

                /**
                 * Sets the value of the vectorDirecciones property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVectorDirecciones(String value) {
                    this.vectorDirecciones = value;
                }

                /**
                 * Gets the value of the tipo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipo() {
                    return tipo;
                }

                /**
                 * Sets the value of the tipo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipo(String value) {
                    this.tipo = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="PrimerApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="SegundoApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NombreCompleto" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Validada" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Rut" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Genero" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="CodigoCIIU" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ActividadEconomica" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Identificacion">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="FechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Edad">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Min" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Max" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Ubicacion">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Antiguedad" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "nombres",
                "primerApellido",
                "segundoApellido",
                "nombreCompleto",
                "validada",
                "rut",
                "genero",
                "codigoCIIU",
                "actividadEconomica",
                "identificacion",
                "edad",
                "ubicacion",
                "llave"
            })
            public static class NaturalNacional {

                @XmlElement(name = "Nombres", required = true)
                protected String nombres;
                @XmlElement(name = "PrimerApellido", required = true)
                protected String primerApellido;
                @XmlElement(name = "SegundoApellido", required = true)
                protected String segundoApellido;
                @XmlElement(name = "NombreCompleto", required = true)
                protected String nombreCompleto;
                @XmlElement(name = "Validada", required = true)
                protected String validada;
                @XmlElement(name = "Rut", required = true)
                protected String rut;
                @XmlElement(name = "Genero", required = true)
                protected String genero;
                @XmlElement(name = "CodigoCIIU", required = true)
                protected String codigoCIIU;
                @XmlElement(name = "ActividadEconomica", required = true)
                protected String actividadEconomica;
                @XmlElement(name = "Identificacion", required = true)
                protected ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional.Identificacion identificacion;
                @XmlElement(name = "Edad", required = true)
                protected ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional.Edad edad;
                @XmlElement(name = "Ubicacion", required = true)
                protected ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional.Ubicacion ubicacion;
                @XmlElement(name = "Llave")
                protected String llave;

                /**
                 * Gets the value of the nombres property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNombres() {
                    return nombres;
                }

                /**
                 * Sets the value of the nombres property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNombres(String value) {
                    this.nombres = value;
                }

                /**
                 * Gets the value of the primerApellido property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPrimerApellido() {
                    return primerApellido;
                }

                /**
                 * Sets the value of the primerApellido property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPrimerApellido(String value) {
                    this.primerApellido = value;
                }

                /**
                 * Gets the value of the segundoApellido property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSegundoApellido() {
                    return segundoApellido;
                }

                /**
                 * Sets the value of the segundoApellido property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSegundoApellido(String value) {
                    this.segundoApellido = value;
                }

                /**
                 * Gets the value of the nombreCompleto property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNombreCompleto() {
                    return nombreCompleto;
                }

                /**
                 * Sets the value of the nombreCompleto property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNombreCompleto(String value) {
                    this.nombreCompleto = value;
                }

                /**
                 * Gets the value of the validada property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValidada() {
                    return validada;
                }

                /**
                 * Sets the value of the validada property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValidada(String value) {
                    this.validada = value;
                }

                /**
                 * Gets the value of the rut property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRut() {
                    return rut;
                }

                /**
                 * Sets the value of the rut property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRut(String value) {
                    this.rut = value;
                }

                /**
                 * Gets the value of the genero property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGenero() {
                    return genero;
                }

                /**
                 * Sets the value of the genero property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGenero(String value) {
                    this.genero = value;
                }

                /**
                 * Gets the value of the codigoCIIU property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodigoCIIU() {
                    return codigoCIIU;
                }

                /**
                 * Sets the value of the codigoCIIU property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodigoCIIU(String value) {
                    this.codigoCIIU = value;
                }

                /**
                 * Gets the value of the actividadEconomica property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getActividadEconomica() {
                    return actividadEconomica;
                }

                /**
                 * Sets the value of the actividadEconomica property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setActividadEconomica(String value) {
                    this.actividadEconomica = value;
                }

                /**
                 * Gets the value of the identificacion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional.Identificacion }
                 *     
                 */
                public ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional.Identificacion getIdentificacion() {
                    return identificacion;
                }

                /**
                 * Sets the value of the identificacion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional.Identificacion }
                 *     
                 */
                public void setIdentificacion(ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional.Identificacion value) {
                    this.identificacion = value;
                }

                /**
                 * Gets the value of the edad property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional.Edad }
                 *     
                 */
                public ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional.Edad getEdad() {
                    return edad;
                }

                /**
                 * Sets the value of the edad property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional.Edad }
                 *     
                 */
                public void setEdad(ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional.Edad value) {
                    this.edad = value;
                }

                /**
                 * Gets the value of the ubicacion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional.Ubicacion }
                 *     
                 */
                public ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional.Ubicacion getUbicacion() {
                    return ubicacion;
                }

                /**
                 * Sets the value of the ubicacion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional.Ubicacion }
                 *     
                 */
                public void setUbicacion(ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.NaturalNacional.Ubicacion value) {
                    this.ubicacion = value;
                }

                /**
                 * Gets the value of the llave property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLlave() {
                    return llave;
                }

                /**
                 * Sets the value of the llave property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLlave(String value) {
                    this.llave = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Min" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Max" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "min",
                    "max"
                })
                public static class Edad {

                    @XmlElement(name = "Min", required = true)
                    protected String min;
                    @XmlElement(name = "Max", required = true)
                    protected String max;

                    /**
                     * Gets the value of the min property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMin() {
                        return min;
                    }

                    /**
                     * Sets the value of the min property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMin(String value) {
                        this.min = value;
                    }

                    /**
                     * Gets the value of the max property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMax() {
                        return max;
                    }

                    /**
                     * Sets the value of the max property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMax(String value) {
                        this.max = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="FechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "estado",
                    "fechaExpedicion",
                    "ciudad",
                    "departamento",
                    "numero"
                })
                public static class Identificacion {

                    @XmlElement(name = "Estado", required = true)
                    protected String estado;
                    @XmlElement(name = "FechaExpedicion", required = true)
                    protected String fechaExpedicion;
                    @XmlElement(name = "Ciudad", required = true)
                    protected String ciudad;
                    @XmlElement(name = "Departamento", required = true)
                    protected String departamento;
                    @XmlElement(name = "Numero", required = true)
                    protected String numero;

                    /**
                     * Gets the value of the estado property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEstado() {
                        return estado;
                    }

                    /**
                     * Sets the value of the estado property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEstado(String value) {
                        this.estado = value;
                    }

                    /**
                     * Gets the value of the fechaExpedicion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFechaExpedicion() {
                        return fechaExpedicion;
                    }

                    /**
                     * Sets the value of the fechaExpedicion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFechaExpedicion(String value) {
                        this.fechaExpedicion = value;
                    }

                    /**
                     * Gets the value of the ciudad property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCiudad() {
                        return ciudad;
                    }

                    /**
                     * Sets the value of the ciudad property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCiudad(String value) {
                        this.ciudad = value;
                    }

                    /**
                     * Gets the value of the departamento property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDepartamento() {
                        return departamento;
                    }

                    /**
                     * Sets the value of the departamento property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDepartamento(String value) {
                        this.departamento = value;
                    }

                    /**
                     * Gets the value of the numero property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumero() {
                        return numero;
                    }

                    /**
                     * Sets the value of the numero property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumero(String value) {
                        this.numero = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Antiguedad" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "antiguedad"
                })
                public static class Ubicacion {

                    @XmlElement(name = "Antiguedad", required = true)
                    protected String antiguedad;

                    /**
                     * Gets the value of the antiguedad property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAntiguedad() {
                        return antiguedad;
                    }

                    /**
                     * Sets the value of the antiguedad property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAntiguedad(String value) {
                        this.antiguedad = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="CodigoArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Contrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Actualizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Creacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="UltimaConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="IndicativoPais" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NombreCiudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NombreDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NumReportes" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="NumeroEntidades" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="TipoResidencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="TipoLaboralOComercial" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Entidad" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Llave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "codigoArea",
                "contrato",
                "actualizacion",
                "creacion",
                "ultimaConfirmacion",
                "indicativoPais",
                "nombreCiudad",
                "nombreDepartamento",
                "numReportes",
                "numeroEntidades",
                "telefono",
                "tipo",
                "tipoResidencia",
                "tipoLaboralOComercial",
                "entidad",
                "llave"
            })
            public static class Telefono {

                @XmlElement(name = "CodigoArea", required = true, nillable = true)
                protected String codigoArea;
                @XmlElement(name = "Contrato", required = true, nillable = true)
                protected String contrato;
                @XmlElement(name = "Actualizacion", required = true, nillable = true)
                protected String actualizacion;
                @XmlElement(name = "Creacion", required = true, nillable = true)
                protected String creacion;
                @XmlElement(name = "UltimaConfirmacion", required = true, nillable = true)
                protected String ultimaConfirmacion;
                @XmlElement(name = "IndicativoPais", required = true, nillable = true)
                protected String indicativoPais;
                @XmlElement(name = "NombreCiudad", required = true, nillable = true)
                protected String nombreCiudad;
                @XmlElement(name = "NombreDepartamento", required = true, nillable = true)
                protected String nombreDepartamento;
                @XmlElement(name = "NumReportes", required = true, nillable = true)
                protected String numReportes;
                @XmlElement(name = "NumeroEntidades", required = true, nillable = true)
                protected String numeroEntidades;
                @XmlElement(name = "Telefono", required = true, nillable = true)
                protected String telefono;
                @XmlElement(name = "Tipo", required = true, nillable = true)
                protected String tipo;
                @XmlElement(name = "TipoResidencia", required = true, nillable = true)
                protected String tipoResidencia;
                @XmlElement(name = "TipoLaboralOComercial", required = true, nillable = true)
                protected String tipoLaboralOComercial;
                @XmlElement(name = "Entidad")
                protected ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Telefono.Entidad entidad;
                @XmlElement(name = "Llave")
                protected String llave;

                /**
                 * Gets the value of the codigoArea property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodigoArea() {
                    return codigoArea;
                }

                /**
                 * Sets the value of the codigoArea property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodigoArea(String value) {
                    this.codigoArea = value;
                }

                /**
                 * Gets the value of the contrato property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContrato() {
                    return contrato;
                }

                /**
                 * Sets the value of the contrato property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContrato(String value) {
                    this.contrato = value;
                }

                /**
                 * Gets the value of the actualizacion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getActualizacion() {
                    return actualizacion;
                }

                /**
                 * Sets the value of the actualizacion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setActualizacion(String value) {
                    this.actualizacion = value;
                }

                /**
                 * Gets the value of the creacion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCreacion() {
                    return creacion;
                }

                /**
                 * Sets the value of the creacion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCreacion(String value) {
                    this.creacion = value;
                }

                /**
                 * Gets the value of the ultimaConfirmacion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUltimaConfirmacion() {
                    return ultimaConfirmacion;
                }

                /**
                 * Sets the value of the ultimaConfirmacion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUltimaConfirmacion(String value) {
                    this.ultimaConfirmacion = value;
                }

                /**
                 * Gets the value of the indicativoPais property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndicativoPais() {
                    return indicativoPais;
                }

                /**
                 * Sets the value of the indicativoPais property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndicativoPais(String value) {
                    this.indicativoPais = value;
                }

                /**
                 * Gets the value of the nombreCiudad property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNombreCiudad() {
                    return nombreCiudad;
                }

                /**
                 * Sets the value of the nombreCiudad property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNombreCiudad(String value) {
                    this.nombreCiudad = value;
                }

                /**
                 * Gets the value of the nombreDepartamento property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNombreDepartamento() {
                    return nombreDepartamento;
                }

                /**
                 * Sets the value of the nombreDepartamento property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNombreDepartamento(String value) {
                    this.nombreDepartamento = value;
                }

                /**
                 * Gets the value of the numReportes property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumReportes() {
                    return numReportes;
                }

                /**
                 * Sets the value of the numReportes property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumReportes(String value) {
                    this.numReportes = value;
                }

                /**
                 * Gets the value of the numeroEntidades property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumeroEntidades() {
                    return numeroEntidades;
                }

                /**
                 * Sets the value of the numeroEntidades property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumeroEntidades(String value) {
                    this.numeroEntidades = value;
                }

                /**
                 * Gets the value of the telefono property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTelefono() {
                    return telefono;
                }

                /**
                 * Sets the value of the telefono property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTelefono(String value) {
                    this.telefono = value;
                }

                /**
                 * Gets the value of the tipo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipo() {
                    return tipo;
                }

                /**
                 * Sets the value of the tipo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipo(String value) {
                    this.tipo = value;
                }

                /**
                 * Gets the value of the tipoResidencia property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipoResidencia() {
                    return tipoResidencia;
                }

                /**
                 * Sets the value of the tipoResidencia property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipoResidencia(String value) {
                    this.tipoResidencia = value;
                }

                /**
                 * Gets the value of the tipoLaboralOComercial property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipoLaboralOComercial() {
                    return tipoLaboralOComercial;
                }

                /**
                 * Sets the value of the tipoLaboralOComercial property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipoLaboralOComercial(String value) {
                    this.tipoLaboralOComercial = value;
                }

                /**
                 * Gets the value of the entidad property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Telefono.Entidad }
                 *     
                 */
                public ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Telefono.Entidad getEntidad() {
                    return entidad;
                }

                /**
                 * Sets the value of the entidad property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Telefono.Entidad }
                 *     
                 */
                public void setEntidad(ConsultarDatosLocalizacionResponse.ConsultarDatosLocalizacionReturn.Localizacion.Telefono.Entidad value) {
                    this.entidad = value;
                }

                /**
                 * Gets the value of the llave property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLlave() {
                    return llave;
                }

                /**
                 * Sets the value of the llave property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLlave(String value) {
                    this.llave = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="codigoSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="nombreNit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="nombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "nit",
                    "codigoSuscriptor",
                    "nombreNit",
                    "nombreSuscriptor",
                    "numero"
                })
                public static class Entidad {

                    @XmlElement(name = "Nit")
                    protected String nit;
                    protected String codigoSuscriptor;
                    protected String nombreNit;
                    protected String nombreSuscriptor;
                    @XmlElement(name = "Numero", required = true)
                    protected String numero;

                    /**
                     * Gets the value of the nit property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNit() {
                        return nit;
                    }

                    /**
                     * Sets the value of the nit property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNit(String value) {
                        this.nit = value;
                    }

                    /**
                     * Gets the value of the codigoSuscriptor property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodigoSuscriptor() {
                        return codigoSuscriptor;
                    }

                    /**
                     * Sets the value of the codigoSuscriptor property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodigoSuscriptor(String value) {
                        this.codigoSuscriptor = value;
                    }

                    /**
                     * Gets the value of the nombreNit property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNombreNit() {
                        return nombreNit;
                    }

                    /**
                     * Sets the value of the nombreNit property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNombreNit(String value) {
                        this.nombreNit = value;
                    }

                    /**
                     * Gets the value of the nombreSuscriptor property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNombreSuscriptor() {
                        return nombreSuscriptor;
                    }

                    /**
                     * Sets the value of the nombreSuscriptor property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNombreSuscriptor(String value) {
                        this.nombreSuscriptor = value;
                    }

                    /**
                     * Gets the value of the numero property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumero() {
                        return numero;
                    }

                    /**
                     * Sets the value of the numero property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumero(String value) {
                        this.numero = value;
                    }

                }

            }

        }

    }

}
