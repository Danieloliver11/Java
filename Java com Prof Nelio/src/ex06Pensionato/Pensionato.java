package ex06Pensionato;

public class Pensionato {
	private String nome;
	private String email;
	private int room;
	
	public Pensionato(String nome, String email, int room) {
		super();
		this.nome = nome;
		this.email = email;
		this.room = room;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}
	
	
	
	
}
