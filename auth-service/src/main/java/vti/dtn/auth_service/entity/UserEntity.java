package vti.dtn.auth_service.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import vti.dtn.auth_service.entity.enums.Role;

import java.util.Collection;
import java.util.List;


@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class UserEntity implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", length = 20, nullable = false)
    private String username;

    @Column(name = "firstname", length = 20, nullable = true)
    private String firstName;

    @Column(name = "lastname", length = 20, nullable = true)
    private String lastName;

    @Column(name = "email", length = 50, nullable = false)
    private String email;

    @Column(name = "password", length = 120, nullable = false)
    private String password;

    @Column(name = "access_token", length = 255, nullable = true)
    private String accessToken;

    @Column(name = "refresh_token", length = 255, nullable = true)
    private String refreshToken;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

}
