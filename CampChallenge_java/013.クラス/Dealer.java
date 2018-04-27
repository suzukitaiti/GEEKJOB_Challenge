/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author taichi
 */
class Dealer extends Human {
    
    ArrayList<Integer> cards = new ArrayList<Integer>();
    
   
    Dealer(){
        for(int a = 0; a<4 ; a++){
            for(int i = 1; i < 14 ; i++){
                if(i > 10){
                    cards.add(10);
                } else {
                cards.add(i);
                }
            }
        }    
        Collections.shuffle (cards);
    }
    
    
    ArrayList<Integer> deal(){
        ArrayList<Integer> plus1 =  new ArrayList<>();
        
        for(int i = 0; i < 2; i++){
            plus1.add(cards.get(0));
            cards.remove(0);
        }
        return plus1;
        
    }
    
    ArrayList<Integer> hit(){
        ArrayList<Integer> plus2 = new ArrayList<>();
        
        plus2.add(cards.get(0));
        cards.remove(0);
        
        return plus2;
    }
    
    
    int open(){
        int total = 0;
        for(int i:this.mycards){
          total = total + i;
        }
        return total;
    }
    
    void setCard(ArrayList<Integer> pull){
      for(int i=0;i<pull.size();i++){
        this.mycards.add(pull.get(i));
    }
    }
    
    boolean checkSum(){
        open();
        if(open() < 17){
            return true;
        } else {
            return false;
        }
    }
}
