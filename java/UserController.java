/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Custom_Validation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author HARSH ARAPLE
 */
@ManagedBean
@RequestScoped
public class UserController {
    
    private String name;
    private String output;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public void sayUsername()
    { 
        output = "Your UserName Is  : "+name;
    }
}
