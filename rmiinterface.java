import java.net.*;
import java.rmi.registry.*;
import java.lang.*;
import java.rmi.*;
public interface rmiinterface extends Remote
{

   public int compare(String s1,String s2) throws RemoteException;
   public String reverse(String s) throws RemoteException;
   public String  append(String str1,String str2) throws RemoteException;
   public String lcase(String str3) throws RemoteException;
   public String ucase(String str4) throws RemoteException;
   public void close() throws RemoteException;
}

