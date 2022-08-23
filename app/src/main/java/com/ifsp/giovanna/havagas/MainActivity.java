package com.ifsp.giovanna.havagas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.ifsp.giovanna.havagas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private Formulario formulario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.adicionarCelularBt.setOnClickListener(view -> {
            activityMainBinding.telefoneCelularLl.setVisibility(View.VISIBLE);
            activityMainBinding.removerCelularBt.setVisibility(View.VISIBLE);
            activityMainBinding.adicionarCelularBt.setVisibility(View.GONE);
        });

        activityMainBinding.removerCelularBt.setOnClickListener(view -> {
            activityMainBinding.adicionarCelularBt.setVisibility(View.VISIBLE);
            activityMainBinding.telefoneCelularLl.setVisibility(View.GONE);
            activityMainBinding.removerCelularBt.setVisibility(View.GONE);
        });


        activityMainBinding.formacaoSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0 || i == 1) {
                    activityMainBinding.fundamentalOUmedio.setVisibility(View.VISIBLE);
                    activityMainBinding.outraFormacao.setVisibility(View.GONE);
                    activityMainBinding.mestradoOUdoutorado.setVisibility(View.GONE);
                } else if (i == 2 || i == 3) {
                    activityMainBinding.outraFormacao.setVisibility(View.VISIBLE);
                    activityMainBinding.mestradoOUdoutorado.setVisibility(View.GONE);
                    activityMainBinding.fundamentalOUmedio.setVisibility(View.GONE);
                } else {
                    activityMainBinding.mestradoOUdoutorado.setVisibility(View.VISIBLE);
                    activityMainBinding.outraFormacao.setVisibility(View.VISIBLE);
                    activityMainBinding.fundamentalOUmedio.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

        activityMainBinding.salvarBt.setOnClickListener(view -> {
            formulario = new Formulario(
                   activityMainBinding.nomeEt.getText().toString(),
                   activityMainBinding.emailEt.getText().toString(),
                    activityMainBinding.checkBox.isChecked()? "Sim" : "Não",
                    activityMainBinding.telefoneSp.getSelectedItem().toString(),
                    activityMainBinding.telefoneEt.getText().toString(),
                    activityMainBinding.telefoneCelularEt.getText().toString(),
                    activityMainBinding.femininoRb.isChecked()? getString(R.string.feminino) : getString(R.string.masculino),
                    activityMainBinding.dataNascimentoEt.getText().toString(),
                    activityMainBinding.formacaoSp.getSelectedItem().toString(),
                    activityMainBinding.anoDeFormaturaEt.getText().toString(),
                    activityMainBinding.anoDeConclusaoEt.getText().toString(),
                    activityMainBinding.instituicaoEt.getText().toString(),
                    activityMainBinding.tituloDeMonografiaEt.getText().toString(),
                    activityMainBinding.orientadorEt.getText().toString(),
                    activityMainBinding.vagasdeInteresseEt.getText().toString()
            );
            Toast.makeText(this, formulario.toString(), Toast.LENGTH_SHORT).show();
        });

        activityMainBinding.limparBt.setOnClickListener(view -> {
            activityMainBinding.nomeEt.setText("");
            activityMainBinding.emailEt.setText("");
            activityMainBinding.checkBox.setChecked(false);
            activityMainBinding.telefoneSp.setSelection(0);
            activityMainBinding.telefoneEt.setText("");
            activityMainBinding.telefoneCelularEt.setText("");
            activityMainBinding.femininoRb.setChecked(true);
            activityMainBinding.dataNascimentoEt.setText("");
            activityMainBinding.formacaoSp.setSelection(0);
            activityMainBinding.anoDeFormaturaEt.setText("");
            activityMainBinding.anoDeConclusaoEt.setText("");
            activityMainBinding.instituicaoEt.setText("");
            activityMainBinding.tituloDeMonografiaEt.setText("");
            activityMainBinding.orientadorEt.setText("");
            activityMainBinding.vagasdeInteresseEt.setText("");

            formulario = null;
        });
    }
}