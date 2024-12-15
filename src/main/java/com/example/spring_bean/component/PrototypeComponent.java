package com.example.spring_bean.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope("prototype")
public class PrototypeComponent {

    public String generateUUID() {
        return "Новый экземпляр на каждый запрос. " + UUID.randomUUID();
    }
}
