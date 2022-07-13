package uz.pdp.springadvancedl6task1aloqakompaniyasi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.enums.Service;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.template.AbstractEntityLong;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Packet extends AbstractEntityLong {
    private String name;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private Service service;
    private long expiration;
    private boolean addable;
    @ManyToMany
    private Set<Traffic> traffic;
}
