package cs.prudkytomas.farmersmarketbe.serivce;

import cs.prudkytomas.farmersmarketbe.domain.Food;
import cs.prudkytomas.farmersmarketbe.domain.Seller;
import cs.prudkytomas.farmersmarketbe.dto.Food.DtoFoodOut;
import cs.prudkytomas.farmersmarketbe.dto.Seller.DtoSellerIn;
import cs.prudkytomas.farmersmarketbe.dto.Seller.DtoSellerOut;
import cs.prudkytomas.farmersmarketbe.repository.SellerRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SellerService {

    private final SellerRepository sellerRepository;
    private final ModelMapper modelMapper;

    private DtoSellerOut convertToDto(Seller seller) {
        DtoSellerOut dtoSellerOut = modelMapper.map(seller, DtoSellerOut.class);
        return dtoSellerOut;
    }

    public List<DtoSellerOut> getAllSellers() {
        List<DtoSellerOut> list = sellerRepository.findAll()
                .stream()
                .filter(Objects::nonNull)
                .map(this::convertToDto)
                .collect(Collectors.toList());
        return list;
    }

    public DtoSellerOut getSeller(Long id) {
        return convertToDto(sellerRepository.findById(id).orElse(null));
    }

    public DtoSellerOut createSeller(DtoSellerIn dtoSellerIn) {
        Seller seller = new Seller();
        // set values to seller
        return convertToDto(sellerRepository.save(seller));
    }

    public DtoSellerOut updateSeller(Long id, DtoSellerIn dtoSellerIn) {
        Seller seller = sellerRepository.findById(id).orElse(null);
        //SET new data for seller
        return convertToDto(sellerRepository.save(seller));
    }

    public DtoSellerOut deleteSeller(Long id) {
        Seller seller = sellerRepository.findById(id).orElse(null);
        //SET new data for seller
        sellerRepository.delete(seller);
        return convertToDto(seller);
    }
}
