package uz.pdp.springadvancedl6task1aloqakompaniyasi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.enums.USSDCode;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.template.AbstractEntityLong;

import javax.persistence.Entity;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UssdCode extends AbstractEntityLong {
    private USSDCode ussdCode;
    private String description;
}
