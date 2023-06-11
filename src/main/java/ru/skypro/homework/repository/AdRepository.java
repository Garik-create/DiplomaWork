package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skypro.homework.model.AdEntity;

import java.util.List;

public interface AdRepository extends JpaRepository<AdEntity, Integer> {

    boolean existsByUserEntityEmail(String userName);

    List<AdEntity> findAllByUserEntityEmail(String userName);
}
