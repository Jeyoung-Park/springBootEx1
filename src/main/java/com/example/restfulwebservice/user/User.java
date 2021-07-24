package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value={"password", "ssn"})
//@JsonFilter("UserInfo")
@ApiModel(description = "사용자 상세 정보를 위한 도메인 객체")
public class User {
    private Integer id;

    @Size(min = 2, message="Name은 2 글자 이상 입력해주세요.")
    @ApiModelProperty(notes = "사용자 이름을 입력해 주세요.")
    private String name;
    @Past
    @ApiModelProperty(notes = "사용자의 등록일을 입력해주세요.")
    private Date joinDate;

//    @JsonIgnore //클라이언트에서 조회할 때 이 값이 나타나지 않음
    @ApiModelProperty(notes = "사용자 패스워드을 입력해 주세요.")
    private String password;
    //    @JsonIgnore
    @ApiModelProperty(notes = "사용자 주민등록번호을 입력해 주세요.")
    private String ssn;
}
