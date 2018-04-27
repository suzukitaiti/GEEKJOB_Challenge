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
abstract class Human {
    ArrayList<Integer> mycards = new ArrayList<Integer>();
    
    abstract int open();
    
    abstract void setCard(ArrayList<Integer> pull);
    
    abstract boolean checkSum();
    
}


