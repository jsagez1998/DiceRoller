package org.afpa.mon_de;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class AfficheResultatActivity extends AppCompatActivity{

    //déclaration des variables
    private TextView  resultat;
    private int nbfaces;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affiche_resultat);

        //récuperer les infos de l'intent
        Intent intent = getIntent();
        nbfaces = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 1);
        launch();
    }

    private void launch(){
        //afficher le text
        text = findViewById(R.id.text);
        text.setText("Pour un Dé à "+nbfaces+" Faces");
        resultat = findViewById(R.id.resultat);
        int result=(int) (Math.random()*(nbfaces-1))+1;
        this.resultat.setText(String.valueOf(result));
    }

    public void relaunch(View view) {
        launch();
    }
}
