package com.tk244.cmcustdb.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tk244.cmcustdb.Repository.UserMapper;
import com.tk244.cmcustdb.entity.Customer;

@Service
public class CustomerSearchService {
    
    @Autowired
    private UserMapper userMapper;

    /**
    * 顧客情報検索
    * @param String customerId リクエストデータ
    * @return Customer 検索結果
    *
    */
    public Customer findOneCustomer(String custId) {
        return userMapper.findOneCustomer(custId);
    }
}
