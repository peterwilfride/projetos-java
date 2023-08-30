package tv.app.entity;

import java.util.Date;

public class Usuario {
    
    private Long id;
    private String username;
    private String password;
    private Date expiration;

    public Usuario() {}

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
        this.expiration = null;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public boolean estaExpirado() {
        if (this.expiration == null || this.expiration.before(new Date(System.currentTimeMillis()))) {
            return true;
        }
        return false;
    }

    public String getDataExpiracao() {
        return this.expiration.toString();
    }
}
