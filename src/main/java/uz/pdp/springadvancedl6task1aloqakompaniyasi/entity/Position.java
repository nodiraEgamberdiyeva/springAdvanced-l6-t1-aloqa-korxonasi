package uz.pdp.springadvancedl6task1aloqakompaniyasi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.enums.Permission;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.enums.SystemRole;
import uz.pdp.springadvancedl6task1aloqakompaniyasi.entity.template.AbstractEntityLong;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data@AllArgsConstructor@NoArgsConstructor
public class Position extends AbstractEntityLong {
    private String name;
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    private Branch branch;
    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;

    @Enumerated(EnumType.STRING)
    private SystemRole systemRole;


    @ElementCollection(targetClass = Permission.class)
    @Enumerated(EnumType.STRING)
    private Set<Permission> permissions;


}
