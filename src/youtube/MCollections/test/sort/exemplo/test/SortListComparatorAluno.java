package br.com.brunadelmouro.youtube.MCollections.test.sort.exemplo.test;


import br.com.brunadelmouro.youtube.MCollections.test.sort.exemplo.classes.Aluno;
import br.com.brunadelmouro.youtube.MCollections.test.sort.exemplo.classes.SortListNomeAluno;
import br.com.brunadelmouro.youtube.MCollections.test.sort.exemplo.classes.SortListNotaAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Criar uma classe aluno
*  atributos: nome, nota final, matricula, nomeCurso(estático)
*  sobrescrever os métodos: toString, equals, hashCode, onde:
*  toString: mostrar todos os alunos da lista
*  equals e hashCode: verificar quais objetos possuem a mesma nota final(polimorfismo)
*
*  criar uma lista do tipo Aluno;
*  gerar uma lista de ordenação de alunos para: 'nomes' em ordem alfabética e 'notas' em ordem decrescente
*  utilizando a interface Comparator;
*  gerar uma lista de ordenação de alunos para: 'matricula' utilizando a interface Comparable;
*
*
* */
public class SortListComparatorAluno {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("20201940022", "Bruna Delmouro", 9.1);
        Aluno a2 = new Aluno("20201940000", "Vitoria Maria", 10d);
        Aluno a3 = new Aluno("20211980000", "Aline Santos", 6.19);
        Aluno a4 = new Aluno("20191940007", "Roberto Cunha", 3.6);
        Aluno a5 = new Aluno("20211940008", "Alex Silva", 10d);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a5);

        System.out.println(Aluno.getNomeCurso());

        System.out.println("Imprimindo lista default\n");
        for (Aluno aluno: alunos) {
            System.out.println(aluno);
        }
        System.out.println("-------------------------");

        System.out.println("Objetos com mesma nota final\n");
        System.out.println("a1 e a2: " + a1.equals(a2));
        System.out.println("a2 e a5: " + a2.equals(a5));
        System.out.println("hashCode de a1: " + a1.hashCode());

        System.out.println("-------------------------");
        System.out.println("Ordenando lista de alunos por nomes - Interface Comparator\n");
        Collections.sort(alunos, new SortListNomeAluno());
        for (Aluno aluno: alunos) {
            System.out.println(aluno);
        }

        System.out.println("-------------------------");
        System.out.println("Ordenando lista de alunos por notas decrescentes - Interface Comparator\n");
        Collections.sort(alunos, Collections.reverseOrder(new SortListNotaAluno())); //static method: reverseOrder
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("-------------------------");
        System.out.println("Ordenando lista de alunos por matricula - Interface Comparable\n");
        Collections.sort(alunos);
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

    }
}
