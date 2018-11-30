package io.rssreader.model;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "subscription")
public class Subscription {

    private boolean requiresAuthentication;
    
    private Date modifiedDate;
    
    private boolean permanentlyRemoved;
    
    @NotEmpty
    private String feedURL;
    
    private String title;
    
    private boolean enabled;
    
    @DBRef(lazy=true)
    private User user;
    
    private String permanentRedirectedUrl;
    
    private String description;
}
