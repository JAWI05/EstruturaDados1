public class Pagina {
    String nome_pagina;
    Pagina proxima;

    public Pagina(String nome_pagina) {
        this.nome_pagina = nome_pagina;
        this.proxima = null;
    }
}
