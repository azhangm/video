package nuc.zm.server.exception;

/**
 * 全局异常枚举类
 * @description : 收集常见异常
 * @author zm
 * @date 2023/05/13
 */
public  enum ExceptionEnum {
    SYSTEM_FAIL(500,"系统异常");
    private Integer  code;
    private String message;

    ExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
