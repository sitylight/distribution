package cd.featrue.repository.impl;

import cd.featrue.mapper.UserMapper;
import cd.featrue.model.User;
import cd.featrue.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author lcb 2019/7/27
 */

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserMybatisRepository implements UserRepository {
    private final UserMapper userMapper;

    @Override
    public void save(User user) {
        if (user.getId() == null) {
            userMapper.insertSelective(user);
        } else {
            userMapper.updateByPrimaryKeySelective(user);
        }
    }
}
