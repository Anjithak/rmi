import java.rmi.*;
import java.rmi.registry.*;
import java.net.*;
import java.rmi.server.*;
public class server 
{
  public static void main(String args[]) 
  {
    try{
  
         //int thisport;
        // String thisaddress;
         rmiclass rc=new rmiclass();
         Registry registry=LocateRegistry.createRegistry(3333);
        // thisaddress="192.168.0.8";
        // thisport=3230;
         System.out.println("Server binding...\n");
         registry.rebind("rmiinter",rc);  
        }
      catch(Exception e){}
  }
}
