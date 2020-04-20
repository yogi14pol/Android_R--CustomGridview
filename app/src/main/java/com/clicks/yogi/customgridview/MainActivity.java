package com.clicks.yogi.customgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView grid;
    String[] countryName = {"India","Russia","Usa","Isarel","India","Russia","Usa","Isarel","India","Russia","Usa","Isarel"};
    String[] num = {"one","two","three","four","one","two","three","four","one","two","three","four"};
    Integer[] img = {R.drawable.india,R.drawable.russia,R.drawable.usa,R.drawable.israel,R.drawable.india,R.drawable.russia,R.drawable.usa,R.drawable.israel,
            R.drawable.india,R.drawable.russia,R.drawable.usa,R.drawable.israel};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gridview_Adapter adapter = new Gridview_Adapter(this,countryName,num,img);

        grid = findViewById(R.id.grid);
        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){

                    case 0:
                        Toast.makeText(MainActivity.this, "Hey India", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Hey Russia", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Hey USA", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Hey Isarel", Toast.LENGTH_SHORT).show();
                        break;
                    // Similarly, add case 4,5,6,7,8,9,10,11...
                    default:
                        Toast.makeText(MainActivity.this, "Add remaining switch case...", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}