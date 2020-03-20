package app.requests.ping;

import app.requests.BaseResponse;

public class PingResponse extends BaseResponse {

    public Integer level;

    public PingResponse(String status, Integer code, Integer level) {
        super(status, code);
        this.level = level;
    }

}
