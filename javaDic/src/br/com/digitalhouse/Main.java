package br.com.digitalhouse;

import java.util.HashMap;
import java.util.List;
import  java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Curso fullstack = new Curso("Fullstack");
        Curso mobileAndroid = new Curso("Mobile Android");
        Aluno vini = new Aluno(10,"Vinicius","Oliveira",fullstack);
        Aluno vinao = new Aluno(23,"Vini","Oliveira",fullstack);

        System.out.println(vini.hashCode());

    }
}
