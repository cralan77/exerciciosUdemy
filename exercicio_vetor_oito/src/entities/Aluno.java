package entities;

public class Aluno {

    private String nome;
    private double notaUm;
    private double notaDois;

    public Aluno(String nome, double notaUm, double notaDois) {
        this.nome = nome;
        this.notaUm = notaUm;
        this.notaDois = notaDois;
    }

    public double media(){
        return (double) (this.notaUm + this.notaDois) /2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaUm() {
        return notaUm;
    }

    public void setNotaUm(double notaUm) {
        this.notaUm = notaUm;
    }

    public double getNotaDois() {
        return notaDois;
    }

    public void setNotaDois(double notaDois) {
        this.notaDois = notaDois;
    }

    @Override
    public String toString() {
        return "Nome: "+this.nome+"\nMedia: "+media();
    }
}
