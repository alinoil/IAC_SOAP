/**
 * BmrClassService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server;

public interface BmrClassService extends javax.xml.rpc.Service {
    public java.lang.String getBmrClassAddress();

    public server.BmrClass getBmrClass() throws javax.xml.rpc.ServiceException;

    public server.BmrClass getBmrClass(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
