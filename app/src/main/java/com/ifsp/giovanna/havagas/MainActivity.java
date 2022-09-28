package com.ifsp.giovanna.havagas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.ifsp.giovanna.havagas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private Formulario formulario;
    private final static String EDIT_TEXT_NOME = "EDIT_TEXT_NOME";
    private final static String EDIT_TEXT_EMAIL = "EDIT_TEXT_EMAIL";
    private final static String CHECKBOX = "CHECKBOX";
    private final static String SPINNER_TELEFONE = "SPINNER_TELEFONE";
    private final static String EDIT_TEXT_TELEFONE = "EDIT_TEXT_TELEFONE";
    private final static String EDIT_TEXT_CELULAR = "EDIT_TEXT_CELULAR";
    private final static String SEXO = "SEXO";
    private final static String EDIT_TEXT_DATANASCIMENTO = "EDIT_TEXT_DATANASC";
    private final static String SPINNER_FORMACAO = "EDIT_TEXT_FORMACAO";
    private final static String EDIT_TEXT_ANOFORMATURA = "EDIT_TEXT_ANOFORMATURA";
    private final static String EDIT_TEXT_ANOCONCLUSAO = "EDIT_TEXT_ANOCONCLUSAO";
    private final static String EDIT_TEXT_INSTITUICAO = "EDIT_TEXT_INSTITUICAO";
    private final static String EDIT_TEXT_TITULOMONOGRAFIA = "EDIT_TEXT_TITULOMONOGRAFIA";
    private final static String EDIT_TEXT_ORIENTADOR = "EDIT_TEXT_ORIENTADOR";
    private final static String EDIT_TEXT_VAGASINTERESSE = "EDIT_TEXT_VAGASINTERESSE";

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

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString(EDIT_TEXT_NOME, activityMainBinding.nomeEt.getText().toString());
        outState.putString(EDIT_TEXT_EMAIL, activityMainBinding.emailEt.getText().toString());
        outState.putString(CHECKBOX, activityMainBinding.checkBox.isChecked() ? "Sim" : "Não");
        outState.putString(SPINNER_TELEFONE, activityMainBinding.telefoneSp.getSelectedItem().toString());
        outState.putString(EDIT_TEXT_TELEFONE, activityMainBinding.telefoneEt.getText().toString());
        outState.putString(EDIT_TEXT_CELULAR, activityMainBinding.telefoneCelularEt.getText().toString());
        outState.putString(SEXO, activityMainBinding.femininoRb.isChecked() ? "Feminino" : "Masculino");
        outState.putString(SPINNER_FORMACAO, activityMainBinding.formacaoSp.getSelectedItem().toString());
        outState.putString(EDIT_TEXT_ANOFORMATURA, activityMainBinding.anoDeFormaturaEt.getText().toString());
        outState.putString(EDIT_TEXT_ANOCONCLUSAO, activityMainBinding.anoDeFormaturaEt.getText().toString());
        outState.putString(EDIT_TEXT_INSTITUICAO, activityMainBinding.instituicaoEt.getText().toString());
        outState.putString(EDIT_TEXT_TITULOMONOGRAFIA, activityMainBinding.tituloDeMonografiaEt.getText().toString());
        outState.putString(EDIT_TEXT_ORIENTADOR, activityMainBinding.orientadorEt.getText().toString());
        outState.putString(EDIT_TEXT_VAGASINTERESSE, activityMainBinding.vagasdeInteresseEt.getText().toString());
        outState.putString(EDIT_TEXT_DATANASCIMENTO, activityMainBinding.dataNascimentoEt.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        activityMainBinding.nomeEt.setText(savedInstanceState.getString(EDIT_TEXT_NOME));
        activityMainBinding.emailEt.setText(savedInstanceState.getString(EDIT_TEXT_EMAIL));

        if(savedInstanceState.getString(CHECKBOX).equals("Sim")){
            activityMainBinding.checkBox.setChecked(true);
        }else{
            activityMainBinding.checkBox.setChecked(false);
        }

        if(savedInstanceState.getString(SPINNER_TELEFONE).equals("Residencial")){
            activityMainBinding.telefoneSp.setSelection(0);
        }else{
            activityMainBinding.telefoneSp.setSelection(1);
        }

        activityMainBinding.telefoneEt.setText(savedInstanceState.getString(EDIT_TEXT_TELEFONE));
        activityMainBinding.telefoneCelularEt.setText(savedInstanceState.getString(EDIT_TEXT_CELULAR));

        if(savedInstanceState.getString(SPINNER_TELEFONE).equals("")){
            activityMainBinding.adicionarCelularBt.setVisibility(View.VISIBLE);
            activityMainBinding.telefoneCelularLl.setVisibility(View.GONE);
            activityMainBinding.removerCelularBt.setVisibility(View.GONE);

        }else {
            activityMainBinding.telefoneCelularLl.setVisibility(View.VISIBLE);
            activityMainBinding.removerCelularBt.setVisibility(View.VISIBLE);
            activityMainBinding.adicionarCelularBt.setVisibility(View.GONE);
        }

        if(savedInstanceState.getString(SEXO).equals("Feminino")){
            activityMainBinding.femininoRb.setChecked(true);
        }else{
            activityMainBinding.masculinoRb.setChecked(true);
        }

        activityMainBinding.dataNascimentoEt.setText(savedInstanceState.getString(EDIT_TEXT_DATANASCIMENTO));

        switch (savedInstanceState.getString(SPINNER_FORMACAO)){
            case "Fundamental":
                activityMainBinding.formacaoSp.setSelection(0);
                break;
            case "Médio":
                activityMainBinding.formacaoSp.setSelection(1);
                break;
            case "Graduação":
                activityMainBinding.formacaoSp.setSelection(2);
                break;
            case "Especialização":
                activityMainBinding.formacaoSp.setSelection(3);
                break;
            case "Mestrado":
                activityMainBinding.formacaoSp.setSelection(4);
                break;
            case "Doutorado":
                activityMainBinding.formacaoSp.setSelection(5);
                break;
            default:
                activityMainBinding.formacaoSp.setSelection(0);
                break;
        }

        activityMainBinding.anoDeFormaturaEt.setText(savedInstanceState.getString(EDIT_TEXT_ANOFORMATURA));
        activityMainBinding.anoDeConclusaoEt.setText(savedInstanceState.getString(EDIT_TEXT_ANOCONCLUSAO));
        activityMainBinding.instituicaoEt.setText(savedInstanceState.getString(EDIT_TEXT_INSTITUICAO));
        activityMainBinding.tituloDeMonografiaEt.setText(savedInstanceState.getString(EDIT_TEXT_TITULOMONOGRAFIA));
        activityMainBinding.orientadorEt.setText(savedInstanceState.getString(EDIT_TEXT_ORIENTADOR));
        activityMainBinding.vagasdeInteresseEt.setText(savedInstanceState.getString(EDIT_TEXT_VAGASINTERESSE));
    }
}