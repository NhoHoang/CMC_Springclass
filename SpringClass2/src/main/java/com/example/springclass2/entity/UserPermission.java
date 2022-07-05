package com.example.springclass2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "User_Permission")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(UserPermission.class)
public class UserPermission implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "user_id")
    private int userId;

    @Id
    @Column(name = "permission_id")
    private int permissionId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPermission that = (UserPermission) o;
        return userId == that.userId && permissionId == that.permissionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, permissionId);
    }
}
