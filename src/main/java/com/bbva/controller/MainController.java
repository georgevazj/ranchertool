package com.bbva.controller;

import com.bbva.constant.ViewConstant;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jorge on 7/6/17.
 */

@Controller
@RequestMapping("/tool")
public class MainController {

    private static final Log LOG = LogFactory.getLog(MainController.class);

    @GetMapping("/home")
    public String showIndex(Model model){
        LOG.info("METHOD: showIndex() -- PARAMS: none");
        return ViewConstant.INDEX;
    }

}
