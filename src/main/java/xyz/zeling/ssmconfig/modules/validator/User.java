package xyz.zeling.ssmconfig.modules.validator;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Data;

/**
 * @description TODO
 * @author zeling
 * @date 2018年1月27日 下午4:55:32 
 */
@Data
public class User implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 6686856073622658539L;
    @Size(min=3, max=20, message="{validator.language}")
    String username;
    @Email
    String email;
    @CreditCardNumber
    String ccNumber;
    @Pattern(regexp = "^[a-zA-Z]\\w{3,14}$")
    String password;
}
