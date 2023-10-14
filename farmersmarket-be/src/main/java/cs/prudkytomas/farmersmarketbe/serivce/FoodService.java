package cs.prudkytomas.farmersmarketbe.serivce;

import cs.prudkytomas.farmersmarketbe.domain.AppUser;
import cs.prudkytomas.farmersmarketbe.domain.Food;
import cs.prudkytomas.farmersmarketbe.dto.AppUser.DtoAppUserOut;
import cs.prudkytomas.farmersmarketbe.dto.Food.DtoFoodIn;
import cs.prudkytomas.farmersmarketbe.dto.Food.DtoFoodOut;
import cs.prudkytomas.farmersmarketbe.repository.FoodRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;
    private final ModelMapper modelMapper;

    private DtoFoodOut convertToDto(Food food) {
        DtoFoodOut dtoFoodOut = modelMapper.map(food, DtoFoodOut.class);
        return dtoFoodOut;
    }

    public DtoFoodOut getFood(Long id) {
        return convertToDto(foodRepository.findById(id).orElse(null));
    }


    public List<DtoFoodOut> getFood() {
        List<DtoFoodOut> listDtos = foodRepository.findAll()
                                                    .stream()
                                                    .filter(Objects::nonNull)
                                                    .map(this::convertToDto)
                                                    .collect(Collectors.toList());
        return listDtos;
    }

    public DtoFoodOut createFood(DtoFoodIn dtoFoodIn) {
        Food food = new Food();
        return convertToDto(foodRepository.save(food));
    }

    public DtoFoodOut deleteFood(Long id) {
        Food food = foodRepository.getReferenceById(id);
        foodRepository.delete(food);
        return convertToDto(food);
    }

    public DtoFoodOut updateFood(Long id, DtoFoodIn dtoFoodIn) {
        Food food = foodRepository.getReferenceById(id);
        return convertToDto(foodRepository.save(food));
    }
}
