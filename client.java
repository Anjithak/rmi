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
            registry=LocateRegistry.getRegistry("192.168.0.18",3333);
             obj=(rmiinterface)registry.lookup("rmiinter");
          }
          catch(Exception e){}
    }
  public static void main(String args[])throws IOException,NotBoundException
  {
      client cl=new client();
      String a,b,c,d,e,f,g,rerev,recon,relow,reup;
      int choice,comp;
      try{
           //rmiinterface obj=(rmiinterface)Naming.lookup("rmi://192.168.0.8/client");    
           System.out.println("MENU\n");
           System.out.println("1.COMPARISON\n2.REVERSING\n3.CONCATENATION\n4.LOWER-CASE CONVERTION\n5.UPPER-CASE CONVERTION\n");
           System.out.println("Enter your choice : ");
           InputStreamReader isr=new InputStreamReader(System.in);
           BufferedReader br=new BufferedReader(isr);
           //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           choice=Integer.parseInt(br.readLine());
           switch(choice)
           {
              case 1: BufferedReader br1=new BufferedReader(isr);
                      BufferedReader br2=new BufferedReader(isr);
                      System.out.println("Enter the strings for comparing :");
                      a=br1.readLine();
                      b=br2.readLine();
                      comp=obj.compare(a,b);
                      if(comp==1)
                      {
                        System.out.println("First string is greater");
                      }
                      else if(comp==-1)
                      {
                        System.out.println("Second string is greater");
                      }
                      else
                      {
                        System.out.println("Both are equal");
                      }
                      break;
              case 2: BufferedReader br3=new BufferedReader(isr);
                      System.out.println("Enter the string to reverse :");
                      c=br3.readLine();
                      rerev=obj.reverse(c);
                      System.out.println("The string after reversing is :"+rerev);
                      break;
              case 3: BufferedReader br4=new BufferedReader(isr);
                      BufferedReader br5=new BufferedReader(isr);
                      System.out.println("Enter the strings for concatenating : ");
                      d=br4.readLine();
                      e=br5.readLine();           
                      recon=obj.append(d,e);
                      System.out.println("The String after concatenation is :"+recon);
                      break;
              case 4: BufferedReader br6=new BufferedReader(isr);
                      System.out.println("Enter the string for converting to lowercase : ");
                      f=br6.readLine();
                      relow=obj.lcase(f);
                      System.out.println("The String to lowercase  is :"+relow);
                      break;
              case 5: BufferedReader br7=new BufferedReader(isr);
                      System.out.println("Enter the string for converting to uppercase : ");
                      g=br7.readLine();
                      reup=obj.ucase(g);
                      System.out.println("The String to uppercase is :"+reup);
                      break;
            default : System.out.println("\n\nWrong choice!!!");
                      break;
          }
       obj.close();
          
          }
          catch(Exception ex){}
  }

}

