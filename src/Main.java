import Classes.Funcionario;
import Classes.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Funcionario f1 = new Funcionario(01,"DevFrontEnd",15068.00);
        Funcionario f2 = new Funcionario(02,"DevBackEnd",18068.00);

        p1.setNome(p1.getNome());
        p2.setNome(p2.getNome());
        f1.setSalario(f1.getSalario());
        f1.setCargo(f1.getCargo());
        f1.setNumero(f1.getNumero());

        p1.setNome("JoaoPedro");
        p2.setNome("Maria");

        System.out.println(p1.getNome());
        System.out.println(p2.getNome());
        System.out.println(f1.getSalario());
        System.out.println(f1.getCargo());
        System.out.println(f1.getNumero());
        System.out.println(f2.getSalario());
        System.out.println(f2.getCargo());
        System.out.println(f2.getNumero());
    }
}
