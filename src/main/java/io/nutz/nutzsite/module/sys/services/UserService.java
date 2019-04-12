package io.nutz.nutzsite.module.sys.services;

import io.nutz.nutzsite.common.base.Service;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;
import io.nutz.nutzsite.module.sys.models.User;

/**
 * 用户 服务层实现
 * 
 * @author haiming
 * @date 2019-04-12
 */
@IocBean(args = {"refer:dao"})
public class UserService extends Service<User> {
	public UserService(Dao dao) {
		super(dao);
	}
}