package com.kakaopay.project.repository;

import com.kakaopay.project.entity.RoomEntity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
@EnableJpaRepositories(basePackages = {"eventdb"})
@EntityScan(basePackages = {"eventdb"})
@Configuration
public interface RoomRepository extends CrudRepository<RoomEntity, String> {
    Optional<RoomEntity> findById(UUID uuid);
    RoomEntity findTopByOrderByIdAsc();
    RoomEntity findTopByOrderByIdDesc();
}