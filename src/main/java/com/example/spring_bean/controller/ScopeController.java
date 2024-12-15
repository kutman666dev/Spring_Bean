package com.example.spring_bean.controller;

import com.example.spring_bean.service.SingletonService;
import com.example.spring_bean.component.PrototypeComponent;
import com.example.spring_bean.scope.RequestScopeBean;
import com.example.spring_bean.scope.SessionScopeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class ScopeController {

    @Autowired
    private SingletonService singletonService;

    @Autowired
    private PrototypeComponent prototypeComponent;

    @Autowired
    private RequestScopeBean requestScopeBean;

    @Autowired
    private SessionScopeBean sessionScopeBean;

    @GetMapping("/singleton")
    public String getSingletonMessage() {
        return singletonService.getMessage();
    }

    @GetMapping("/prototype")
    public String getPrototypeMessage() {
        return prototypeComponent.generateUUID();
    }

    @GetMapping("/request")
    public String getRequestMessage() {
        return requestScopeBean.getRequestMessage();
    }

    @GetMapping("/session")
    public String getSessionMessage() {
        return sessionScopeBean.getSessionMessage();
    }
}
