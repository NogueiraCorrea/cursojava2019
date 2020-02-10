package model;

public class Aluno extends Usuario {
	int matriculaAluno;
	String nome;
	String turno;
	String turma;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}
	

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluno(String login, String senha, int tipo) {
		super(login, senha, tipo);
		// TODO Auto-generated constructor stub
	}
	

	public Aluno(String login, String senha, int tipo, String nome, String turno, String turma, int matriculaAluno) {
		super(login,senha,tipo);		
		this.matriculaAluno = matriculaAluno;
		this.nome = nome;
		this.turno = turno;
		this.turma = turma;
	}

	@Override
	public void mostrar() {
		System.out.println("Informações do aluno: ");
		System.out.println("Login: " + super.getLogin());
		System.out.println("Senha: *****");
		System.out.println("Matrícula: " + matriculaAluno);
		System.out.println("Nome: " + nome);
		System.out.println("Turno: " + turno);
		System.out.println("Turma: " + turma);
	}
}
