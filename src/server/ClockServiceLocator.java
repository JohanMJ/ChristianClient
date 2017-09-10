/**
 * ClockServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server;

public class ClockServiceLocator extends org.apache.axis.client.Service implements server.ClockService {

    public ClockServiceLocator() {
    }


    public ClockServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClockServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Clock
    private java.lang.String Clock_address = "http://localhost:8080/Christian/services/Clock";

    public java.lang.String getClockAddress() {
        return Clock_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ClockWSDDServiceName = "Clock";

    public java.lang.String getClockWSDDServiceName() {
        return ClockWSDDServiceName;
    }

    public void setClockWSDDServiceName(java.lang.String name) {
        ClockWSDDServiceName = name;
    }

    public server.Clock getClock() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Clock_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getClock(endpoint);
    }

    public server.Clock getClock(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            server.ClockSoapBindingStub _stub = new server.ClockSoapBindingStub(portAddress, this);
            _stub.setPortName(getClockWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setClockEndpointAddress(java.lang.String address) {
        Clock_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (server.Clock.class.isAssignableFrom(serviceEndpointInterface)) {
                server.ClockSoapBindingStub _stub = new server.ClockSoapBindingStub(new java.net.URL(Clock_address), this);
                _stub.setPortName(getClockWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Clock".equals(inputPortName)) {
            return getClock();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://server", "ClockService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://server", "Clock"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Clock".equals(portName)) {
            setClockEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
