package cs.prudkytomas.farmersmarketbe.serivce;

import cs.prudkytomas.farmersmarketbe.repository.SellerRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SellerService {

    private final SellerRepository sellerRepository;
    private final ModelMapper modelMapper;
}
