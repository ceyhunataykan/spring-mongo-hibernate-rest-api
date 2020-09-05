package com.ceyhunataykan.api;

public class KullaniciNotFoundException extends RuntimeException {
    public KullaniciNotFoundException(String id) {
        super("Kullanıcı Bulunamadı : " + id);
    }
}
