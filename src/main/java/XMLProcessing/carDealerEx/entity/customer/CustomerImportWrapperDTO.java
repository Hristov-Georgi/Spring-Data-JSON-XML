package XMLProcessing.carDealerEx.entity.customer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.List;

@XmlRootElement(name = "customers")
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerImportWrapperDTO implements Serializable {

    @XmlElement(name = "customer")
    private List<CustomerImportDTO> customers;

    public CustomerImportWrapperDTO() {
    }

    public List<CustomerImportDTO> getCustomers() {
        return customers;
    }
}
