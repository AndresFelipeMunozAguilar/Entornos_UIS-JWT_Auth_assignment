<<<<<<< HEAD
package com.uis.jwt_auth_login.mappers;


import com.uis.jwt_auth_login.dto.SignUpDto;
import com.uis.jwt_auth_login.dto.UserDto;
import com.uis.jwt_auth_login.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto userDto);
}
=======
package com.uis.jwt_auth_login.mappers;


import com.uis.jwt_auth_login.dto.SignUpDto;
import com.uis.jwt_auth_login.dto.UserDto;
import com.uis.jwt_auth_login.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto userDto);
}
>>>>>>> origin/sergioB
