/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomphonenumber;


import java.util.Random;


/**
 *
 * @author SChang2026
 */
public class RandomPhoneNumber {

 public static void main(String[] args){
Random rand = new Random();
for (int i = 0; i <= 9; i++) {
    if (i == 0) {
        System.out.print(rand.nextInt(7) + 1);
    } else if (i >= 2) {
        System.out.print(rand.nextInt(7));
    } else {
        System.out.print(rand.nextInt(9));
    }
if (i == 2 || i == 5) {
                System.out.print("-");
         }
      }
   }
}






