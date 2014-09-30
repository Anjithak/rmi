import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.lang.*;
public class rmiclass extends UnicastRemoteObject implements rmiinterface
{
  
   rmiclass()throws RemoteException
   {
   }
   public void compare(String str1,String str2) throws RemoteException
   {
      if(str1.compareTo(str2)>0)
      {
        System.out.println("First string is greater");
      }
      else if(str1.compareTo(str2)<0)
      {
         System.out.println("Second string is greater");
      }
      else
      { 
        System.out.println("Both are equal");
      }
   }
   public void reverse(String str) throws RemoteException
   {
     int i,length;
     String rev=" ";
     length=str.length();
     for(i=length-1;i>=0;i--)
     {
       rev=rev+str.charAt(i);
     }
     System.out.println("The string after reversing is :"+rev);
   }
   public void append(String a,String b) throws RemoteException
   {
     String c;
     c=a.concat(b);
     System.out.println("The String after concatenation is :"+c);
   }
  public void lcase(String st) throws RemoteException
   {
     String lstr;
     lstr=st.toLowerCase();   
      System.out.println("The String to lowercase  is :"+lstr);
   }
  public void ucase(String st) throws RemoteException
   {
     String ustr;
     ustr=st.toUpperCase();
     System.out.println("The String to uppercase is :"+ustr);
     System.out.println("\n\n"); 
   }
}
        

