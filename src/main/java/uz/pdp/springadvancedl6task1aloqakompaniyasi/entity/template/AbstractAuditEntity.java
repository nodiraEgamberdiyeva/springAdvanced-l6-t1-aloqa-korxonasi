package uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.template;

import com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.UUID;


@Data
public abstract class AbstractAuditEntity {
    @CreatedBy
    private User user;
    @CreatedDate
    private Timestamp createdAt;
    @UpdateTimestamp
    private Timestamp updatedAt;
    @LastModifiedBy
    private User updatedBy;


}
