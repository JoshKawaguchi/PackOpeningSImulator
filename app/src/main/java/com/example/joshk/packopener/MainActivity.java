package com.example.joshk.packopener;

import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Collections;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private int dustValue;
    private int craftCost;
    private int clicked = 0;
    private int c1, c2, c3, c4, c5 = 0;
    private int ifRare = 0;
    private ArrayList<Integer> common = new ArrayList<>();
    private ArrayList<Integer> rare = new ArrayList<>();
    private ArrayList<Integer> epic = new ArrayList<>();
    private ArrayList<Integer> legendary = new ArrayList<>();
    private ArrayList<Integer> d = new ArrayList<>();
    private Button card1;
    private Button card2;
    private Button card3;
    private Button card4;
    private Button card5;
    private Button next;
    private TextView craft;
    private TextView dust;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        wireWidgets();

        dustValue = 0;
        craftCost = 0;
        craft.setText("Craft Cost: " + craftCost);
        dust.setText("Dust Value: " + dustValue);

        addCards();


        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c1 == 0) {
                    revealCard(card1);
                    c1 = 1;
                }
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c2 == 0) {
                    revealCard(card2);
                    c2 = 1;
                }
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c3 == 0) {
                    revealCard(card3);
                    c3 = 1;
                }
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c4 == 0) {
                    revealCard(card4);
                    c4 = 1;
                }
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c5 == 0) {
                    revealCard(card5);
                    c5 = 1;
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Refresh", Toast.LENGTH_SHORT).show();
                if (clicked >= 5) {
                    dustValue = 0;
                    craftCost = 0;
                    craft.setText("Craft Cost: " + craftCost);
                    dust.setText("Dust Value: " + dustValue);
                    c1 = 0;
                    c2 = 0;
                    c3 = 0;
                    c4 = 0;
                    c5 = 0;
                    card1.setBackgroundResource(R.drawable.cardback);
                    card2.setBackgroundResource(R.drawable.cardback);
                    card3.setBackgroundResource(R.drawable.cardback);
                    card4.setBackgroundResource(R.drawable.cardback);
                    card5.setBackgroundResource(R.drawable.cardback);
                    clicked = 0;
                    ifRare = 0;
                }
            }
        });
    }

    private void addCards() {
        //erase these but use it as an example
        //add each card to the rarity they belong in ex:  malygos in legendary
        legendary.add(R.drawable.abomination);
        epic.add(R.drawable.abomination);
        rare.add(R.drawable.abomination);
        common.add(R.drawable.abomination);
    }


    private void wireWidgets() {
        card1 = findViewById(R.id.button_card1);
        card2 = findViewById(R.id.button_card2);
        card3 = findViewById(R.id.button_card3);
        card4 = findViewById(R.id.button_card4);
        card5 = findViewById(R.id.button_card5);
        next = findViewById(R.id.nextPack);
        craft = findViewById(R.id.craftCost);
        dust = findViewById(R.id.dustValue);
    }


    private void revealCard(Button b) {
        Double d = 100 * Math.random();
        if (clicked == 4 && ifRare == 0) {
            {
                if (d <= 1) {
                    //draw legendary
                    Toast.makeText(this, "Legendary", Toast.LENGTH_SHORT).show();
                    clicked++;
                    Collections.shuffle(legendary);
                    Collections.shuffle(legendary);
                    b.setBackgroundResource(legendary.get((int) (legendary.size() * Math.random())));
                    dustValue += 400;
                    craftCost += 1600;
                    craft.setText("Craft Cost: " + craftCost);
                    dust.setText("Dust Value: " + dustValue);
                    ifRare++;
                }
                if (d > 1 && d <= 6) {
                    //draw epic
                    Toast.makeText(this, "Epic", Toast.LENGTH_SHORT).show();
                    clicked++;
                    Collections.shuffle(epic);
                    Collections.shuffle(epic);
                    b.setBackgroundResource(epic.get((int) (epic.size() * Math.random())));
                    dustValue += 100;
                    craftCost += 400;
                    craft.setText("Craft Cost: " + craftCost);
                    dust.setText("Dust Value: " + dustValue);
                    ifRare++;
                }
                if (d > 6) {
                    //draw rare
                    Toast.makeText(this, "Rare", Toast.LENGTH_SHORT).show();
                    clicked++;
                    Collections.shuffle(rare);
                    Collections.shuffle(rare);
                    b.setBackgroundResource(epic.get((int) (epic.size() * Math.random())));
                    dustValue += 20;
                    craftCost += 100;
                    craft.setText("Craft Cost: " + craftCost);
                    dust.setText("Dust Value: " + dustValue);
                    ifRare++;
                }
            }
        }else {
            if (d <= 1) {
                //draw legendary
                Toast.makeText(this, "Legendary", Toast.LENGTH_SHORT).show();
                clicked++;
                Collections.shuffle(legendary);
                Collections.shuffle(legendary);
                b.setBackgroundResource(legendary.get((int) (legendary.size() * Math.random())));
                dustValue += 400;
                craftCost += 1600;
                craft.setText("Craft Cost: " + craftCost);
                dust.setText("Dust Value: " + dustValue);
                ifRare++;
            }
            if (d > 1 && d <= 6) {
                //draw epic
                Toast.makeText(this, "Epic", Toast.LENGTH_SHORT).show();
                clicked++;
                Collections.shuffle(epic);
                Collections.shuffle(epic);
                b.setBackgroundResource(epic.get((int) (epic.size() * Math.random())));
                dustValue += 100;
                craftCost += 400;
                craft.setText("Craft Cost: " + craftCost);
                dust.setText("Dust Value: " + dustValue);
                ifRare++;
            }
            if (d > 6 && d <= 29) {
                //draw rare
                Toast.makeText(this, "Rare", Toast.LENGTH_SHORT).show();
                clicked++;
                Collections.shuffle(rare);
                Collections.shuffle(rare);
                b.setBackgroundResource(epic.get((int) (epic.size() * Math.random())));
                dustValue += 20;
                craftCost += 100;
                craft.setText("Craft Cost: " + craftCost);
                dust.setText("Dust Value: " + dustValue);
                ifRare++;
            }
            if (d > 29) {
                //draw common
                Toast.makeText(this, "Common", Toast.LENGTH_SHORT).show();
                clicked++;
                Collections.shuffle(common);
                Collections.shuffle(common);
                b.setBackgroundResource(common.get((int) (common.size() * Math.random())));
                dustValue += 5;
                craftCost += 40;
                craft.setText("Craft Cost: " + craftCost);
                dust.setText("Dust Value: " + dustValue);
            }
        }
    }
}



