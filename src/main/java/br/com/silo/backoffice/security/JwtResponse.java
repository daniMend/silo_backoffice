package br.com.silo.backoffice.security;

import java.io.Serializable;

public class JwtResponse implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;

    private final String jwttoken;

    private long expireAt;

    private long id;

    private String nome;

    private long empresaId;

    public JwtResponse(String jwttoken, long expireAt, long id, String nome, long empresaId) {
        this.jwttoken = jwttoken;
        this.expireAt = expireAt;
        this.id = id;
        this.nome = nome;
        this.empresaId = empresaId;
    }

    public String getToken() {
        return this.jwttoken;
    }

    public long getId() {
        return id;
    }

    public long getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(long expireAt) {
        this.expireAt = expireAt;
    }

    public String getNome() {
        return this.nome;
    }

    public long getEmpresaId() { return this.empresaId; }
}
