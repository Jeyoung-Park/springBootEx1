package com.example.restfulwebservice.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

//user에 관련된 비즈니스 로직
@Service
public class UserDaoService {
    private static List<User> users=new ArrayList<>();

    private static int usersCount=3;

    static {
        users.add(new User(1, "Kenneth", new Date(), "pass1", "123456-1234567"));
        users.add(new User(2, "Kenneth", new Date(), "pass2", "123456-1234567"));
        users.add(new User(3, "Kenneth", new Date(), "pass3", "123456-1234567"));
    }

    public List<User> findAll(){
        return  users;
    }

    public User save(User user){
        if(user.getId()==null){
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id){
        for(User user:users){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

    public User deleteById(int id){
        Iterator<User> iterator=users.iterator();

        while(iterator.hasNext()){
            User user=iterator.next();

            if(user.getId()==id){
                iterator.remove();
                return user;
            }
        }

        return null;
    }

    public User updateById(int id, User user){
        Iterator<User> iterator=users.iterator();

        while(iterator.hasNext()){
            User myUser=iterator.next();

            if(myUser.getId()==id){
                myUser.setName(user.getName());
                myUser.setJoinDate(user.getJoinDate());
                return myUser;
            }
        }
        return null;
    }
}
