package com.project.shoppingmall.controller;

import com.project.shoppingmall.config.auth.SessionUser;
import com.project.shoppingmall.entity.purchase.Purchase;
import com.project.shoppingmall.service.Purchase.PurchaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {
        private final PurchaseService purchaseService;
        private final HttpSession httpSession;

        @GetMapping("/")
        public String index(Model model) {
            model.addAttribute("purchase", purchaseService.findAllPost() );

            SessionUser user = (SessionUser)httpSession.getAttribute("user");

            if(user != null) {
                model.addAttribute("userName", user.getName());
            }

            return "index";
    }
}
