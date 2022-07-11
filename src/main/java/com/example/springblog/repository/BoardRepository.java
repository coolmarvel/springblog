package com.example.springblog.repository;

import com.example.springblog.model.Board;
import com.example.springblog.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Integer> {
    List<Board> findAllByUserOrderByIdDesc(User user);

    Page<Board> findByCategory(Pageable pageable, String category);
}
