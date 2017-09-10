/**
 * ClockService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server;

public interface ClockService extends javax.xml.rpc.Service {
    public java.lang.String getClockAddress();

    public server.Clock getClock() throws javax.xml.rpc.ServiceException;

    public server.Clock getClock(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
