package indie.lukivan8.GrantEdu.model.repository;

import indie.lukivan8.GrantEdu.model.entity.Grant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrantRepo extends JpaRepository<Grant, Long> {
}
