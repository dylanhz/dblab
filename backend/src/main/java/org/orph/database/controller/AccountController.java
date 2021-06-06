package org.orph.database.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.orph.database.entity.Account;
import org.orph.database.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author dylanhz
 * @since 2021-04-26
 */
@RestController
@RequestMapping("/database/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * @return 0 登录成功 101 用户账户未审批 102 密码错误 103 账户不存在
     */
    @PostMapping("loginUser")
    public int loginUser(String username, String password) {
        QueryWrapper<Account> wrapper = new QueryWrapper<Account>();
        wrapper.eq("username", username);
        int res = accountService.count(wrapper);
        if (1 == res) {
            Account account = accountService.getOne(wrapper);
            if (password.equals(account.getPassword())) {
                if (account.getVerification()) {
                    return 0;
                } else {
                    return 101;
                }
            } else {
                return 102;
            }
        }
        return 103;
    }

    /**
     * @return 0 登录成功 102 密码错误 103 账户不存在
     */
    @PostMapping("loginAdmin")
    public int loginAdmin(String username, String password) {
        QueryWrapper<Account> wrapper = new QueryWrapper<Account>();
        wrapper.eq("username", username);
        int res = accountService.count(wrapper);
        if (1 == res) {
            Account account = accountService.getOne(wrapper);
            if (password == account.getPassword()) {
                return 0;
            } else {
                return 102;
            }
        }
        return 103;
    }

    /**
     * @return 0 注册成功 104 用户名已被占用
     */
    @PostMapping("register")
    public int register(String username, String password) {
        QueryWrapper<Account> wrapper = new QueryWrapper<Account>();
        wrapper.eq("username", username);
        int res = accountService.count(wrapper);
        if (0 == res) {
            Account account = new Account();
            account.setUsername(username);
            account.setPassword(password);
            account.setType(true);
            account.setVerification(false);
            accountService.save(account);
            return 0;
        }
        return 104;
    }

    /**
     * @return 0 审批通过 100 操作失败
     * @apiNote 前端确保选择用户尚未审批
     */
    @PostMapping("verify")
    public int verify(String username) {
        UpdateWrapper<Account> updateWrapper = new UpdateWrapper<Account>();
        updateWrapper.eq("username", username).set("verification", 1);
        boolean res = accountService.update(null, updateWrapper);
        if (res) {
            return 0;
        }
        return 100;
    }

    /**
     * @return 0 获取成功
     */
    @GetMapping("getUnapprovedAccountList")
    public List<Account> getUnapprovedAccountList() {
        QueryWrapper<Account> wrapper = new QueryWrapper<Account>();
        wrapper.eq("type", 1).eq("verification", 0);
        return accountService.list(wrapper);
    }

}

