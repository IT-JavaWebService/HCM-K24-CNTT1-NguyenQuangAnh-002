package com.rikkei.gaming.exception;

public class GearNotFoundException extends RuntimeException {
    public GearNotFoundException(String message) {
        super(message);
    }
    //cliet thao tac len GamingGear khong ton tai, he thong bat loi va tra ve request 404


}
