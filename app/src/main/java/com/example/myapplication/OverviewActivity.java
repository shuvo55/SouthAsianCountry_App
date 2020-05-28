package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class OverviewActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView,infotextView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);

        // for adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        imageView = findViewById(R.id.imageViewID);
        textView = findViewById(R.id.textViewID);
        infotextView = findViewById(R.id.anothertextviewID);

        Bundle bundle = getIntent().getExtras(); // intent receive kortesi bundle diye; putExtra() te string chilo seta pass kore ekhane ana hoise.

        if(bundle!= null)
        {
            String countryName = bundle.getString("name");// bundle er moddhe kichu ashle sheta key er maddhome ekhane rekhe dibo.
            showDetails(countryName); // country name gula ekhane dekhabe.

        }
    }


    /*

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater =  getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    */

    /*
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.home)
        {
            this.finish();
        }


        if(item.getItemId()==R.id.SourceDetailId)
        {
            Toast.makeText(OverviewActivity.this,"Image and Info Source: Wikipedia",Toast.LENGTH_SHORT).show();
        }



        return super.onOptionsItemSelected(item);
    }

    */

    void showDetails(String countryName)
    {
        if(countryName.equals("Bangladesh"))
        {
            imageView.setImageResource(R.mipmap.bd);
            textView.setText(R.string.Bangldesh_Text);
            infotextView.setText("Source: Wikipedia");
        }

        if(countryName.equals("India"))
        {
            imageView.setImageResource(R.mipmap.taj_mahal);
            textView.setText(R.string.India_Text);
            infotextView.setText("Source: Wikipedia");
        }

        if(countryName.equals("Pakistan"))
        {
            imageView.setImageResource(R.mipmap.badshahi_masjid);
            textView.setText(R.string.Pakistan_Text);
            infotextView.setText("Source: Wikipedia");
        }

        if(countryName.equals("Srilanka"))
        {
            imageView.setImageResource(R.mipmap.kandy);
            textView.setText(R.string.SriLanka_Text);
            infotextView.setText("Source: Wikipedia");
        }

        if(countryName.equals("Nepal"))
        {
            imageView.setImageResource(R.mipmap.nepal_place);
            textView.setText(R.string.Nepal_Text);
            infotextView.setText("Source: Wikipedia");
        }

        if(countryName.equals("Bhutan"))
        {
            imageView.setImageResource(R.mipmap.paro_palace);
            textView.setText(R.string.Bhutan_Text);
            infotextView.setText("Source: Wikipedia");
        }

        if(countryName.equals("Afghanistan"))
        {
            imageView.setImageResource(R.mipmap.afghan_parliament_building);
            textView.setText(R.string.Afghanistan_Text);
            infotextView.setText("Source: Wikipedia");
        }

        if(countryName.equals("Maldives"))
        {
            imageView.setImageResource(R.mipmap.male_city);
            textView.setText(R.string.Maldives_Text);
            infotextView.setText("Source: Wikipedia");

        }

      }
    }
