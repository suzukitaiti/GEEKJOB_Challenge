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
public class Challenge1 {
    String name;
    int age;


public void method1(String n,int a){
    this.name = n;
    this.age = a;
}

public void method2(){
    System.out.println(name);
    System.out.println(age);
}

}
