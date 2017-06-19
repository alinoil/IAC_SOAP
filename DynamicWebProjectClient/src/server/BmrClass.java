/**
 * BmrClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package server;

public interface BmrClass extends java.rmi.Remote {
    public double generateBmr(double weight, double height, java.lang.String gender, int age) throws java.rmi.RemoteException;
}
