package com.ms.springboot.loginapp.repository;

import com.ms.springboot.loginapp.model.Login;
import com.ms.springboot.loginapp.model.Response;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmployeeRepository     {


    @PersistenceContext
    private EntityManager entityManager;


    @Transactional
    public Object isValidUser(Login login){
        Query q = entityManager.createNativeQuery("SELECT count(*) FROM login_user a WHERE a.name ='"+login.getName()+"' and a.password ='"+login.getPassword()+"'");

        //Query q = entityManager.createNativeQuery("SELECT count(*) FROM login_user");

        int count  = Integer.parseInt(q.getResultList().get(0).toString());
            if(count>0){
                Response response = new Response();
                response.setResponseStr("GBOTFlag{SQLInjectionHacker}");
                return response;
            };
            return null;
    }

}
