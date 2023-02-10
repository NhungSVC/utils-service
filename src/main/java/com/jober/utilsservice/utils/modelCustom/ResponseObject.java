package com.jober.utilsservice.utils.modelCustom;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseObject {
    private String status;
    private String code;
    private String message;
    private Long totalCount;
    private Integer currentCount;
    private Object data;

    public ResponseObject(String status, String code, String message, Object data) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public ResponseObject() {}

}
