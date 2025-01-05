package h9uu.jpa_study.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Member")
public class MemberEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String username;

    protected MemberEntity() {

    }

    public MemberEntity(String username) {
        this.username = username;
    }
}
