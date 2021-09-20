package com.velmar.pvmStore.repositories;

import com.velmar.pvmStore.models.ERole;
import com.velmar.pvmStore.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRespository extends MongoRepository<Role, String> {
    Optional<Role> findByName (ERole name);
}
