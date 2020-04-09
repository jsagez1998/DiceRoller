package org.afpa.mon_de;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import static java.lang.Integer.valueOf;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    //public static final String EXTRA_MESSAGE = "org.afpa.myapplication.MESSAGE";

    public static final String EXTRA_MESSAGE = "MESSAGE" ;
    private EditText nbFace; //champs nombre face saisi
    private Button lancer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nbFace = findViewById(R.id.nbFace);
        lancer = findViewById(R.id.lancer);

        lancer.setOnClickListener(this); //le click se fait uniqement pour le botton lancer
    }

    @Override
    public void onClick(View v) { // quand on click sur le button
        if (v == lancer) {
            Intent intent=new  Intent(MainActivity.this,AfficheResultatActivity.class);
            int nbFaces = (int) Integer.parseInt(nbFace.getText().toString());
            intent.putExtra(EXTRA_MESSAGE, nbFaces);
            startActivity(intent);

        }
    }


}
