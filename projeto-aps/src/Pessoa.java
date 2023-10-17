public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;


    public Pessoa() {
        this.nome = "Fulano";
        this.idade = 0;
        this.cpf = "000.000.000-00";
    }

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void mostrar_dados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
    }

    public void set_nome(String nome) {
        this.nome = nome;
    }

    public void set_idade(int idade) {
        this.idade = idade;
    }

    public void set_cpf(String cpf) {
        this.cpf = cpf;
    }

    public String get_nome() {
        return this.nome;
    }

    public int get_idade() {
        return this.idade;
    }

    public String get_cpf() {
        return this.cpf;
    }

}
