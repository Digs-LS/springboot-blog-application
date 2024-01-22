package com.springboot.blog.repository;

import java.util.Optional;

public interface RoleRepository<Role, Long> {

    Optional<Role> findByName(String name);

}
