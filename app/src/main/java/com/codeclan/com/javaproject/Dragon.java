package com.codeclan.com.javaproject;

import java.util.ArrayList;

/**
 * Created by user on 05/03/2017.
 */

public class Dragon extends Beast{

    public Dragon(String name, int age) {

        super(name, age);
    }


    public String makeNoise(){
        return "ROAR, WHO DISTURBS MY SLUMBER";
    }

    public String fly() {
        return "Standing up tall, beating wings, lift off!";

    }



    public int getBellyContent(){
        return belly.size();
    }



}
