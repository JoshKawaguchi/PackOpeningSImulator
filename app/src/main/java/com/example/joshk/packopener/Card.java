package com.example.joshk.packopener;

import android.graphics.drawable.Drawable;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Card {
    private String rarity;
    private Drawable picture;
    private int pic;

    public ArrayList<Card> common;
    public ArrayList<Card> rare;
    public ArrayList<Card> epic;
    public ArrayList<Card> legendary;



    public Card(int d, String r)
    {
        pic = d;
        rarity = r;


    }





    public int getPicture() {
        //return picture;
        return pic;
    }

    public String getRarity(){
        return rarity;
    }



    public int getDustValuealue(){
        if(rarity.equals("Common")){
            return 5;
        }
        if(rarity.equals("Rare")){
            return 20;
        }
        if(rarity.equals("Epic")){
            return 100;
        }
        if(rarity.equals("Legendary")){
            return 400;
        }else {
            return 0;
        }
    }

    public int getCraftCost(){
        if(rarity.equals("Common")){
            return 40;
        }
        if(rarity.equals("Rare")){
            return 100;
        }
        if(rarity.equals("Epic")){
            return 400;
        }
        if(rarity.equals("Legendary")){
            return 1600;
        }else {
            return 0;
        }
    }

}
