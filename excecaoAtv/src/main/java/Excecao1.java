public class Excecao1 extends Exception {
    public Excecao1(String mensagem) {
        super(mensagem);
    }

    public void gerarExcecao1() throws Excecao1 {
        throw new Excecao1("Exceção 1 acabou de acontecer!");
    }
}
