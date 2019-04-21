/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.holding.service.impl;

import co.com.datacredito.services.schema.serviciolocalizacion.v1.ConsultarDatosLocalizacion;
import co.com.datacredito.services.schema.serviciolocalizacion.v1.ConsultarDatosLocalizacionResponse;
import co.com.datacredito.services.v1.serviciolocalizacion.ServicioLocalizacion;
import com.holding.reconocerxsd.SignaturePwdClientCallBackHandler;
import com.holding.service.ILocationService;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author estudapp
 */
@Service
public class LocationService implements ILocationService {

    @Autowired
    @Qualifier("servicioLocalizacionPort")
    ServicioLocalizacion port;

    @PostConstruct
    public void init() {
        System.setProperty("javax.net.debug", "ssl,handshake");
        System.setProperty("javax.net.ssl.trustStore", "C:\\certificados\\demo-servicesesb.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "experian");
        System.setProperty("javax.net.ssl.keyStore", "C:\\certificados\\demo-servicesesb.jks");
        System.setProperty("javax.net.ssl.keyStorePassword", "experian");

        System.setProperty("org.apache.cxf.stax.allowInsecureParser", "1");

        SignaturePwdClientCallBackHandler.certPassword = "Punt0R3d";
        SignaturePwdClientCallBackHandler.password = "Puntored2019";
    }

    @Override
    public ConsultarDatosLocalizacionResponse getLocation(ConsultarDatosLocalizacion _consultarDatosLocalizacion_parameters) {
        ConsultarDatosLocalizacionResponse _consultarDatosLocalizacion__return = null;
        try {            
            _consultarDatosLocalizacion__return = port.consultarDatosLocalizacion(_consultarDatosLocalizacion_parameters);
        } catch (Exception e) {
            System.out.println("Expected exception: ServicioLocalizacionException has occurred.");
            System.out.println(e.toString());
            return _consultarDatosLocalizacion__return;
        }
        return _consultarDatosLocalizacion__return;
    }

}
