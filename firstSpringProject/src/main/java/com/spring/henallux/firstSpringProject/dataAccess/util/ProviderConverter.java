package com.spring.henallux.firstSpringProject.dataAccess.util;

import com.spring.henallux.firstSpringProject.dataAccess.entity.MagicKeyEntity;
import com.spring.henallux.firstSpringProject.dataAccess.entity.UserEntity;
import com.spring.henallux.firstSpringProject.model.User;
import org.springframework.stereotype.Service;

@Service
public class ProviderConverter {

    public MagicKeyEntity FormToEntity (String magicKeyForm) {
        MagicKeyEntity magicKeyEntity = new MagicKeyEntity();
        magicKeyEntity.setKey(magicKeyForm);
        return magicKeyEntity;
    }

    public String EntityToForm (MagicKeyEntity magicKeyEntity) {
        return magicKeyEntity.getKey();
    }

    public UserEntity userModelToUserEntity(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(user.getName());
        userEntity.setAge(user.getAge());
        userEntity.setMale(user.getMale());
        userEntity.setHobby(user.getHobby());
        return  userEntity;
    }

    public User userEntityToUserModel(UserEntity userEntity) {
        User user = new User();
        user.setName(userEntity.getName());
        user.setAge(userEntity.getAge());
        user.setMale(userEntity.getMale());
        user.setHobby(userEntity.getHobby());
        return user;
    }
}
