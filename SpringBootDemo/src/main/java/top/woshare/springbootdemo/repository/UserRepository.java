/**
 *
 * @author Jo Ran  jl_ran@163.com   woshare.top
 * @time 2017-9-6 23:20:23
 *
 */


package top.woshare.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.woshare.springbootdemo.domain.User;


public interface UserRepository extends JpaRepository<User, Long>{
    
}
