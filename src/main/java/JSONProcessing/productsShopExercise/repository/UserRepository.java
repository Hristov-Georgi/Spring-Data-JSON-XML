package JSONProcessing.productsShopExercise.repository;

import JSONProcessing.productsShopExercise.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u " +
            " FROM User u" +
            " JOIN u.soldProducts p" +
            " WHERE p.buyer IS NOT NULL" +
            " ORDER BY u.lastName ASC, u.firstName ASC")
    List<User> findBySoldProductsWithBuyer();



}
