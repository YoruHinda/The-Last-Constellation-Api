package com.github.yoruhinda.TheLastConstellation.repository;

import com.github.yoruhinda.TheLastConstellation.model.Wish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishRepository extends JpaRepository<Wish, Long> {
}
