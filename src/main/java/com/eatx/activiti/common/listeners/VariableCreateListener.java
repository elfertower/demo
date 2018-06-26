package com.eatx.activiti.common.listeners;

import org.activiti.engine.delegate.event.ActivitiEvent;
import org.activiti.engine.delegate.event.ActivitiEventListener;
import org.activiti.engine.delegate.event.ActivitiVariableEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 引擎的全局监听器
 * @author: huwenjie
 */

public class VariableCreateListener implements ActivitiEventListener {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void onEvent(ActivitiEvent event) {
        switch (event.getType()) {

            case VARIABLE_CREATED:
                ActivitiVariableEvent variableEvent = (ActivitiVariableEvent) event;
                logger.info("创建了变量: " + variableEvent.getVariableName() + ", 值：" + variableEvent.getVariableValue());
                break;

            default:
            	logger.info("Event received: " + event.getType());
            	break;
        }
    }

    @Override
    public boolean isFailOnException() {
        return false;
    }
}
