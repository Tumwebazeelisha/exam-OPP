/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eli.mavenproject1;

/**
 *
 * @author ELISHA
 */
public class babyFeedingSchedule {
    public static void main(String[]args){
        double totalPorridge=2.0;
        double totalMilk=2.0;
        double cupSize=0.5;
        int porridgeInterval=45;
        int milkInterval=30;
         
       
        int numPorridgeFeeds=(int)(totalPorridge/cupSize);
        int numMilkFeeds=(int)(totalMilk/cupSize);
        int totalPorridgeTime=(numPorridgeFeeds-1)*porridgeInterval; 
        int totalMilkTime=(numMilkFeeds- 1)* milkInterval;
        int totalTime = Math.max(totalPorridgeTime,totalMilkTime);
        System.out.println("Total time to finish both porridge and milk:"+totalTime+" minutes");
    }

        
    } 
    

