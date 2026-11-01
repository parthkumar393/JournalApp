package com.parth.journalApp.service;

import com.parth.journalApp.entity.User;
import com.parth.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindByUserName(){
        User user = userRepository.findByUserName("ram");
        assertNotNull(user);
        assertTrue(!user.getJournalEntries().isEmpty());
    }
}
