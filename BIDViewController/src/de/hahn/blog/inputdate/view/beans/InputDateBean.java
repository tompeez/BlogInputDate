package de.hahn.blog.inputdate.view.beans;

import java.util.Date;

import javax.faces.event.ActionEvent;

import oracle.adf.share.logging.ADFLogger;

import oracle.adfinternal.view.faces.renderkit.rich.ChooseDateRenderer;


public class InputDateBean {
    private static ADFLogger logger = ADFLogger.createADFLogger(InputDateBean.class);
    private Date beanDate;
    public InputDateBean() {
    }

    public void onSubmit(ActionEvent actionEvent) {
        ChooseDateRenderer c = null;
        // Add event code here...
    }

    public void setBeanDate(Date beanDate) {
        this.beanDate = beanDate;
    }

    public Date getBeanDate() {
        return beanDate;
    }
}
