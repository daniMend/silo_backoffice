package br.com.silo.backoffice.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class JwtUserDetails extends User {
    private long id;
    private long empresaId;

    public JwtUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities, long id, long empresaId) {
        super(username, password, authorities);
        this.id = id;
        this.empresaId = empresaId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return super.getUsername() ;
    }

    public long getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(long empresaId) {
        this.empresaId = empresaId;
    }

}
