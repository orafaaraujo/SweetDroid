package com.orafaaraujo.sweetdroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // O reporte de crashs (erros) do aplicativo só estará habilitado para builds apotando para
        // o ambiente de Testes e ambiente de Produção.
        // Isso evitará que o aplicativo fique enviando os erros que aconterá enquanto estiver
        // desenvolvendo.
        if (BuildConfig.REPORT_CRASH) {
            // Iniciar serviço de reportar crashs!
        }

        //noinspection ConstantConditions
        findViewById(R.id.main_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }
}
