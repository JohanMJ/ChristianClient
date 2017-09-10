package server;

public class ClockProxy implements server.Clock {
  private String _endpoint = null;
  private server.Clock clock = null;
  
  public ClockProxy() {
    _initClockProxy();
  }
  
  public ClockProxy(String endpoint) {
    _endpoint = endpoint;
    _initClockProxy();
  }
  
  private void _initClockProxy() {
    try {
      clock = (new server.ClockServiceLocator()).getClock();
      if (clock != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)clock)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)clock)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (clock != null)
      ((javax.xml.rpc.Stub)clock)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public server.Clock getClock() {
    if (clock == null)
      _initClockProxy();
    return clock;
  }
  
  public long enviarMensagem(long time, java.lang.String mensagem) throws java.rmi.RemoteException{
    if (clock == null)
      _initClockProxy();
    return clock.enviarMensagem(time, mensagem);
  }
  
  
}