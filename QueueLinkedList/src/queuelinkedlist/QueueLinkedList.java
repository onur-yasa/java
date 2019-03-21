/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuelinkedlist;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kubra
 */
public class QueueLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<String> queue=new LinkedList<String>();
        queue.offer("Kubra");
        queue.offer("Merve");
        queue.offer("Apo");
        queue.offer("Emre");
        
        for(String e:queue){
            System.out.println(e);
        }
        while(!queue.isEmpty()){
            System.out.println("Elemean çıakrılıyor"+queue.poll());
        }
    }
    
}
