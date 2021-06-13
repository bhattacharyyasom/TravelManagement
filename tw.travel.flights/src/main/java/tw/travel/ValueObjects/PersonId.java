package tw.travel.ValueObjects;

import lombok.Builder;
import lombok.Value;

@Builder
public class PersonId {
    String name;
    String loginId;

    void setName(String name){
        //insert some validation here
        this.name=name;
    }
    void setLogId(String loginId){
        //inert some validation loginid
        this.loginId=loginId;
    }
}
