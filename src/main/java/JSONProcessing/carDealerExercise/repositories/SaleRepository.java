package JSONProcessing.carDealerExercise.repositories;

import JSONProcessing.carDealerExercise.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer> {
}
