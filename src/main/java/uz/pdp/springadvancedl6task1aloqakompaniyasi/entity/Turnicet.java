package uz.pdp.springadvancedl6task1aloqakompaniyasi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.template.AbstractEntityUUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Turnicet extends AbstractEntityUUID {
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    private Timestamp startedWorkTime;
    private Timestamp endedWorkTime;
}
