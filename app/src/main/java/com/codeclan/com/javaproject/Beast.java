package com.codeclan.com.javaproject;

import java.util.ArrayList;

import static android.R.attr.name;

/**
 * Created by user on 05/03/2017.
 */

public abstract class Beast {

     public String name;
     public int age;
    protected ArrayList<Edible> belly;



    public Beast(String name, int age){
        this.name = name;
        this.age = age;
        this.belly = new ArrayList<Edible>();


    }



    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String breathe(){
        return "The Beast breathes";
    }

    public int getBellySize(){
        return belly.size();
    }

    public String makeNoise(){
        return "The Beast makes a noise";
    }

    public void eat (Edible food){
        belly.add(food);
    }

    public int foodCount(){
        return belly.size();
    }



}