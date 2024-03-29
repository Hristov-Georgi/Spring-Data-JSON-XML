package JSONProcessing.carDealerExercise.service;

import JSONProcessing.carDealerExercise.entity.supplier.SupplierDataExportDTO;
import JSONProcessing.carDealerExercise.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService{

    private final SupplierRepository supplierRepository;

    @Autowired
    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }


    @Override
    public List<SupplierDataExportDTO> selectAllLocalSuppliers() {

        return this.supplierRepository.findByImporterFalse();
    }
}
