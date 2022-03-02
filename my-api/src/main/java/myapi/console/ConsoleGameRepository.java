package myapi.console;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ConsoleGameRepository extends
        JpaRepository<ConsoleGame, Integer>,
        JpaSpecificationExecutor<ConsoleGame> {
}
