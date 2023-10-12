package br.com.danrley.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUSerRepository extends JpaRepository<UserModel, UUID> {
  UserModel findByUsername(String username);
}
