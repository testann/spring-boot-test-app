package app.controllers;

import org.springframework.web.bind.annotation.*;
import app.requests.ping.PingRequest;
import app.requests.ping.PingResponse;
import app.requests.BaseResponse;

@RestController
@RequestMapping("/ping")

public class TestController {

    @GetMapping
    public BaseResponse showStatus() {

        return new BaseResponse("Success", 1);

    }

    @PostMapping("/advanced")
    public PingResponse advanced(@RequestBody PingRequest request) {

        final PingResponse response;

        if ( request.getUser().equalsIgnoreCase("testann") ) {
            response = new PingResponse("Success", 1, 13);
        }
        else {
            response = new PingResponse("Error", null, null);

        }

        return response;

    }


}
