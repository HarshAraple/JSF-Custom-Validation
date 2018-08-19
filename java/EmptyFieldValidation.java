/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Custom_Validation;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author HARSH ARAPLE
 */
@FacesValidator(value = "Custom_Validation.EmptyFieldValidation" )
public class EmptyFieldValidation implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  
        if(value!=null)
        {
            if(value.toString().trim().equals(""))
            {
                FacesMessage msg = new FacesMessage(component.getAttributes().get("label")+ " is empty");
                msg.setSeverity(FacesMessage.SEVERITY_WARN);
                throw new ValidatorException(msg);
            
            }
        }
    
    }
    
    
    
}
