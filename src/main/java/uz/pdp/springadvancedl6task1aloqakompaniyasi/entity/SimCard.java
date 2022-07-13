package uz.pdp.springadvancedl6task1aloqakompaniyasi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.enums.Permission;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.enums.SystemRole;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.template.AbstractEntityLong;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.template.AbstractEntityUUID;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data@AllArgsConstructor@NoArgsConstructor
public class SimCard extends AbstractEntityUUID {
    @Column(
            nullable = false,
            unique = true
    )
    private String simNumber;
    private String code;
    private String forCompany;
    @ManyToOne
    private User user;
    @ManyToOne
    private Traffic traffic;
    @ManyToMany
    private Set<InfoService> infoServices;
    private BigDecimal balance;


}
