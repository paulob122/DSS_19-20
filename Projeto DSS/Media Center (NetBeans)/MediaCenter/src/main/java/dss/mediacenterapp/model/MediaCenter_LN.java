
package dss.mediacenterapp.model;

import dss.mediacenterapp.data.UtilizadorDAO;
import dss.mediacenterapp.model.utilizadores.Utilizador;
import dss.pubsub.DSSObservable;

public class MediaCenter_LN extends DSSObservable {
    
    //--------------------------------------------------------------------------
    
    private Utilizador utilizadorAtual;

    //--------------------------------------------------------------------------

    private UtilizadorDAO utilizadorDB;
    
    //--------------------------------------------------------------------------

    public MediaCenter_LN () {
        
        this.utilizadorDB = new UtilizadorDAO();
    }
 
    public boolean loginUtilizador(String Email, String Password) {
        
        boolean loginOK = false;
        
        if (this.utilizadorDB.containsKey(Email)) {
            
            Utilizador userAtual = this.utilizadorDB.get(Email);
            
            this.utilizadorAtual = userAtual;
            
            loginOK = true;
            
        } else {
            
            loginOK = false;
        }
       
        return loginOK;
    }

    public String getUtilizadorAtualID() {
        
        return this.utilizadorAtual.getGeneralID();
    }
    
}
