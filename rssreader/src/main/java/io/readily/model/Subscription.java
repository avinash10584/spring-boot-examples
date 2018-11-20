package io.readily.model;

import java.util.Date;
import javax.validation.constraints.NotEmpty;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "subscription")
public class Subscription {

    private boolean requiresAuthentication;
    
    private Date modifiedDate;
    
    private String permanentlyRemoved;
    
    @NotEmpty
    private String feedURL;
    
    private String title;
    
    private boolean enabled;
    
    @NotEmpty
    private String eTag;
    
    @NotEmpty
    private String link;
    
    private String permanentRedirectedUrl;
    
    private String description;
}
