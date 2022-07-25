package com.company;
public class Main {
    public static void main(String[] args) {
     Animal[] animals ={new Turtle(),
             new Shark(),
             new Eagle()};
     for(Animal a:animals){
         if(a instanceof Turtle){
             ((Turtle) a).swim();}
             else if(a instanceof Shark){
                 ((Shark) a).attack();}
             else if (a instanceof Eagle) {
                 ((Eagle) a).fly();
         }
     }
     Shark[] sharks={new Shark()};
     Eagle[] eagles={new Eagle()};
     Turtle[] turtles={new Turtle()};
         for(Animal a:animals){
         if(a.getClass()==Shark.class){
             a=sharks[0];}
         else if (a.getClass()==Turtle.class) {
             a=turtles[0];}
         else if(a.getClass()==Eagle.class){
         a=eagles[0];}
         }
    }}


