package uz.pdp.springadvancedl6task1aloqakompaniyasi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.SimCard;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.enums.TypeOfPayment;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.template.AbstractEntityUUID;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment extends AbstractEntityUUID {
    private Timestamp paymentDate;
    @ManyToOne
    private SimCard simCard;
    private BigDecimal amount;
    private TypeOfPayment typeOfPayment;
}
