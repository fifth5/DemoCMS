package com.democms.wallet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wallet")
public class WalletController {

    @RequestMapping("/jsp")
    public String walletJsp(){

        return "wallet/walletPage";
    }
}
