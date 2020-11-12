package edu.fpt.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

public class NavigationAction extends ActionSupport {

    public String home() throws Exception {
        ServletActionContext.getRequest().setAttribute("name","Hien");
        return "success";
    }

}