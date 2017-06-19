/**
 * BmrClassServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server;

public class BmrClassServiceLocator extends org.apache.axis.client.Service implements server.BmrClassService {

    public BmrClassServiceLocator() {
    }


    public BmrClassServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BmrClassServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BmrClass
    private java.lang.String BmrClass_address = "http://localhost:8080/DynamicWebProject/services/BmrClass";

    public java.lang.String getBmrClassAddress() {
        return BmrClass_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BmrClassWSDDServiceName = "BmrClass";

    public java.lang.String getBmrClassWSDDServiceName() {
        return BmrClassWSDDServiceName;
    }

    public void setBmrClassWSDDServiceName(java.lang.String name) {
        BmrClassWSDDServiceName = name;
    }

    public server.BmrClass getBmrClass() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BmrClass_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBmrClass(endpoint);
    }

    public server.BmrClass getBmrClass(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            server.BmrClassSoapBindingStub _stub = new server.BmrClassSoapBindingStub(portAddress, this);
            _stub.setPortName(getBmrClassWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBmrClassEndpointAddress(java.lang.String address) {
        BmrClass_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (server.BmrClass.class.isAssignableFrom(serviceEndpointInterface)) {
                server.BmrClassSoapBindingStub _stub = new server.BmrClassSoapBindingStub(new java.net.URL(BmrClass_address), this);
                _stub.setPortName(getBmrClassWSDDServiceName());
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
        if ("BmrClass".equals(inputPortName)) {
            return getBmrClass();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://server", "BmrClassService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://server", "BmrClass"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BmrClass".equals(portName)) {
            setBmrClassEndpointAddress(address);
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
