package uz.pdp.springadvancedl6task1aloqakompaniyasi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.enums.Region;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.template.AbstractEntityLong;

import javax.persistence.*;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Branch extends AbstractEntityLong {
    @Enumerated(EnumType.STRING)
    private Region region;

    @OneToOne(fetch = FetchType.LAZY)
    private User director;


}
