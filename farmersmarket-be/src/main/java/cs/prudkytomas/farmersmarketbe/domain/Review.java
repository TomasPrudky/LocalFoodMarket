package cs.prudkytomas.farmersmarketbe.domain;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    private Long id;
    private int rating;
    private String comment;
    private String author;
}