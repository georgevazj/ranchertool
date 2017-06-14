package com.bbva.controller;

import com.bbva.constant.ViewConstant;
import com.bbva.entity.User;
import com.bbva.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Jorge on 14/6/17.
 */

@Controller
@RequestMapping("/users")
public class UserController {

    private static final Log LOG = LogFactory.getLog(UserController.class);

    @Autowired
    private UserService userService;

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/userform")
    public String addUserForm(@RequestParam(name="username", required = false) String username,
                          Model model){
        LOG.info("METHOD: addUserForm() -- " + ViewConstant.USERS);

        User user = new User();
        model.addAttribute("user", user);
        return ViewConstant.USERS;
    }


}
