package model;

public abstract class Usuario implements IUsuario {
	String login;
	String senha;
	int tipo;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public abstract void mostrar();

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(String login, String senha, int tipo) {
		super();
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;
	}
	
	
	

}

