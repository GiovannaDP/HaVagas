package com.ifsp.giovanna.havagas;

public class Formulario {

    private String nome;
    private String email;
    private String receberEmails;
    private String tipoTelefone;
    private String numeroTelefone;
    private String telefoneCelular;
    private String sexo;
    private String dataNascimento;
    private String formacao;
    private String anoFormatura;
    private String anoConclusao;
    private String instituicao;
    private String tituloMonografia;
    private String orientador;
    private String vagasDeInteresse;

    public Formulario() {
    }

    public Formulario(String nome, String email, String receberEmails, String tipoTelefone, String numeroTelefone, String telefoneCelular, String sexo, String dataNascimento, String formacao, String anoFormatura, String anoConclusao, String instituicao, String tituloMonografia, String orientador, String vagasDeInteresse) {
        this.nome = nome;
        this.email = email;
        this.receberEmails = receberEmails;
        this.tipoTelefone = tipoTelefone;
        this.numeroTelefone = numeroTelefone;
        this.telefoneCelular = telefoneCelular;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.formacao = formacao;
        this.anoFormatura = anoFormatura;
        this.anoConclusao = anoConclusao;
        this.instituicao = instituicao;
        this.tituloMonografia = tituloMonografia;
        this.orientador = orientador;
        this.vagasDeInteresse = vagasDeInteresse;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReceberEmails() {
        return receberEmails;
    }

    public void setReceberEmails(String receberEmails) {
        this.receberEmails = receberEmails;
    }

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAnoFormatura() {
        return anoFormatura;
    }

    public void setAnoFormatura(String anoFormatura) {
        this.anoFormatura = anoFormatura;
    }

    public String getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(String anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getTituloMonografia() {
        return tituloMonografia;
    }

    public void setTituloMonografia(String tituloMonografia) {
        this.tituloMonografia = tituloMonografia;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getVagasDeInteresse() {
        return vagasDeInteresse;
    }

    public void setVagasDeInteresse(String vagasDeInteresse) {
        this.vagasDeInteresse = vagasDeInteresse;
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "nome: '" + nome + '\'' +
                ", email: '" + email + '\'' +
                ", receber emails: '" + receberEmails + '\'' +
                ", telefone: '" + tipoTelefone + '\'' +
                ", numero do telefone: '" + numeroTelefone + '\'' +
                ", telefone celular: '" + telefoneCelular + '\'' +
                ", sexo: '" + sexo + '\'' +
                ", data de nascimento: '" + dataNascimento + '\'' +
                ", formacao: '" + formacao + '\'' +
                ", ano de formatura: '" + anoFormatura + '\'' +
                ", ano de conclusao: '" + anoConclusao + '\'' +
                ", instituicao: '" + instituicao + '\'' +
                ", titulo de monografia: '" + tituloMonografia + '\'' +
                ", orientador: '" + orientador + '\'' +
                ", vagas de interesse: '" + vagasDeInteresse + '\'' +
                '}';
    }
}
