package com.example.spring_bean.scope;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Component
public class RequestScopeBean {
    public String getRequestMessage() {
        return "Новый экземпляр для каждого HTTP-запроса";
    }

    public String getUUID() {
        return java.util.UUID.randomUUID().toString();
    }
}
