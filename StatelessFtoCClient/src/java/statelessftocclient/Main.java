/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statelessftocclient;

import mybean.StatelessFtoCBeanRemote;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {

    @javax.ejb.EJB
    private static StatelessFtoCBeanRemote statelessFtoCBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter degree in Fahrenheit: ");
        double c = in.nextDouble();
        System.out.println(c + "Fahrenheit = " + statelessFtoCBean.fToC(c) + " Celsius");
    }
    
}
