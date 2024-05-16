package com.group.libraryapp.service.user;

import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.request.UserupdateRequest;
import com.group.libraryapp.dto.user.response.UserResponse;
import com.group.libraryapp.repository.user.UserRepository;
import com.group.libraryapp.service.fruit.FruitService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    private  final UserRepository userRepository;
    private final FruitService fruitService;
    public UserService(UserRepository userRepository,@Qualifier("main") FruitService fruitService){
        this.userRepository=userRepository;
        this.fruitService=fruitService;
    }

    public void updateUser( UserupdateRequest request){

//        boolean isUserNotExist =userRepository.isUserNotExist(jdbcTemplate,request.getId());
       if(userRepository.isUserNotExist(request.getId())){
            throw new IllegalArgumentException();
        }
        userRepository.updateUserName(request.getName(),request.getId());
    }


    public void deleteUser(String name){

        if(userRepository.isUserNotExist(name)){
            throw new IllegalArgumentException();
        }

        userRepository.deleteUser(name);

    }

    public void saveUser(UserCreateRequest request){
        userRepository.saveUser(request.getName(), request.getAge());
    }


    public List<UserResponse> getUsers(){
        return userRepository.getUsers();
    }


}
