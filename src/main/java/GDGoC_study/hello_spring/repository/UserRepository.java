package GDGoC_study.hello_spring.repository;
import GDGoC_study.hello_spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {
}
