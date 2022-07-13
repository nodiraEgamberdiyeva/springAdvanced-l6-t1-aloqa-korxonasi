package uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.template;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public class AbstractEntityLong extends AbstractAuditEntity {
    @Id
    @GeneratedValue
    private UUID id;
}
