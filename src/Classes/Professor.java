package Classes;

public class Professor {
    private String nome;
    private int salario;
    private int idade;
    private String cargo;
    private String sexo;

    public Professor(String nome, int salario, int idade, String cargo, String sexo) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.cargo = cargo;
        this.sexo = sexo;
    }

    public void nomeProfessor() {
        System.out.println("nome do professor" + this.nome);
    }
    public void cargoProfessor() {
        System.out.println("cargo do professor" + this.cargo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", idade=" + idade +
                ", cargo='" + cargo + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
