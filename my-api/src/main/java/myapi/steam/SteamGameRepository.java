package myapi.steam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SteamGameRepository extends
        JpaRepository<SteamGame, Integer>,
        JpaSpecificationExecutor<SteamGame> {
}
