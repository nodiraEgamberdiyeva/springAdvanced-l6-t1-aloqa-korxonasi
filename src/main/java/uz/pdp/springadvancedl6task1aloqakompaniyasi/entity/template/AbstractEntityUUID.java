package uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.template;

import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public abstract class AbstractEntityUUID extends AbstractAuditEntity{
    @Id
    @GeneratedValue
    private UUID id;


}
