package com.mazter707.tutorialuno;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mazter707.tutorialuno.Objetos.Coche;
import com.mazter707.tutorialuno.Objetos.FirebaseReferences;

public class MainActivity extends AppCompatActivity {

    Button buttonCoche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCoche = (Button) findViewById(R.id.boton_coche);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference tutorialRef= database.getReference(FirebaseReferences.TUTORIAL_REFERENCES);
        buttonCoche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Coche coche = new Coche("BMW", "Jesus", 2, 4 );
                tutorialRef.child(FirebaseReferences.COCHE_REFERENCES).push().setValue(coche);
            }
        });

    }
}
