import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

    // atributos
    private Set<Convidado> convidadoSet;

    // construtor
    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    // metodos
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){

        Convidado convidadoParaRemover = null;
        
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
}
