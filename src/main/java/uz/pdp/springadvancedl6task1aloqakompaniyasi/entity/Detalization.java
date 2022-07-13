package uz.pdp.springadvancedl6task1aloqakompaniyasi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.enums.DetalizationType;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.template.AbstractEntityUUID;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Detalization extends AbstractEntityUUID {
    @Enumerated(EnumType.STRING)
    private DetalizationType detalizationType;
    @ManyToOne
    private SimCard simCard;

    private Timestamp startTime;
    private Timestamp endTime;
    private long bytes;


}
