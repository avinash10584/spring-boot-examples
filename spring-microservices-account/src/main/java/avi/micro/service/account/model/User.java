package avi.micro.service.account.model;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Document(collection = "users")
@JsonIgnoreProperties(value = { "target" })
public class User {
    
    private boolean active = true;
    
    @Id
    @Email(message = "{email.invalid}")
    private String email;
    
    @NotEmpty(message = "Last name is compulsory")
    @Pattern(regexp = "[a-z-A-Z]*", message = "{lastname.invalid.chars}")
    private String lastName;
    
    @NotEmpty(message = "Last name is compulsory")
    @Pattern(regexp = "[a-z-A-Z]*", message = "{firstname.invalid.chars}")
    private String firstName;
    
    @Past(message = "Last login date should be set in past")
    private Date lastLogin;
    
    private String password;
}
