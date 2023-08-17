package uz.pdp.userservice.domain.entity.user;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.userservice.domain.entity.BaseEntity;

import java.util.List;

@Entity(name = "role")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleEntity extends BaseEntity {
    @Column(unique = true)
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<PermissionEntity> permissions;
}
