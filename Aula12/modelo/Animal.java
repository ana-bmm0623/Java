package Aula12;

public abstract class Animal {
    private Double peso;
    private Integer idade;
    private Integer membros;

    public abstract void locomover();

    public abstract void alimentar();

    public abstract void emitirSom();

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getMembros() {
        return membros;
    }

    public void setMembros(Integer membros) {
        this.membros = membros;
    }

}
