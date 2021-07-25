package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue
    private Integer id;

    private String description;

    //User : Post -> 1 : (0~N), 1 대 다 관계
    @ManyToOne(fetch= FetchType.LAZY) //지연 로딩 방식 ->
    @JsonIgnore
    private User user;
}
