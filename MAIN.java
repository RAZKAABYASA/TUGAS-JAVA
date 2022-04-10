/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author Asus
 */
public class MAIN {

    public static void main(String[] args) {

        StrayKids a = new StrayKids();
        a.SKZ();
        
        Member b  = new Member();
        b.SKZ();
        
        StrayKids c = new StrayKids();
        c.ronaldo();
        
        StrayKids d = new Member();  // POLYMORPHISM //
        d.ronaldo();
        
    }

    private static class Member extends StrayKids {

        public Member() {
        }
    }
}