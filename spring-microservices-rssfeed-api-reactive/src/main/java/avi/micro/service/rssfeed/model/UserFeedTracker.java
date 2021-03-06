package avi.micro.service.rssfeed.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "user-feed")
public class UserFeedTracker {

    private boolean read;
    
    @NotEmpty
    private User user;
    
    @NotEmpty
    private SubscriptionFeed feed;
    
    @NotEmpty
    private Subscription subscription;        
}
