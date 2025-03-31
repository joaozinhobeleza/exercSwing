public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        double conta = (nota1 + nota2) / 2;
        return conta;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + " | Média: " + calcularMedia();
    }

}

