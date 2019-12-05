
package dss.mediacenterapp.model.conteudo;

public class Conteudo {
    
    //--------------------------------------------------------------------------
    
    private String nome;
    private String artista;
    private boolean isMusic;
    private boolean isVideo;
    private String filepath;
    private String categoria;
    
    //--------------------------------------------------------------------------

    public Conteudo (String nome,
                     String artista,
                     boolean music,
                     boolean video,
                     String path,
                     String cat) {
        
        
        this.nome = nome;
        this.artista = artista;
        this.isMusic = music;
        this.isVideo = video;
        this.filepath = path;
        this.categoria = cat;
    }
    
    public Conteudo (Conteudo novo) {
        
        this.nome = novo.getNome();
        this.artista = novo.getArtista();
        this.categoria = novo.getCategoria();
        this.isMusic = novo.getIsMusic();
        this.isVideo = novo.getIsVideo();
        this.filepath = novo.getFilePath();
    }
    
    //--------------------------------------------------------------------------
    
    public Conteudo clone() {
        
        return new Conteudo(this);
    }

    public String toString() {
        
        return this.nome + "\n";
    }
    
    //--------------------------------------------------------------------------

    public String getNome() {
        
        return this.nome;
    }

    private String getArtista() {
        
        return this.artista;
    }

    private String getCategoria() {
        
        return this.categoria;
    }

    private boolean getIsMusic() {
        
        return this.isMusic;
    }

    private boolean getIsVideo() {
        
        return this.isVideo;
    }

    private String getFilePath() {
        
        return this.filepath;
    }

}