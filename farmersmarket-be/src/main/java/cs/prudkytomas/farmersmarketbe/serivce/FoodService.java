package cs.prudkytomas.farmersmarketbe.serivce;

import cs.prudkytomas.farmersmarketbe.repository.FoodRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;
    private final ModelMapper modelMapper;
}
