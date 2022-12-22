package sh.love.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sh.love.jpa.domain.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
}
