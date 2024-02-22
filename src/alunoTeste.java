public class alunoTeste {
    public static void main(String[] args) {
        Aluno igor = new Aluno();

        igor.nome = "Igor";
        igor.idade = 19;
        igor.sexo = 'M';
        igor.altura = 1.81f;

        igor.estudar();

        Aluno professor = new Aluno();

        professor.nome = "Evandro";
        professor.idade = 38;
        professor.sexo = 'M';
        professor.altura = 1.78f;

        professor.estudar();


    }
}
