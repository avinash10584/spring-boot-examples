package io.readily.model;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "subscription-feed")
public class SubscriptionFeed {

    @NotEmpty
    private String feedId;
    
    @NotEmpty
    private String entryID;
    
    @Max(500)
    @NotEmpty(message="Feed description is mandatory")
    private String description;
    
    @Max(200)
    @NotEmpty(message="Feed title is mandatory")
    private String title;
    
    private String summary;
    
    private Date publishedDate;
    
    @NotEmpty
    private String link;
}
