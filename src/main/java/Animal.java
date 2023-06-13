public class Animal {
    private String nome;
    private boolean hospedado;
    private Tutor tutor;

    public Animal(String nome, boolean hospedado, Tutor tutor) {
        this.nome = nome;
        this.hospedado = hospedado;
        this.tutor = tutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isHospedado() {
        return hospedado;
    }

    public void setHospedado(boolean hospedado) {
        this.hospedado = hospedado;
    }

    public String getNomeTutor() { return this.tutor.getNome(); }
}
