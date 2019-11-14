package com.example.lianfang.generalUtils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Status {

    @Value("SUCCESS")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   public void failure(){
        this.status = "FAILURE";
   }
   public void success(){
        this.status ="SUCCESS";
   }
   public void init(){
       this.status ="SUCCESS";
   }

}
