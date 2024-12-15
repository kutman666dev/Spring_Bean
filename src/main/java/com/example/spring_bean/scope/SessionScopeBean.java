package com.example.spring_bean.scope;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope
@Component
public class SessionScopeBean {
    public String getSessionMessage() {
        return " Новый экземпляр для каждого HTTP-сеанса";
    }
}
