/**
 *
 * @author Jo Ran  jl_ran@163.com   woshare.top
 * @time 2017-9-6 23:26:08
 *
 */


package top.woshare.springbootdemo.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import top.woshare.springbootdemo.domain.User;
import top.woshare.springbootdemo.repository.UserRepository;

@Service
@Transactional
public class UserService {
    
    @Resource
    private  UserRepository userRepository;

    public User find(Long id) {
        return userRepository.findOne(id);
    }

    public User save(User user) {
        return userRepository.save(user);
    }
    
    
}
