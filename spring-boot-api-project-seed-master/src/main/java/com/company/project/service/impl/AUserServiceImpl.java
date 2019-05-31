package com.company.project.service.impl;

import com.company.project.dao.AUserMapper;
import com.company.project.model.AUser;
import com.company.project.service.AUserService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/26.
 */
@Service
@Transactional
public class AUserServiceImpl extends AbstractService<AUser> implements AUserService {
    @Resource
    private AUserMapper aUserMapper;

}
