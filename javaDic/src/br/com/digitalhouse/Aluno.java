package br.com.digitalhouse;

public class Aluno {
    private int ra;
    private String Nome;
    private String sobrenome;
    private Curso curso;

    public Aluno (int ra, String nome, String sobrenome, Curso curso) {
        this.ra = ra;
        Nome = nome;
        this.sobrenome = sobrenome;
        this.curso = curso;
    }

    public Aluno() {
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    @Override
    public boolean equals(Object outroAluno){
        if (!(outroAluno instanceof  Aluno)){
            return false;
        }
          if(((Aluno) outroAluno).getRa() == this.getRa() && ((Aluno) outroAluno).getNome().equals(this.getNome())){
               return true;
        }else {
              return false;
          }
    }

    public int hashCode() {
        return ra + getNome().hashCode();
    }
}
