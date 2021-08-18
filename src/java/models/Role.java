
package models;

import java.io.Serializable;


public class Role implements Serializable{

    public static void add(Role role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String userRole;
    private int roleID;

    public Role() {
    }

    public Role(int roleID, String userRole) {
        this.roleID = roleID;
        this.userRole = userRole;
    }

    public String getRole() {
        return userRole;
    }

    public void setRole(String userRole) {
        this.userRole = userRole;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }
    
}