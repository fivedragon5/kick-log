package com.footsallife.fc.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
public class Member extends BaseEntity {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String name;
    private String phone;
    private LocalDateTime joinedAt;

    @OneToMany(mappedBy = "club")
    private Set<MemberClub> memberClubs = new HashSet<>();
}
