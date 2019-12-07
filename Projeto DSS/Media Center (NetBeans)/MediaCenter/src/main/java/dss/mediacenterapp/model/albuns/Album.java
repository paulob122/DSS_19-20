
package dss.mediacenterapp.model.albuns;

import dss.mediacenterapp.model.conteudo.Conteudo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Album {
    
    //--------------------------------------------------------------------------
    
    private String nome;
    private String categoria;

    private Map<String, Conteudo> conteudo;
    
    //--------------------------------------------------------------------------

    public Album (String nome, String cat) {
        
        this.nome = nome;
        this.categoria = cat;
        
        this.conteudo = new HashMap<>();
    }
    
    //--------------------------------------------------------------------------

    public Map<String, Conteudo> getConteudo() {
        
        return this.conteudo.entrySet()
                            .stream()
                            .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, HashMap::new));
                
    }
    
    public List<Conteudo> getListaConteudo() {
        
        return this.conteudo.values().stream().map(Conteudo::clone).collect(Collectors.toList());
    }
    
    //--------------------------------------------------------------------------        

    public String getNome() {
        
        return this.nome;
    }

    public String getCategoria() {
        
        return this.categoria;
    }

    //--------------------------------------------------------------------------        

    public void addAllConteudo(List<Conteudo> conteudo) {
        
        for (Conteudo c: conteudo) {
            
            this.conteudo.put(c.getNome(), c);
        }
    }   

    public void adicionaConteudo(Conteudo novoC) {
        
        this.conteudo.put(novoC.getNome(), novoC);
    }
    
    public String toString() {
        
        
        return this.nome + " - (" + this.categoria + "): \n" + this.conteudo.toString();
    }

    public boolean hasContent() {
        
        return this.conteudo.size() > 0;
    }
}
