package com.example.spring_bean.service;

import org.springframework.stereotype.Service;

@Service
public class SingletonService {

    public String getMessage() {
        return "Это Singleton Bean: Один экземпляр бина на всё приложение";
    }
}
