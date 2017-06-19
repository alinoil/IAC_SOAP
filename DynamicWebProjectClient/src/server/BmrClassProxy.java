package server;

public class BmrClassProxy implements server.BmrClass {
  private String _endpoint = null;
  private server.BmrClass bmrClass = null;
  
  public BmrClassProxy() {
    _initBmrClassProxy();
  }
  
  public BmrClassProxy(String endpoint) {
    _endpoint = endpoint;
    _initBmrClassProxy();
  }
  
  private void _initBmrClassProxy() {
    try {
      bmrClass = (new server.BmrClassServiceLocator()).getBmrClass();
      if (bmrClass != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bmrClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bmrClass)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bmrClass != null)
      ((javax.xml.rpc.Stub)bmrClass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public server.BmrClass getBmrClass() {
    if (bmrClass == null)
      _initBmrClassProxy();
    return bmrClass;
  }
  
  public double generateBmr(double weight, double height, java.lang.String gender, int age) throws java.rmi.RemoteException{
    if (bmrClass == null)
      _initBmrClassProxy();
    return bmrClass.generateBmr(weight, height, gender, age);
  }
  
  
}