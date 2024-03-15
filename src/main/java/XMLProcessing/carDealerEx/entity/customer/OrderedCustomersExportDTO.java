package XMLProcessing.carDealerEx.entity.customer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "customers")
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderedCustomersExportDTO {

    @XmlElement(name = "customer")
    private List<OrderedCustomersDTO> customers;

    public OrderedCustomersExportDTO(){}

    public OrderedCustomersExportDTO(List<OrderedCustomersDTO> customers) {
        this.customers = customers;
    }

    public List<OrderedCustomersDTO> getCustomers() {
        return customers;
    }
}
