
package dss.mediacenterapp.model.utilizadores;

public class Utilizador {
    
    /*--------------------------------------------------------------------------*/

    private static final String GUEST = "Guest";
    
    /*--------------------------------------------------------------------------*/

    private String typeOfUser;
    private String email;
    
    /*--------------------------------------------------------------------------*/

    public Utilizador() {
        
        this.typeOfUser = "n/a";
        this.email = "n/a";
    }
    
    /*--------------------------------------------------------------------------*/

    public String getGeneralID() {
    
        return this.typeOfUser;
    }
    
    public void setUserAsGuest() {
        
        this.typeOfUser = GUEST;
    }
    
    /*--------------------------------------------------------------------------*/
    
    
}
