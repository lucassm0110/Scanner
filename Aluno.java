package GetAndSets;

public class Aluno {

    private String nome;
    privete int idade;
    double altura;
    int cpf;

    public Aluno(String nome, int idade, double altura, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }


