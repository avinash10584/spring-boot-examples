package io.readily.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "users")
public class User {
    
    private boolean active;
    
    @Email(message = "Email Address is not a valid format")
    private String email;
    
    @NotEmpty(message = "Last name is compulsory")
    @Pattern(regexp = "[a-z-A-Z]*", message = "Last name has invalid characters")
    private String lastName;
    
    @NotEmpty(message = "Last name is compulsory")
    @Pattern(regexp = "[a-z-A-Z]*", message = "First name has invalid characters")
    private String firstName;
    
    @Past(message = "Last login date should be set in past")
    private Date lastLogin;
    
    List<Subscription> subscriptions;        
}
