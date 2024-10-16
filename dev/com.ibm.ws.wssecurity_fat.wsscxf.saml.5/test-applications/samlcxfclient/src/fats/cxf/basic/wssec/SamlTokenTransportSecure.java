/*******************************************************************************
 * Copyright (c) 2021 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package fats.cxf.basic.wssec;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2015-09-16T21:33:14.529-05:00
 * Generated source version: 2.6.2
 * 
 */
@WebServiceClient(name = "SamlTokenTransportSecure", 
                  wsdlLocation = "../../samltoken/resources/WEB-INF/SamlTokenWebSvc.wsdl",
                  targetNamespace = "http://wssec.basic.cxf.fats") 
public class SamlTokenTransportSecure extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://wssec.basic.cxf.fats", "SamlTokenTransportSecure");
    public final static QName SamlTokenTransportSecurePort = new QName("http://wssec.basic.cxf.fats", "SamlTokenTransportSecurePort");
    static {
        URL url = SamlTokenTransportSecure.class.getResource("../../samltoken/resources/WEB-INF/SamlTokenWebSvc.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(SamlTokenTransportSecure.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "../../samltoken/resources/WEB-INF/SamlTokenWebSvc.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public SamlTokenTransportSecure(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SamlTokenTransportSecure(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SamlTokenTransportSecure() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    /**
     *
     * @return
     *     returns SamlTokenType
     */
    @WebEndpoint(name = "SamlTokenTransportSecurePort")
    public SamlTokenType getSamlTokenTransportSecurePort() {
        return super.getPort(SamlTokenTransportSecurePort, SamlTokenType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SamlTokenType
     */
    @WebEndpoint(name = "SamlTokenTransportSecurePort")
    public SamlTokenType getSamlTokenTransportSecurePort(WebServiceFeature... features) {
        return super.getPort(SamlTokenTransportSecurePort, SamlTokenType.class, features);
    }

}
