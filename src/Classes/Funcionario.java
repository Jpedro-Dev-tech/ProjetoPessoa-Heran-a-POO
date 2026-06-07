package Classes;

public class Funcionario extends Pessoa{
    private int numero;
    private String cargo;
    private double salario;

    public Funcionario(int numero, String cargo, double salario) {
        this.numero = numero;
        this.cargo = cargo;
        this.salario = salario;
    }
    public void almenSalario(double salario){
        this.salario = salario;
    }
    public void funcFuncionario() {
        this.cargo = "Funcionario";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "numero='" + numero + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
