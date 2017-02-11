package com.isoftstone.finance.managesystem.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

/**
 * Created by issuser on 2017/1/13.
 */
@Controller
public class ConfigHelper {

    @Value("${project.name}")
    private static String projectName;

    public static String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
