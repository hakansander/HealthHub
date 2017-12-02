package halmob.healthhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import halmob.healthhub.Models.BloodSugar;

public class DiabActivity extends AppCompatActivity {
    private ImageButton insulinButton;
    private ImageButton bloodSugarButton;
    private ImageButton mealButton;
    private ImageButton carbCountButton;
    private Button insulinButton2;
    private Button bloodSugarButton2;
    private Button mealButton2;
    private Button carbCountButton2;
    private Button tableButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diab);

        insulinButton = findViewById(R.id.insulin_button);
        insulinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DiabActivity.this, InsulinActivity.class);
                startActivity(i);
            }
        });

        insulinButton2 = findViewById(R.id.insulin_button_2);
        insulinButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DiabActivity.this, InsulinActivity.class);
                startActivity(i);
            }
        });



        bloodSugarButton = findViewById(R.id.blood_sugar_button);
        bloodSugarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DiabActivity.this, BloodSugarActivity.class);
                startActivity(i);
            }
        });


        bloodSugarButton2 = findViewById(R.id.blood_sugar_button_2);
        bloodSugarButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DiabActivity.this, BloodSugarActivity.class);
                startActivity(i);
            }
        });

        mealButton = findViewById(R.id.meal_button);
        mealButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DiabActivity.this, MealActivity.class);
                startActivity(intent);
            }
        });

        mealButton2 = findViewById(R.id.meal_button_2);
        mealButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DiabActivity.this, MealActivity.class);
                startActivity(intent);
            }
        });


        carbCountButton = findViewById(R.id.carb_count_button);
        carbCountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DiabActivity.this, MealActivity.class);
                startActivity(intent);
            }
        });


        carbCountButton2 = findViewById(R.id.carb_count_button_2);
        carbCountButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DiabActivity.this, MealActivity.class);
                startActivity(intent);
            }
        });

        tableButton = findViewById(R.id.tableButton);
        tableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DiabActivity.this, DiabTableActivity.class);
                startActivity(intent);
            }
        });


    }

}
