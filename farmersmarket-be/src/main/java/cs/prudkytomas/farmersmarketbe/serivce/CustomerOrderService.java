package cs.prudkytomas.farmersmarketbe.serivce;

import cs.prudkytomas.farmersmarketbe.domain.AppUser;
import cs.prudkytomas.farmersmarketbe.domain.CustomerOrder;
import cs.prudkytomas.farmersmarketbe.dto.AppUser.DtoAppUserOut;
import cs.prudkytomas.farmersmarketbe.dto.CustomerOrder.DtoCustomerOrderOut;
import cs.prudkytomas.farmersmarketbe.repository.CustomerOrderRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomerOrderService {

    private final CustomerOrderRepository customerOrderRepository;
    private final ModelMapper modelMapper;

    private DtoCustomerOrderOut convertToDto(CustomerOrder customerOrder) {
        DtoCustomerOrderOut dtoCustomerOrderOut = modelMapper.map(customerOrder, DtoCustomerOrderOut.class);
        return dtoCustomerOrderOut;
    }

    public List<DtoCustomerOrderOut> getAllOrders() {
        List<DtoCustomerOrderOut> list = customerOrderRepository.findAll().stream().filter(Objects::nonNull).map(this::convertToDto).collect(Collectors.toList());
        return null;
    }
}
