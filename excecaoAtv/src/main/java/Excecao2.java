public class Excecao2 extends Exception {
    public Excecao2(String mensagem) {
        super(mensagem);
    }

    public void gerarExcecao2() throws Excecao2 {
        throw new Excecao2("Exceção 2 acabou de acontecer!");
    }
}
