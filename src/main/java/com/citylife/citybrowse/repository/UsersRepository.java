package com.citylife.citybrowse.repository;


import java.time.ZonedDateTime;

import org.jadira.usertype.spi.repository.BaseRepository;
import com.citylife.citybrowse.model.User;
public interface UsersRepository extends BaseRepository<User, Long> {

	public User findUserByUsername(String username);
	public User findUserByUsernameAndPassword(String username,String password);
	public User findUserBycreationDate(ZonedDateTime date);
	
	
}
