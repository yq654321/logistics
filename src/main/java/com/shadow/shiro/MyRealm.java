package com.shadow.shiro;

import com.shadow.dao.UserDao;
import com.shadow.entity.UserEntity;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.web.servlet.ShiroHttpSession;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * 自定义Realm实现认证，实现授权
 *
 * @author Administrator
 */

public class MyRealm extends AuthorizingRealm {
    @Resource
    UserDao userDao;

    /**
     * 用于的权限的认证。
     *
     * @param principalCollection
     * @return
     */
// 为当前登陆成功的用户授予权限和角色，已经登陆成
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取用户名
        String uname = (String) principalCollection.getPrimaryPrincipal(); //获取用户名
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        Set<String> roleName = t_userService.findRoles(username) ;
//        Set<String> permissions = t_userService.findPermissions(username) ;
        info.setRoles(userDao.getRole(uname));
        info.setStringPermissions(userDao.getAuthorization(uname));
        return info;

    }

    /**
     * 首先执行这个登录验证
     *
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException {
        //获取用户输入的用户名和密码
        UsernamePasswordToken token2 = (UsernamePasswordToken) token;
        //获取用户账号
        String uname = token2.getUsername();
        String password = token2.getPassword().toString();
        System.out.println("用户输入的值：" + uname + " " + password);
        //查询数据库
        //  userDao.login(uname);
//        userDao.getUpwd(String uname);

        //   String dataPwd= UserEntity;//数据库查询到的密码

        // AuthenticationInfo info=new SimpleAuthenticationInfo(UserE,dataPwd,"");
        //   return info;
        //     String uname=(String) token.getPrincipal();
        UserEntity userEntity = userDao.getByUsername(uname);
        System.out.println("userEntity" + userEntity);

        if (userEntity != null) {
            AuthenticationInfo info = new SimpleAuthenticationInfo(userEntity.getUname(), userEntity.getPassword(), "myRealm");
            return info;
        } else {
            return null;
        }
    }
}


