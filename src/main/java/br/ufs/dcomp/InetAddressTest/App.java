package br.ufs.dcomp.InetAddressTest;

import java.net.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            
            //String name = "www.ufs.br";
            //InetAddress address = InetAddress.getByName(name); 
            //System.out.println( "Name:      "+ name);
            //System.out.println( "Address:   "+ address.getHostAddress());
            
            String name = "www.uol.com.br";
            InetAddress [] addr_list = InetAddress.getAllByName(name);
            System.out.println( "Name:      "+ name);
            for(int i=0; i<addr_list.length; i++){
                InetAddress address = addr_list[i];
                System.out.println( "Address:   "+ address.getHostAddress());    
            }
            

        } catch (UnknownHostException e){
            System.out.println(e.getMessage());
        }                
    }
}
