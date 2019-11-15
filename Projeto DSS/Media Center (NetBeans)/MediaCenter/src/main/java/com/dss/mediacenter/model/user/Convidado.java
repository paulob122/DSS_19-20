
package com.dss.mediacenter.model.user;

public class Convidado extends Utilizador {
 
    /*--------------------------------------------------------------------------*/
    
    private String GuestID;
    private int id;

    /*--------------------------------------------------------------------------*/

    public Convidado(int ID) {
        
        this.GuestID = "Guest" + ID;
        this.id = ID;
    }
    
    /*--------------------------------------------------------------------------*/

    public int getID () {
        
        return this.id;
    }
    
    public String getGeneralID() {
        
        return this.toString();
    }
    
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Guest").append(this.id);
        
        return  sb.toString();
    }

    /*--------------------------------------------------------------------------*/
    
}
