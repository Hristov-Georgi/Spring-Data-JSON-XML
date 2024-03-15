package XMLProcessing.productShopExercise.repository;

import XMLProcessing.productShopExercise.entities.user.User;
import XMLProcessing.productShopExercise.entities.user.UsersWithSoldProductsDTO;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    @Query("SELECT u FROM User u" +
            " WHERE" +
            " (" +
            " SELECT COUNT(p) FROM u.soldProducts p" +
            " WHERE p.buyer IS NOT NULL" +
            ") > 0" +
            " ORDER BY u.lastName, u.firstName")
    List<User> findAllWithSoldProductsWithBuyer();


    @Query("SELECT u FROM User u" +
            " WHERE SIZE(u.soldProducts) > 0" +
            " ORDER BY SIZE(u.soldProducts) Desc, u.lastName Asc")
    List<User> findAllWithSoldProducts();
}
