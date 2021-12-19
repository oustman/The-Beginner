package com.epam.pmt.factory;

import com.epam.pmt.operation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class OperationFactory {
    private static final Map<String, Operation> OPERATIONS = new HashMap<>();
    @Autowired
    private ApplicationContext applicationContext;




    @PostConstruct
    private void init() {
        setOperationsInstance();
    }

    public void setOperationsInstance() {
        OPERATIONS.put("OPTION1", applicationContext.getBean(StorePasswordAccountDetailsOperation.class));
        OPERATIONS.put("OPTION2", applicationContext.getBean(DisplaySpecificAccountOperation.class));
        OPERATIONS.put("OPTION3", applicationContext.getBean(UpdatePasswordAccountDetailsOperation.class));
        OPERATIONS.put("OPTION4", applicationContext.getBean(DeletePasswordAccountOperation.class));
        OPERATIONS.put("OPTION5", applicationContext.getBean(DisplayAllAccountsOperation.class));
        OPERATIONS.put("OPTION6", applicationContext.getBean(RenameGroupOperation.class));
        OPERATIONS.put("OPTION7", applicationContext.getBean(DeleteGroupOperation.class));
        OPERATIONS.put("OPTION8", null);
    }

    public Operation getOperationInstance(String key) throws IllegalArgumentException {
        if (OPERATIONS.containsKey(key))
            return OPERATIONS.get(key);
        else
            throw new IllegalArgumentException();
    }
}
