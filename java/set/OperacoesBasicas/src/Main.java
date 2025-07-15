public class Main {
    public static void main(String[] args) throws Exception {

        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do set de convidados");

        conjuntoConvidado.adicionarConvidado("Convidado 1", 1234);

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do set de convidados");

        conjuntoConvidado.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidado.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidado.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidado.adicionarConvidado("Convidado 4", 1236);

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do set de convidados");
        conjuntoConvidado.exibirConvidados();
    }
}
