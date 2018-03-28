package br.com.paulosalvatore.ocean_codelab_android_27_03_18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvNome;
    private TextView tvEmail;
    private TextView tvTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNome = (TextView) findViewById(R.id.tvNome);
        tvEmail = (TextView) findViewById(R.id.tvEmail);
        tvTelefone = (TextView) findViewById(R.id.tvTelefone);

        Intent intent = getIntent();

        String nome = intent.getStringExtra("nome");
        String email = intent.getStringExtra("e-mail");
        String telefone = intent.getStringExtra("telefone");

        tvNome.setText(nome);
        tvEmail.setText(email);
        tvTelefone.setText(telefone);
    }
}
