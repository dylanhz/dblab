package org.orph.database.service.impl;

import org.orph.database.entity.Account;
import org.orph.database.mapper.AccountMapper;
import org.orph.database.service.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dylanhz
 * @since 2021-04-26
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

}
