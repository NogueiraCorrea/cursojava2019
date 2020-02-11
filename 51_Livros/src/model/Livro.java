package model;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "livros")


public class Livro {

	
	
	public static final String ISBN_FIELD_NAME ="isbn";
	public static final String TITULO_FIELD_NAME ="titulo";
	public static final String EDICAO_FIELD_NAME ="edicao";
	public static final String ANO_FIELD_NAME ="ano";
	public static final String FORMATO_FIELD_NAME ="formato";
	public static final String PAGAMENTO_FIELD_NAME ="pagamento";
	public static final String EDITORA_FIELD_NAME ="editora";
	public static final String AUTOR_FIELD_NAME ="autor";
	
	@DatabaseField(generatedId = true)
	private int id;

	@DatabaseField(columnName = ISBN_FIELD_NAME, canBeNull = false)
	private long isbn;

	@DatabaseField(columnName = TITULO_FIELD_NAME)
	private String titulo;
	
	//Exemplo //int isbn = 9786590053817;
	private int edicao;
	private int ano;
	private String formato; 
	private int paginas;
	private String editora;
	private String autor;
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Livro(long isbn, String titulo, int edicao, int ano, String formato, int paginas, String editora,
			String autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.edicao = edicao;
		this.ano = ano;
		this.formato = formato;
		this.paginas = paginas;
		this.editora = editora;
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Livro [isbn=" + isbn + ", titulo=" + titulo + ", edicao=" + edicao + ", ano=" + ano + ", formato="
				+ formato + ", paginas=" + paginas + ", editora=" + editora + ", autor=" + autor + ", getIsbn()="
				+ getIsbn() + ", getTitulo()=" + getTitulo() + ", getEdicao()=" + getEdicao() + ", getAno()=" + getAno()
				+ ", getFormato()=" + getFormato() + ", getPaginas()=" + getPaginas() + ", getEditora()=" + getEditora()
				+ ", getAutor()=" + getAutor() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
