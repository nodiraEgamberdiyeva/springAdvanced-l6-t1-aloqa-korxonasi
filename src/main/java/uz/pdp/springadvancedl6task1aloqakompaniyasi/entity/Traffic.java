package uz.pdp.springadvancedl6task1aloqakompaniyasi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.template.AbstractEntityLong;

import javax.persistence.Entity;
import java.math.BigDecimal;
@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Traffic extends AbstractEntityLong {
    private BigDecimal price;
    private BigDecimal commissionPrice;
    private long expiration; //second
    private long internet;   //byte
    private long inLineMinutes; //minute
    private long outLineMinutes; //minute
    private long sms; //byte
    private BigDecimal defaultInternetPrice;
    private BigDecimal defaultInLineMinutesPrice;
    private BigDecimal defaultOutLineMinutesPrice;
    private BigDecimal defaultSmsPrice;




}
