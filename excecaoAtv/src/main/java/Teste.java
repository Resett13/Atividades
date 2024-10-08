public class Teste {
    public static void main(String[] args) {
        Excecao1 excecao1 = new Excecao1("Mensagem de Exceção A");
        Excecao2 excecao2 = new Excecao2("Mensagem de Exceção B");

        // Tratando a Exceção A
        try {
            excecao1.gerarExcecao1();
        } catch (Excecao1 e) {
            System.out.println("Tratamento da " + e.getMessage());
        }

        // Tratando a Exceção B
        try {
            excecao2.gerarExcecao2();
        } catch (Excecao2 e) {
            System.out.println("Tratamento da " + e.getMessage());
        }
    }
}
