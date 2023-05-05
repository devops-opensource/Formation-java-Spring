package com.formation.lab.service.impl;

import com.formation.lab.dto.UserDto;
import com.formation.lab.entity.User;
import com.formation.lab.mapper.UserMapperImpl;
import com.formation.lab.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(classes = {UserMapperImpl.class})
public class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl simpleService;

    @Mock
    private UserRepository userRepository;

    private final static User user = new User();
    private final String USERNAME = "John";
    @Before
    public void setup(){
        user.setFirstName(USERNAME);
        user.setLastName("Doe");
        user.setEmail("johndoe@mailinator.com");
        user.setPassword("johnIsTheB3st");
    }

    @Test
    public void createUser() {
        when(userRepository.save(any(User.class))).thenReturn(user);
        UserDto result = simpleService.createUser(user);

        Assertions.assertThat(result).isNotNull();
        Assertions.assertThat(result.getFirstName()).isEqualTo(USERNAME);
    }
}