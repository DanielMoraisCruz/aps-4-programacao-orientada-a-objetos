import java.io.IOException;

public class App {

    public static void limpar_tela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void linha_dupla() {
        System.out.println("========================================");
    }

    public static void main(String[] args) throws Exception {
        limpar_tela();
        Pessoa p1 = new Pessoa();
        p1.mostrar_dados();
        linha_dupla();

        Pessoa p2 = new Pessoa("João", 20, "111.111.111-11");
        p2.mostrar_dados();
        linha_dupla();

        Pessoa p3 = new Pessoa("Maria", 30, "222.222.222-22");
        p3.mostrar_dados();
        linha_dupla();
    }
}
