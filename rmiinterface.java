import java.net.*;
import java.rmi.registry.*;
import java.lang.*;
import java.rmi.*;
public interface rmiinterface extends Remote
{

   public void compare(String s1,String s2) throws RemoteException;
   public void reverse(String s) throws RemoteException;
   public void append(String str1,String str2) throws RemoteException;
   public void lcase(String str3) throws RemoteException;
   public void ucase(String str4) throws RemoteException;
}

