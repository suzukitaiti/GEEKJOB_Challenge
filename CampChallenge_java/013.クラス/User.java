/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;
import java.util.ArrayList;
/**
 *
 * @author taichi
 */
class User extends Human {
   
    
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
        if(open() < 13){
            return true;
        } else {
            return false;
        }
    }
}
