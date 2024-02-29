import java.util.Scanner;
public class alunoTeste {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Qual seu nome ?");
        String nome = read.nextLine();
        System.out.println("Quantos anos você tem ?");
        short idade = read.nextShort();
        System.out.println("Qual o seu sexo ?");
        char sexo = read.next().charAt(0);
        System.out.println("Qual sua altura ?");
        float altura = read.nextFloat();

        Aluno aluno = new Aluno();

        aluno.nome = nome;
        aluno.idade = idade;
        aluno.sexo = sexo;
        aluno.altura = altura;

        read.close();
        aluno.estudar();

    }
}
