package springCloud.chengda.main.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;
    public CommonResult(Integer code, String message){
        this.code = code;
        this.message = message;
        this.data = null;
    }



    public CommonResult(Integer i, String message, T payment) {
        this.code = i;
        this.message = message;
        this.data  = payment;
    }

}
