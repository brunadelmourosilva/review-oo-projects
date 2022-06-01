package br.com.brunadelmouro.youtube.MCollections.test.sort.exemplo.classes;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{

    private String matricula;
    private String nome;
    private static String NOME_CURSO = "Sistemas de Informaçãon";
    private Double notaFinal;

    public Aluno(String matricula, String nome, Double notaFinal) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    @Override
    public int compareTo(Aluno outroAluno) {
        return this.matricula.compareTo(outroAluno.getMatricula());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno outroAluno = (Aluno) o;
        return Objects.equals(notaFinal, outroAluno.notaFinal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notaFinal);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", notaFinal=" + notaFinal +
                '}';
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public static String getNomeCurso() {
        return NOME_CURSO;
    }
}
