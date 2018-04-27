/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

/**
 *
 * @author taichi
 */
public class BlackJack {
    public static void main(String[] args){
            
        User ur = new User();
    
        Dealer dr = new Dealer();
        
        ur.setCard(dr.deal());
        
        dr.setCard(dr.deal());
        
        while(dr.checkSum()){
            dr.setCard(dr.hit());
        }
        
        while(ur.checkSum()){
            ur.setCard(dr.hit());
        }
        
        int d = dr.open();
        int u = ur.open();
        
        System.out.println("ディーラー:" + d);
        System.out.println("あなた:" + u);
        
        if(d > u && d < 22 || u > 21){
            System.out.println("あなたの負けです");
        } else if (d == u || u >21 && d >21) {
            System.out.println("引き分けです");
        } else if (d > 21 || u > d){
            System.out.println("あなたの勝ちです");
        }
        
        
    }
    
}
