package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bangladeshButton,indiaButton,pakistanButton, srilankaButton,nepalButton,bhutanButton,afghanistanButton,maldivesButton;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshButton = findViewById(R.id.bdButtonID);
        indiaButton = findViewById(R.id.indiaButtonID);
        pakistanButton = findViewById(R.id.pakButtonID);
        srilankaButton =  findViewById(R.id.srilankaButtonID);
        nepalButton = findViewById(R.id.nepalButtonID);
        bhutanButton = findViewById(R.id.bhutanButtonID);
        afghanistanButton = findViewById(R.id.afghanistanButtonID);
        maldivesButton = findViewById(R.id.maldivesButtonID);

        bangladeshButton.setOnClickListener(this);
        indiaButton.setOnClickListener(this);
        pakistanButton.setOnClickListener(this);
        srilankaButton.setOnClickListener(this);
        nepalButton.setOnClickListener(this);
        bhutanButton.setOnClickListener(this);
        afghanistanButton.setOnClickListener(this);
        maldivesButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.bdButtonID)
        {
            intent = new Intent(MainActivity.this,OverviewActivity.class);
            intent.putExtra("name","Bangladesh");
            startActivity(intent);
        }

        if(v.getId() == R.id.indiaButtonID)
        {
            intent = new Intent(MainActivity.this,OverviewActivity.class);
            intent.putExtra("name","India");
            startActivity(intent);
        }

        if(v.getId() == R.id.pakButtonID)
        {
            intent = new Intent(MainActivity.this,OverviewActivity.class);
            intent.putExtra("name","Pakistan");
            startActivity(intent);
        }

        if(v.getId() == R.id.srilankaButtonID)
        {
            intent = new Intent(MainActivity.this,OverviewActivity.class);
            intent.putExtra("name","Srilanka");
            startActivity(intent);
        }

        if(v.getId() == R.id.nepalButtonID)
        {
            intent = new Intent(MainActivity.this,OverviewActivity.class);
            intent.putExtra("name","Nepal");
            startActivity(intent);
        }

        if(v.getId() == R.id.bhutanButtonID)
        {
            intent = new Intent(MainActivity.this,OverviewActivity.class);
            intent.putExtra("name","Bhutan");
            startActivity(intent);
        }

        if(v.getId() == R.id.afghanistanButtonID)
        {
            intent = new Intent(MainActivity.this,OverviewActivity.class);
            intent.putExtra("name","Afghanistan");
            startActivity(intent);
        }

        if(v.getId() == R.id.maldivesButtonID)
        {
            intent = new Intent(MainActivity.this,OverviewActivity.class);
            intent.putExtra("name","Maldives");
            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater =  getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.SourceDetailId)
        {
              AlertDialog.Builder alertDialogBuilder;
              alertDialogBuilder = new AlertDialog.Builder(this);
              alertDialogBuilder.setMessage("Flagicon Source:www.countryflag.com\n"+"\n"+ "Background Source:www.hipwallpaper.com");
              //alertDialogBuilder.setMessage("Background Image Source: www.hipwallpaper.com");
            //Toast.makeText(MainActivity.this,"Flagicon Images Source: \n" +  "www.countryflags.com",Toast.LENGTH_SHORT).show();
           // Toast.makeText(MainActivity.this,"Background picture Source: \n" +  "www.hipwallpaper.com",Toast.LENGTH_LONG).show();
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        }
        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed()
    {
        AlertDialog.Builder alertDialogBuilder; // variable nisi
        alertDialogBuilder = new AlertDialog.Builder(this); // variable tar object create korsi
        //alertDialogBuilder.setIcon(R.drawable.question_mark);
        alertDialogBuilder.setIcon(R.drawable.exit_logo);
        alertDialogBuilder.setTitle(R.string.Title_text);
        alertDialogBuilder.setMessage(R.string.question_text);

        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();


    }
}
