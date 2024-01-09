package jdbc;

@Entity
public class Produto {

	@Id
	@GenerateValue(strategy = GenerationType.IDENTITY);
	private Long id;
	private String nome;
	private Double preco;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Produto(Long id, String nome, Double preco) {
		
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	public Produto() {
		
	}
	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	
	
	
}
