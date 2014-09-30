import java.io.*;
import java.rmi.registry.*;
import java.rmi.*;
import java.net.*;
public class client 
{
   
    Registry registry;
    static rmiinterface obj=null;
    public client()
    {
      try{
            registry=LocateRegistry.getRegistry("192.168.0.68",3333);
             obj=(rmiinterface)registry.lookup("rmiinter");
          }
          catch(Exception e){}
    }
  public static void main(String args[])throws IOException,NotBoundException
  {
      client cl=new client();
     String a,b,c,d,e,f,g;
      try{
           //rmiinterface obj=(rmiinterface)Naming.lookup("rmi://192.168.0.8/client");      
           InputStreamReader isr=new InputStreamReader(System.in);
           BufferedReader br=new BufferedReader(isr);
           BufferedReader br1=new BufferedReader(isr);
           System.out.println("Enter the strings for comparing :");
           a=br.readLine();
           b=br1.readLine();
           obj.compare(a,b);
           System.out.println("Enter the string to reverse :");
           BufferedReader br2=new BufferedReader(isr);
           c=br2.readLine();
           obj.reverse(c);
           System.out.println("Enter the strings for concatenating : ");
           BufferedReader br3=new BufferedReader(isr);
           BufferedReader br4=new BufferedReader(isr);
           d=br3.readLine();
           e=br4.readLine();
           obj.append(d,e);
           System.out.println("Enter the string for converting to lowercase : ");
           BufferedReader br5=new BufferedReader(isr);
           f=br5.readLine();
           obj.lcase(f);
           System.out.println("Enter the string for converting to uppercase : ");
           BufferedReader br6=new BufferedReader(isr);
           g=br6.readLine();
           obj.ucase(g);
          }
          catch(Exception ex){}
  }

}

