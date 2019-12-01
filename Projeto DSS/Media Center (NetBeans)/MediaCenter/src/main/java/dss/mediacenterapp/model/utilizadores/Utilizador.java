
package dss.mediacenterapp.model.utilizadores;

public class Utilizador {
    
    /*--------------------------------------------------------------------------*/

    private static final String GUEST = "Guest";
    private static final String REG = "Registred";
    private static final String ADM = "Admin";
    private static final String TMP = "Temporary User";
    
    /*--------------------------------------------------------------------------*/

    private String typeOfUser;
    
    private String email;
    private String password;
    private String nome;
    private boolean isTemporaryUser;
    private boolean isAdministrator;
    
    /*--------------------------------------------------------------------------*/

    public Utilizador(String mail, 
                      String password, 
                      String nome, 
                      boolean isTempraryUser, 
                      boolean isAdministrator) {
        
        if (isAdministrator) {
            
            this.typeOfUser = "Administrator";
        
        } else if (isTemporaryUser) {
            
            this.typeOfUser = "Temporary User";
        
        } else {
            
            this.typeOfUser = "Registred";
        }
        
        this.email = mail;
        this.password = password;
        this.nome = nome;
        this.isTemporaryUser = isTempraryUser;
        this.isAdministrator = isAdministrator;
    }

    public Utilizador() {
        
        this.typeOfUser = GUEST;
        
        this.email = "n/a";
        this.nome = "n/a";
        this.password = "n/a";
        this.isAdministrator = false;
        this.isTemporaryUser = false;
    }
    
    /*--------------------------------------------------------------------------*/

    public String getGeneralID() {
    
        return this.typeOfUser + ": " + this.email;
    }
    
    public void setUserAsGuest() {
        
        this.typeOfUser = GUEST;
    }
    
    /*--------------------------------------------------------------------------*/
    
    public String toString () {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Type of User: " + this.typeOfUser + "\n");
        sb.append("E-Mail: " + this.email + "\n");
        sb.append("Nome: " + this.nome + "\n");
        sb.append("Password: " + this.password + "\n");
        sb.append("Temporary: " + this.isTemporaryUser + "\n");
        sb.append("Admin: " + this.isAdministrator + "\n");
        
        return sb.toString();
    }

    public boolean verificaCredenciais(String Password) {
        
        return this.password.equals(Password);
    }
}
