public class Main
 {
    public static void main(String[] args) throws Exception {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 12345);
        agendaContatos.adicionarContato("Camila", 54321);
        agendaContatos.adicionarContato("Camila Cavalcanti", 987654);
        agendaContatos.adicionarContato("Camila DIO", 555444);
        agendaContatos.adicionarContato("Maria Silva", 111222);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        agendaContatos.atualizarNumeroContato("Maria SIlva", 222333);

        agendaContatos.exibirContatos();
    }
}
