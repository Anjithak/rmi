import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.lang.*;
public class rmiclass extends UnicastRemoteObject implements rmiinterface
{
  
   rmiclass()throws RemoteException
   {
   }
   public int compare(String str1,String str2) throws RemoteException
   {
      int f;
      if(str1.compareTo(str2)>0)
      {
         f=1;
          return f;
        
      }
      else if(str1.compareTo(str2)<0)
      {
        f=-1;
         return f;
         
      }
      else
      {   
         f=0;
          return f;
        
      }
   }
   public String reverse(String str) throws RemoteException
   {
     int i,length;
     String rev=" ";
     length=str.length();
     for(i=length-1;i>=0;i--)
     {
       rev=rev+str.charAt(i);
     }
     return rev;
   }
   public String append(String a,String b) throws RemoteException
   {
     String c;
     c=a.concat(b);
     return c; 
   }
  public String lcase(String st) throws RemoteException
   {
     String lstr;
     lstr=st.toLowerCase(); 
     return lstr;     
   }
  public String ucase(String st) throws RemoteException
   {
     String ustr;
     ustr=st.toUpperCase();
     return ustr;
   }
  public void close()
  {
    System.exit(0);
  }
}
        

