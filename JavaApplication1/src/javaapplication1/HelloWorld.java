/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Ronnie
 */
public class HelloWorld {

     public static void main(String []args){
         
         Box myBox = new Box();
         myBox.setColor("Blue");
         String a = myBox.getColor();
        System.out.println(a);
        
        Milk myMilk = new Milk();
        myMilk.drink();
        
        Box<Milk> myBox2 = new Box<>();
        myBox2.remove();
        myBox2.add(myMilk);
        myBox2.add(myMilk);
        
        myBox2.remove();
    
     }
     
}

class Milk {
  void drink() {
    System.out.println("You drink the milk.");
  }
}

class Oranges {
  void juggle() {
    System.out.println("You drop the oranges on the ground.");
  }
}

class Box <object> {
    
    private Object contents;
    int width;
    String color;
    
    void add(Object thing) {
    if (contents == null) {
      contents = thing;
      System.out.println("The item has been place in the box.");
    } else {
      System.out.println("The box is full.");
    }
  }

  /* Object remove() {
    if (contents == null) {
      System.out.println("The box is empty.");
      return null;
    } else {
      Object thing = contents;
      contents = null;
      return thing;
    }
  } */
    
    void remove() {
    if (contents == null) {
      System.out.println("The box is empty.");
      //return null;
    } else {
      Object thing = contents;
      contents = null;
      System.out.println("This item has been removed.");
      //return thing;
    }
   }
    
    public void setWidth(int width){
        this.width = width;
    }
    
    public int getWidth(){
        return width;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
    
}

