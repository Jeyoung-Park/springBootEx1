package com.example.restfulwebservice.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//repository를 이용하면 select 등의 쿼리문 없이도 간단히 db 조회 가능
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
