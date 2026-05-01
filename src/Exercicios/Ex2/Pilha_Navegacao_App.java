public class Pilha_Navegacao_App {
    Pagina topo;

    public Pilha_Navegacao_App() {
        this.topo = null;
    }

    public void Adicionar_Pagina(String nome_Pagina){
        Pagina novaPagina = new Pagina(nome_Pagina);

        novaPagina.proxima = topo;
        topo = novaPagina;
    }

    public void Historico_Navegacao(){
        if(topo == null){
            System.out.println("O histórico de navegação está vazio.");
        }
        else{
            Pagina temp = topo;
            while(temp != null){
                System.out.println("'"+temp.nome_pagina+"'");
                temp = temp.proxima;
            }
        }
    }

    public void Pagina_Anterior(){
        System.out.println("A pesquisa anterior: "+topo.nome_pagina);
    }

    public void Remover_Atual(){
        if(topo == null){
            System.out.println("O histórico de navegação está vazio.");
        }
        else{
            System.out.println("A pesquisa "+topo.nome_pagina+" foi excluida.");
            topo = topo.proxima;
        }
    }

    public void Verificar_Hist_vazio(){
        if(topo == null){
            System.out.println("O histórico de navegação está vazio.");
        }
        else{
            System.out.println("O histórico não está vazio.");
        }
    }
}
