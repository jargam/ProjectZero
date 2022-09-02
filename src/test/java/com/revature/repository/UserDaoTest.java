package com.revature.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.revature.models.Member;
import com.revature.models.User;
import com.revature.repository.exceptions.UserNotFoundException;

@TestInstance(Lifecycle.PER_CLASS)
public class UserDaoTest {
	
	@Mock
	private UserDaoInterface uDao;
	
	private User validMember;
	
	@BeforeAll
	void setup() {
		MockitoAnnotations.openMocks(this);
		
		validMember = new Member(2, "firstName", "lastName", "username", "password", "email@email.com");
	}
	
	@Test
	public void getUserWithCorrectUsernameTest() throws UserNotFoundException {
		Mockito.when(uDao.getUser(validMember.getUsername(), validMember.getPassword())).thenReturn(validMember);
	
	assertEquals(validMember, uDao.getUser("username", "password"));
	}
	
	@Test
	public void getUserWithIncorrectUsernameTest() throws UserNotFoundException {
		Mockito.when(uDao.getUser("InvalidUsername", "password")).thenThrow(UserNotFoundException.class);
		assertThrows(UserNotFoundException.class, () -> uDao.getUser("InvalidUsername", "password"));
		
	}
	
}
