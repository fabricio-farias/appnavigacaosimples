import java.io.Serializable;

/**
 * Created by aluno on 22/05/2018.
 */

public class Contato implements Serializable{

    private static final long serialVersionUID = 1L;

    private String nome;
    private int fone;
    private String email;

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
